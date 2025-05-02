abstract class Solid 
{

    abstract double calculateVolume();
}
class Cuboid extends Solid 
{
    private double length, width, height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return length * width * height;
    }
}
class Sphere extends Solid {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
public class SolidTest 
{
    public static void main(String[] args) 
    {
        Cuboid cuboid = new Cuboid(5, 3, 4);
        System.out.println("Volume of Cuboid: " + cuboid.calculateVolume());

        Sphere sphere = new Sphere(3);
        System.out.println("Volume of Sphere: " + sphere.calculateVolume());
    }
}