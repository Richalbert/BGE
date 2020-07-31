/**
 * this class makes point on a graf
 * the point is an double of an X val an Y val.
 * @author Joseph Avner Duran
 * @version 06.2020
 */

public class Point {


    private double _x;
    private double _y;

    /**
     * this makes a point on the graf
     * @param x the  val of the x in the graf
     * @param y the val of the x in the graf
     */
    public Point(double x, double y){
        _x=x;
        _y=y;

    }

    /**
     * copy constrocter to copy a point
     * @param other the point yo want to copy
     */
    public Point (Point other){
        _x=other._x;
        _y=other._y;
    }

    /**
     * get the x val of the given point
     * @return x val
     */

    public double getX(){
        return _x;
    }

    /**
     * get the y val of the given point
     * @return y val
     */
    public double getY(){return _y;}

    /**
     * give to a given point a new x val
     * @param x  new val you want to put on the point
     */
    public void setX(double x){
        _x=x;
    }

    /**
     * give to a given point a new x val
     * @param y new val you want to put on the point
     */
    public void setY(double y){
        _y=y;
    }

    /**
     * a String format that ywas asked to give back to user
     * @return the String format
     */
    public String toString() {
        int valX=(int)_x;
        int valY = (int)_y;
        String pointFormat = ("("+valX+","+valY+")");//downgrading to an int val
        return pointFormat;
    }

    /**
     * see if two point are equals
     * @param other point you wannt to see if equal
     * @return true if it is and if not equal then false
     */
    public boolean equals (Point other){
        if (_x==other.getX()&&_y==other.getY())
            return true;
        return false;
    }

    /**
     * see if the point is above an other point (the Y val is bigger)
     * @param other point ypu want to compare
     * @return true if it is else false
     */
    public boolean isAbove (Point other){
        if (_y>other.getY())
            return true;
        return false;
    }

    /**
     * see if the point ia under an other point ( the Y val is smaller)
     * @param other point you want to compare
     * @return true if it is else false
     */
    public boolean isUnder (Point other){
        if(this.isAbove(other))
            return false;
        return true;
    }

    /**
     * see if the point ia left an other point ( the X val is smaller)
     * @param other point you want to compare
     * @return true if it is else false
     */
    public boolean isLeft(Point other){
        if (_x<other.getX())
            return true;
        return false;
    }

    /**
     * see if the point ia right an other point ( the X val is bigger)
     * @param other point you want to compare
     * @return true if it is else false
     */
    public boolean isRight(Point other){
        if (this.isLeft(other))
            return false;
        return true;
    }

    /**
     * give the distance between two point
     * @param other the other point you want to know the distance of
     * @return the distance between them
     */
    public double distance (Point other){
        double firstAct = Math.pow((this.getY()-other.getY()),2);
        double secAct= Math.pow((this.getX()-other.getX()),2);
        return Math.sqrt(firstAct+secAct);
    }

    /**
     * move a point by an amount given
     * @param dx the amount in the X val you want to move
     * @param dy the amount in the Y val you want to move
     */
    public void move (double dx, double dy){
        _x+=dx;
        _y+=dy;
    }
}


