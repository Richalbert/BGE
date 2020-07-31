import java.util.Random;

public class Tester {
    static final double PRECISION_THRESHOLD = 0.00001;
    static Random random = new Random();

    public static void main(String[] args) {
        verifyAssertionsEnabled();

        testPoint();
        testPointNode();
        testPolygon();
        System.out.println("All tests passed.");
    }

    private static void testPolygon() {
        boolean assertionBool;
        Polygon poly1 = new Polygon();
        Polygon poly2 = new Polygon();
        assert poly1.toString().equals("The polygon has 0 vertices."): "test Polygon toString";
        assertionBool = !poly1.addVertex(null, 1);
        assert assertionBool : "test Polygon addVertex null guard";
        assert poly1.getNextVertex(new Point(0, 0)) == null : "test Polygon getNextVertex";
        assert compareWithPrecision(poly1.calcPerimeter(), 0) : "test Polygon calcPerimeter";
        assert compareWithPrecision(poly1.calcArea(), 0) : "test Polygon calcArea";
        assert !poly1.isBigger(poly2) : "test Polygon isBigger";
        Point point1 = new Point(1, 1);
        assert poly1.highestVertex() == null : "test Polygon";
        assertionBool = poly1.addVertex(point1, 1);
        assert assertionBool : "test Polygon";
        assert poly1.getNextVertex(new Point(0, 0)) == null;
        assert poly1.getNextVertex(point1).equals(point1) : "test Polygon getNextVertex";
        assert !poly1.isBigger(poly2) : "test Polygon isBigger";
        poly2.addVertex(point1, 1);
        assert !poly1.isBigger(poly2) : "test Polygon isBigger";
        assert compareWithPrecision(poly1.calcPerimeter(), 0) : "test Polygon calcPerimeter";
        assert compareWithPrecision(poly1.calcArea(), 0) : "test Polygon calcArea";
        assert poly1.highestVertex().equals(point1) : "test Polygon";

        Point point2 = new Point(point1);
        point2.move(1, 1);
        assertionBool = poly1.addVertex(point2, 2);
        assert assertionBool : "test Polygon";
        assert poly1.getNextVertex(point1).equals(point2) : "test Polygon getNextVertex";
        assert poly1.getNextVertex(point2).equals(point1) : "test Polygon getNextVertex";
        assert !poly1.isBigger(poly2) : "test Polygon isBigger";
        poly2.addVertex(point2, 2);
        assert !poly1.isBigger(poly2) : "test Polygon isBigger";
        assert compareWithPrecision(poly1.calcPerimeter(),  Math.sqrt(2)) : "test Polygon calcPerimeter";
        assert compareWithPrecision(poly1.calcArea(), 0) : "test Polygon calcArea";
        assert poly1.highestVertex().equals(point2) : "test Polygon";

        Point point3 = new Point(point2);
        point3.move(-2, 0);
        assertionBool = poly1.addVertex(point3, 3);
        assert assertionBool : "test Polygon";
        assert poly1.getNextVertex(point1).equals(point2) : "test Polygon getNextVertex";
        assert poly1.getNextVertex(point2).equals(point3) : "test Polygon getNextVertex";
        assert poly1.getNextVertex(point3).equals(point1) : "test Polygon getNextVertex";
        assert poly1.isBigger(poly2) : "test Polygon isBigger";
        poly2.addVertex(point3, 3);
        assert !poly1.isBigger(poly2) : "test Polygon isBigger";
        assert compareWithPrecision(poly1.calcPerimeter(),  2 * Math.sqrt(2) + 2) : "test Polygon calcPerimeter";
        assert compareWithPrecision(poly1.calcArea(), 1) : "test Polygon calcArea";
        assert poly1.highestVertex().equals(new Point(2, 2)) : "test Polygon";

        Point point4 = new Point(point3);
        point4.move(1, 1);
        assertionBool = poly1.addVertex(point4, 3);
        assert assertionBool : "test Polygon";
        assert poly1.getNextVertex(point1).equals(point2) : "test Polygon getNextVertex";
        assert poly1.getNextVertex(point2).equals(point4) : "test Polygon getNextVertex";
        assert poly1.getNextVertex(point4).equals(point3) : "test Polygon getNextVertex";
        assert poly1.getNextVertex(point3).equals(point1) : "test Polygon getNextVertex";
        assert poly1.getNextVertex(null) == null : "test Polygon getNextVertex null defence";
        assert poly1.isBigger(poly2) : "test Polygon isBigger";
        poly2.addVertex(point4, 3);
        assert !poly1.isBigger(poly2) : "test Polygon isBigger";
        assert compareWithPrecision(poly1.calcPerimeter(),  4 * Math.sqrt(2)) : "test Polygon calcPerimeter";
        assert compareWithPrecision(poly1.calcArea(), 2) : "test Polygon calcArea";
        assert poly1.highestVertex().equals(new Point(1, 3)) : "test Polygon";

        assertionBool = poly1.addVertex(point1,-1);
        assert !assertionBool : "test Polygon";
        assertionBool = poly1.addVertex(point1,6);
        assert !assertionBool : "test Polygon";

        assert poly1.toString().equals("The polygon has 4 vertices:\n((1.0,1.0),(2.0,2.0),(1.0,3.0),(0.0,2.0))"): "test Polygon toString";

        Polygon bBox2 = poly1.getBoundingBox();
        Point bBoxPoint1 = bBox2.highestVertex();
        Point bBoxPoint2 = bBox2.getNextVertex(bBoxPoint1);
        Point bBoxPoint3 = bBox2.getNextVertex(bBoxPoint2);
        Point bBoxPoint4 = bBox2.getNextVertex(bBoxPoint3);

        assert (bBoxPoint1.equals(new Point(0, 3))
                ^ bBoxPoint1.equals(new Point(2, 3))
                ^ bBoxPoint1.equals(new Point(2, 1))
                ^ bBoxPoint1.equals(new Point(0, 1))) : "test Polygon getBoundingBox";
        assert (bBoxPoint2.equals(new Point(0, 3))
                ^ bBoxPoint2.equals(new Point(2, 3))
                ^ bBoxPoint2.equals(new Point(2, 1))
                ^ bBoxPoint2.equals(new Point(0, 1))) : "test Polygon getBoundingBox";
        assert (bBoxPoint3.equals(new Point(0, 3))
                ^ bBoxPoint3.equals(new Point(2, 3))
                ^ bBoxPoint3.equals(new Point(2, 1))
                ^ bBoxPoint3.equals(new Point(0, 1))) : "test Polygon getBoundingBox";
        assert (bBoxPoint4.equals(new Point(0, 3))
                ^ bBoxPoint4.equals(new Point(2, 3))
                ^ bBoxPoint4.equals(new Point(2, 1))
                ^ bBoxPoint4.equals(new Point(0, 1))) : "test Polygon getBoundingBox";
    }

