import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * dis.
     */
    public double distance(Point ort) {
        double x = (pointX - ort.pointX) * (pointX - ort.pointX);
        double y = (pointY - ort.pointY) * (pointY - ort.pointY);
        return Math.sqrt(x + y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return Double.compare(point.pointX, pointX) == 0
                && Double.compare(point.pointY, pointY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    public String toString() {
        return "(" + pointX + ',' + pointY + ")";
    }
}
