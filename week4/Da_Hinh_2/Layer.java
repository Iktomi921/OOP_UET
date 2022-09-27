import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape other) {
        shapes.add(other);
    }

    /**
     * remove.
     */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(shapes.get(i));
                i--;
            }
        }
    }

    /**
     * info.
     */
    public String getInfo() {
        StringBuilder ans = new StringBuilder("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            ans.append(shape).append("\n");
        }
        return ans.toString();
    }

    /**
     * dup.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size() - 1; i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i) instanceof Circle
                        && shapes.get(j) instanceof Circle) {
                    if (((Circle) shapes.get(i)).hashCode()
                            == ((Circle) shapes.get(j)).hashCode()) {
                        shapes.remove(j);
                        j--;
                    }
                } else if (shapes.get(i) instanceof Rectangle
                        && shapes.get(j) instanceof Rectangle) {
                    if (((Rectangle) shapes.get(i)).hashCode()
                            == ((Rectangle) shapes.get(j)).hashCode()) {
                        shapes.remove(j);
                        j--;
                    }
                }
            }
        }
    }

}