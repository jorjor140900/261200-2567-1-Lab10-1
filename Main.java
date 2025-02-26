public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(0);
        if (shape1 != null) shape1.draw();

        Shape shape2 = ShapeFactory.getShape(1);
        if (shape2 != null) shape2.draw();

        Shape shape3 = ShapeFactory.getShape(2);
        if (shape3 != null) shape3.draw();

        Shape shape4 = ShapeFactory.getShape(2);
        if (shape4 != null) shape4.draw();

        Shape shape5 = ShapeFactory.getShape(2);
        if (shape5 != null) shape5.draw();  // Prevents NullPointerException

        Shape shape6 = ShapeFactory.getShape(0);
        if (shape6 != null) shape6.draw();

        Shape shape7 = ShapeFactory.getShape(1);
        if (shape7 != null) shape6.draw();
    }
}
