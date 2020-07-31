/**
 * a list of point to save all the point in the way you want.
 * @author Joseph Avner Duran
 * @version 06.2020
 */


public class PointNode {
    private Point _pointInTheNode;
    private PointNode _nextNode;

    /**
     * a point you want to save in the list
     * @param p the given point
     */
    public PointNode (Point p){
        _pointInTheNode =p;
        _nextNode =null;
    }

    /**
     * a point you want to save in the list and the point that come ather it /
     * @param p the point you want to save
     * @param n the point that come after this on
     */
    public PointNode (Point p, PointNode n){
        this._pointInTheNode =  p;
        this._nextNode = n;
    }

    /**
     * a copy constructert that copy an point in the list
     * @param p the point in the list you want to copy
     */
    public PointNode (PointNode p){
        this._nextNode =p;
    }

    /**
     * get the point in the from luist the amount in the X val you want to move
     * @return
     */
    public Point getPoint(){
        return new Point(this._pointInTheNode);
    }

    /**
     * give back the next PointNode that come after the current one
     * @return the next point in the list
     */
    public PointNode getNext(){
        return this._nextNode;
    }

    /**
     * setting the point given to the point in this place on the list
     * @param p Point that we need to set
     */
    public void setPoint(Point p) {
        new PointNode(p);
    }

    /**
     * setting the given point node to the next one
     * @param next the point we want to make it to point on
     */
    public void setNext(PointNode next){
        _nextNode= next;
    }
}


