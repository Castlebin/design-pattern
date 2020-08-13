package flyweight.game;

public class _3DObject {

    private World world;
    private String name;

    public _3DObject(World world, String name) {
        this.world = world;
        this.name = name;
    }

    public _3DObject makeVisible() {
        return this;
    }

    public void move(double x, double y, double z) {
        System.out.println("Moving object " + name + " in the world");
        world.move(this, new Location(x, y, z));
    }

    @Override
    public String toString() {
        return name;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
