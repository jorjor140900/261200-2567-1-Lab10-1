public class ShapeFactory {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_SQUARE = 2;

    // Limits
    private static final int MAX_EACH_SHAPE = 2;
    private static final int MAX_TOTAL_SHAPES = 5;

    // Counters
    private static int circleCount = 0;
    private static int rectangleCount = 0;
    private static int squareCount = 0;
    private static int totalShapes = 0;

    public static Shape getShape(int shapeType){
        if (totalShapes >= MAX_TOTAL_SHAPES) {
            System.out.println("Shape limit reached. Cannot create more shapes.");
            return null;
        }

        if (shapeType == TYPE_CIRCLE) {
            if (circleCount < MAX_EACH_SHAPE) {
                circleCount++;
                totalShapes++;
                return new Circle();
            } else {
                System.out.println("Circle limit reached. Cannot create more circle.");
            }
        }
        else if (shapeType == TYPE_RECTANGLE) {
            if (rectangleCount < MAX_EACH_SHAPE) {
                rectangleCount++;
                totalShapes++;
                return new Rectangle();
            } else {
                System.out.println("Rectangle limit reached. Cannot create more rectangle.");
            }
        }
        else if (shapeType == TYPE_SQUARE) {
            if (squareCount < MAX_EACH_SHAPE) {
                squareCount++;
                totalShapes++;
                return new Square();
            } else {
                System.out.println("Square limit reached. Cannot create more square.");
            }
        }
        else {
            System.out.println("Invalid shape type.");
        }

        return null;
    }
}