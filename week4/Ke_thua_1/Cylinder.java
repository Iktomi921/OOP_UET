public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * super.getRadius() * super.getRadius() * PI;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + ']';
    }

    @Override
    public double getArea() {
        return super.getArea() + super.getArea() + (2 * PI * super.getRadius()) * height;
    }

    /**
     * this is main.
     */
    public static void main(String[] args) {
        Cylinder shape = new Cylinder(2, 3);
        System.out.println(shape.getArea());
        System.out.println(shape);
    }
}
