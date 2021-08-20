package flyweight.game;

public class Main {
    public static void main(String[] args) {
        World world = new World();
        world.get3DOject(_3DObjectTypes.Cube)
                .makeVisible()
                .move(10d, -13.3d, 90.0d);
        world.get3DOject(_3DObjectTypes.Sphere)
                .makeVisible()
                .move(11d, -12.9d, 90.0d);
        world.get3DOject(_3DObjectTypes.Cube)
                .makeVisible()
                .move(9d, -12.9d, 90.0d);
    }
}