    private static boolean compareWithPrecision(double d1, double d2) {
        return Math.abs(d1 - d2) < PRECISION_THRESHOLD;
    }

    private static void testPointNode() {
        String assertMessage = "test PointNode constructors, getters, setters, aliasing";
        Point point1 = new Point(1, 2);
        PointNode pointNode1 = new PointNode(point1);
        assert pointNode1.getNext() == null : assertMessage;
        assert pointNode1.getPoint().getX() == 1 : assertMessage;
        assert pointNode1.getPoint().getY() == 2 : assertMessage;
        point1.setX(0);
        point1.setY(0);
        assert pointNode1.getPoint().getX() == 1 : assertMessage;
        assert pointNode1.getPoint().getY() == 2 : assertMessage;
        pointNode1.getPoint().setX(0);
        pointNode1.getPoint().setY(0);
        assert pointNode1.getPoint().getX() == 1 : assertMessage;
        assert pointNode1.getPoint().getY() == 2 : assertMessage;
        point1.setX(1);
        point1.setY(2);
        pointNode1.setPoint(point1);
        assert pointNode1.getPoint().getX() == 1 : assertMessage;
        assert pointNode1.getPoint().getY() == 2 : assertMessage;
        point1.setX(0);
        point1.setY(0);
        assert pointNode1.getPoint().getX() == 1 : assertMessage;
        assert pointNode1.getPoint().getY() == 2 : assertMessage;

        Point point2 = new Point(2, 3);
        PointNode pointNode2 = new PointNode(point2, pointNode1);
        assert pointNode2.getNext() == pointNode1 : assertMessage;
        pointNode2.setNext(pointNode2);
        assert pointNode2.getNext() == pointNode2 : assertMessage;
        pointNode2.setNext(pointNode1);
        assert pointNode2.getNext() == pointNode1 : assertMessage;
        assert pointNode2.getPoint().getX() == 2 : assertMessage;
        assert pointNode2.getPoint().getY() == 3 : assertMessage;
        point2.setX(0);
        point2.setY(0);
        assert pointNode2.getPoint().getX() == 2 : assertMessage;
        assert pointNode2.getPoint().getY() == 3 : assertMessage;
        pointNode2.getPoint().setX(0);
        pointNode2.getPoint().setY(0);
        assert pointNode2.getPoint().getX() == 2 : assertMessage;
        assert pointNode2.getPoint().getY() == 3 : assertMessage;
        point2.setX(2);
        point2.setY(3);
        pointNode2.setPoint(point2);
        assert pointNode2.getPoint().getX() == 2 : assertMessage;
        assert pointNode2.getPoint().getY() == 3 : assertMessage;
        point2.setX(0);
        point2.setY(0);
        assert pointNode2.getPoint().getX() == 2 : assertMessage;
        assert pointNode2.getPoint().getY() == 3 : assertMessage;

        PointNode pointNode3 = new PointNode(pointNode2);
        assert pointNode3.getNext() == pointNode1 : assertMessage;
        pointNode3.setNext(pointNode3);
        assert pointNode3.getNext() == pointNode3 : assertMessage;
        pointNode3.setNext(pointNode1);
        assert pointNode3.getNext() == pointNode1 : assertMessage;
        assert pointNode3.getPoint().getX() == 2 : assertMessage;
        assert pointNode3.getPoint().getY() == 3 : assertMessage;
        point2.setX(0);
        point2.setY(0);
        assert pointNode3.getPoint().getX() == 2 : assertMessage;
        assert pointNode3.getPoint().getY() == 3 : assertMessage;
        pointNode3.getPoint().setX(0);
        pointNode3.getPoint().setY(0);
        assert pointNode3.getPoint().getX() == 2 : assertMessage;
        assert pointNode3.getPoint().getY() == 3 : assertMessage;
        point2.setX(2);
        point2.setY(3);
        pointNode3.setPoint(point2);
        assert pointNode3.getPoint().getX() == 2 : assertMessage;
        assert pointNode3.getPoint().getY() == 3 : assertMessage;
        point2.setX(0);
        point2.setY(0);
        assert pointNode3.getPoint().getX() == 2 : assertMessage;
        assert pointNode3.getPoint().getY() == 3 : assertMessage;
    }

