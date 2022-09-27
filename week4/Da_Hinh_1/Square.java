public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        length = side;
        width = side;
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square["
                + "side=" + width
                + ",color=" + color
                + ",filled=" + filled
                + ']';
    }

}
