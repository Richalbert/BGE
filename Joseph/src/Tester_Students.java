public class Tester_Students {
    public static void main(String[] args) 
    {
        boolean ok = true;
        Point fX = new Point(2, 2);
        Point sX = new Point(fX);
        
        System.out.println("richard fX : " + fX.toString());
        System.out.println("richard sX : " + sX.toString());
        
        if (!fX.equals(sX)) //ne devrait jamais arriver
        {
            System.out.println("equals method at Point class is wrong");
            ok = false;
        }
        
        
        sX.move(-1, -1);
        System.out.println("richard sX : " + sX.toString());
        
        
        
        fX.setX(0);
        fX.setY(0);
        System.out.println("richard fX : " + fX.toString());
        
        Point tX = new Point(fX.getX(), sX.getY());
        System.out.println("richard tX : " + tX.toString());
        
        
      
        boolean tempB = sX.isAbove(fX);
        System.out.println("boolean tempB (S est au dessus de F) : " + tempB);
        
        boolean tempC = sX.isUnder(fX);
        System.out.println("boolean tempC (S est en dessous de F) : " + tempC);
        
        boolean tempD = sX.isLeft(fX);
        System.out.println("boolean tempD (S est a gauche de F) : " + tempD);
        
        boolean tempE = sX.isRight(fX);
        System.out.println("boolean tempE (S est a droite de F) : " + tempE);
        
        
        
        // on cree une cellule PointNode, non chainee
        PointNode pS = new PointNode(sX);
        
        // on cree une cellule Pointnode; chaine avec ( moi : la precedente)  pF -> pS
        PointNode pF = new PointNode(fX, pS);
        
        // on chaine la cellule 
        PointNode pT = new PointNode(pS);

        if (Math.abs(pF.getPoint().distance(pF.getNext().getPoint())) - Math.sqrt(2) > 0.1)
        {
            System.out.println("Distance Calculation is wrong");
            ok = false;
        }

        pT.setPoint(tX);
        pF.setNext(pT);

        Polygon myPolygon = new Polygon();
        myPolygon.addVertex(fX, 1);
        myPolygon.addVertex(sX, 2);
        myPolygon.addVertex(tX, 3);

        String text = myPolygon.toString();
        if (!text.equals("The polygon has 3 vertices:\n((0.0,0.0),(1.0,1.0),(0.0,1.0))"))
        {
            System.out.println("Work on your String representation.");
            System.out.println("Currect answer:\nThe polygon has 3 vertices:\n((0.0,0.0),(1.0,1.0),(0.0,1.0))");
            System.out.println("Your answer:\n" + text);
            ok = false;
        } 
        
        if (Math.abs(myPolygon.calcPerimeter() - 3.414) > 0.1)
        {
            System.out.println("Work on your perimeter calculation.");
            System.out.println("For polyogn ((0.0,0.0),(1.0,1.0),(0.0,1.0)) perimeter is 3.414, Your result: " + myPolygon.calcPerimeter());
            ok = false;
        }
        
        if (Math.abs(myPolygon.calcArea() - 0.5) > 0.1) 
        {
            System.out.println("Work on your area calculation.");
            System.out.println("For polyogn ((0.0,0.0),(1.0,1.0),(0.0,1.0)) area is 0.5, Your result: " + myPolygon.calcArea());
            ok = false;
        }

        Point tempP = myPolygon.highestVertex();
        tempB = myPolygon.isBigger(myPolygon);
        int tempI = myPolygon.findVertex(fX);
        tempP = myPolygon.getNextVertex(fX);
        Polygon tempPol = myPolygon.getBoundingBox();
        
        System.out.println("This tester is very basic and mainly checks that you implemented all the required methods" +
            " but not its correctness");
        if (ok)
            System.out.println("Everything so far seems fine.");
    }
}