    private static void verifyAssertionsEnabled() {
        boolean assertsEnabled = false;
        assert assertsEnabled = true; // Intended side effect
        if (!assertsEnabled) {
            throw new UnsupportedOperationException("Assertions are not enabled. Please enable assertions, " +
                    "you can ask for help on the WhatsApp group if you need it.");
        }
    }

    private static void testPoint() {
        Point point = new Point(10, 5);
        Point other = new Point(point);
        assert point.getX() == 10 : "test Point constructors, getters and setters";
        assert point.getY() == 5 : "test Point constructors, getters and setters";
        assert other.getX() == 10 : "test Point constructors, getters and setters";
        assert other.getY() == 5 : "test Point constructors, getters and setters";
        point.setX(1);
        point.setY(1);
        assert point.getX() == 1 : "test Point constructors, getters and setters";
        assert point.getY() == 1 : "test Point constructors, getters and setters";

        assert point.toString().equals("(1.0,1.0)") : "test Point toString";

        assert !point.equals(other) : "test Point equals";
        other = new Point(point);
        assert point.equals(other) : "test Point equals";

        other = new Point(2, 2);

        assert point.isUnder(other) : "test Point isUnder/isAbove";
        assert other.isAbove(point) : "test Point isUnder/isAbove";
        assert point.isLeft(other) : "test Point isLeft/isRight";
        assert other.isRight(point) : "test Point isLeft/isRight";

        assert point.distance(other) == Math.sqrt(2) : "test Point distance";

        point.move(1, 2);
        assert point.getX() == 2 : "test Point move";
        assert point.getY() == 3 : "test Point Move";
    }
}
