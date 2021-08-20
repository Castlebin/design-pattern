package flyweight.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class World {
    private PhysicsEngine engine = new PhysicsEngine();
    private Map<String, _3DObject> objects = new ConcurrentHashMap<>();
    private Map<String, Location> locations = new ConcurrentHashMap<>();

    public _3DObject get3DOject(_3DObjectTypes type) {
        String name = type.toString();
        if (objects.containsKey(name)) {
            return objects.get(name);
        }
        _3DObject obj = make3DObject(type);
        objects.put(obj.getName(), obj);
        return obj;
    }

    private _3DObject make3DObject(_3DObjectTypes type) {
        switch (type) {
            case Cube:
                return new Cube(this, type.toString());
            case Sphere:
                return new Sphere(this, type.toString());
            default:
                return new _3DObject(this, type.toString());
        }
    }

    public void move(_3DObject obj, Location location) {
        final List<String> nearObjectNames = getNearObjects(location);
        locations.put(obj.getName(), location);
        for (String nearObjectName : nearObjectNames) {
            engine.animateCollision(objects.get(nearObjectName), obj);
        }
    }

    private List<String> getNearObjects(Location location) {
        if (objects.size() < 2) {
            return new ArrayList<>();
        }
        return objects.values().stream()
                .filter(obj -> {
                    Location loc = locations.get(obj.getName());
                    return loc != null && loc.isNear(location, 1);
                })
                .map(obj -> obj.getName())
                .collect(Collectors.toList());
    }

}
