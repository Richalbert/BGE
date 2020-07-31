

public class Polygon {
    private PointNode _head;

    /**
     * a constructor that intelize the _head to be null.
     */
    public Polygon(){
        _head=null;
    }
    /**
     * this program is an O(n) program
     * an the usege is 2(n)
     * a program that put to the polygon a new point in it in the pace you want it too be
     * @param p the point you want to add it on the polygon
     * @param pos the position in the polygon you the point to be.
     * @return if the program succeed to insert your point where you want it to be the return true else return false
     */
    public boolean addVertex(Point p , int pos){



        int count= 1;
        PointNode newNodePoint =new PointNode(p);
        return true;//i didnt past the compailer so o but it

//        if (pos==1) {
//            addToHead(newNodePoint);
//            return true;
//        }
//        if (pos==length()+1) {
//            addToEnd(newNodePoint);
//            return true;
//        }
//        if (_head==null&& pos>1) {
//            return false;
//        }
//        if (pos<1)
//            return false;
//        if (pos>length()+1)
//            return false;
//
//        if (pos==1) {
//            addToHead(newNodePoint);
//        }
//        PointNode behind =_head;
//        PointNode before = _head.getNext();
//        while (pos-1 != count){
//            count++;
//            behind= behind.getNext();
//            before= before.getNext();
//        }
//        newNodePoint.setNext(before);
//        behind.setNext(newNodePoint);
//        return true;
//
    }


//public boolean addVertex(Point p , int pos){
//   int count =1;
//   PointNode newPoint = new PointNode (p);//the new point you want to insert
//   PointNode ptr = _head;//a pointer
//   if (pos<1)//the pos is impossible
//       return false;
//   if (pos==1) {//the pos is in head so we ask an privet program to do it.
//       addToHead(newPoint.getNext());
//       return true;
//   }
//   while (ptr.getNext() != null){//we do a while to fine the pos we want. / this act makes the code an O(n) bc we past on all the list.
//       if(count==pos){
//           newPoint.setNext(ptr.getNext());//giving the newPoint the next in the list
//           PointNode behind= predecessor(ptr);//find the one before the ptr
//           if (behind==null)//if the result of predecessor
//               return false;
//           else {
//               behind.setNext(newPoint.getNext());//the behind.next will be equal to the new point. /this act makes the code an O(pos) bc we have too past on all the list to get there.
//               return true;
//           }
//       }
//       else{
//           count++;
//           ptr.getNext();
//       }
//   }
//   if(pos>count+1)//if the pos is in more the end of the list
//       return false;
//   addToEnd(newPoint);//add to the end// this act makes the code an O(n) bc we have too past on all the list.
//   return true;
//

    /**
     * this program is an O(n) program
     * the highest point in the polygon (the Y is biggest)
     * @return the first point of highest point in the polygon
     */
    public Point highestVertex(){
        if (_head==null)//if the polygon is empty
            return null;
        Point temp = _head.getNext().getPoint();// first point
        PointNode ptr =_head;//a ptr that gonna past all the list
        while (ptr.getNext() != null){ //while we before the end off the list / this act makes the code an O(n) bc we have too past on all the list.
            if (ptr.getPoint().isAbove(temp))  // we look if the point in temp is above the ptr if it isnt we change the temp point
                temp = ptr.getPoint();
            ptr = ptr.getNext();
        }
        return new Point(temp);//return a new point of the val of the temp
    }

    /**
     * this program is an O(n) program
     * this code give back a string int a pattern we was ask to do
     * @return a string with the pattern "The polygon has (the num of point) vertices." and the toString of the point of the points on the polygon
     */
    public String toString(){
        if (_head==null)//if there is no points
            return "The polygon has 0 vertices.";
        PointNode ptr =_head;// first pointer
        int polygonLength =length();
        int count=1;
        String pointLine ="";//the string we give back.
        while (count>polygonLength){//this act makes the code an O(n) bc we have too past on all the list.
            if (count == polygonLength) {//if the next point is the end and not putting a , in the end
                pointLine += ptr.getPoint().toString();
                count++;
            }

            pointLine += ptr.getPoint().toString() + ",";
            ptr= ptr.getNext();
            count++;

        }
        return "The polygon has" + length() + "vertices:" +"\n"+"("+pointLine+")";//the string with the length
    }

    /**
     *this program is an O(n) program
     * this code take all the PointNode of the polygon and calculate the perimeter of it
     * @return a double that indecat the val of all the parimeter.
     */
    public double calcPerimeter(){
        if(_head==null|| length()==1){//if there is no Point on the polygon or just one

            return 0;
        }
        int count= length();
        double perimeter =0;
        PointNode ptr = _head ,otherPtr =_head.getNext() ,head =_head;
        while (ptr.getNext() != null){//this act makes the code an O(n) bc we have too past on all the list.
            perimeter += ptr.getPoint().distance(otherPtr.getPoint());
            ptr= ptr.getNext();
            otherPtr= otherPtr.getNext();
        }
        if (count>2)
            perimeter += otherPtr.getPoint().distance(head.getPoint());
        return perimeter;

    }

    /**
     * this program is an O(n) program
     *calculate the area of the polygon by dividing the polygon to triangle
     * @return a double of the area calculated
     */
    public double calcArea(){
        if (_head==null||length()<3)//while the trapzoid is not too small is not too small
            return 0;
        double calcArea =0;
        PointNode head =_head,ptr =_head.getNext(),othePtr = _head.getNext().getNext();//tree pointer for the math calculation
        while (othePtr.getNext() != null){//if it is null then we stop beacuse we are in the end off the area
            calcArea +=triangleArea(head.getPoint(),ptr.getPoint(),othePtr.getPoint());//this act makes the code an O(n) bc we have too past on all the list.
            ptr= ptr.getNext();//going to the next point
            othePtr = othePtr.getNext();//going to next point
        }
        return calcArea;// after we did all the triangek in the polygon then we can return the calcArea we calculated on the loop/
    }

    /**
     * this program is an O(n) program
     * calculated which polygon is bigger between .this and the other
     * @param other one we calc to se which is bigger
     * @return true if .this polygon is bigger then the other polygon else return false
     */
    public boolean isBigger(Polygon other){
        double thisArea= calcArea();//we use the calcArea action to compare those too /this act makes the code an O(n) bc we have too past on all the list.
        double otherArea= other.calcArea();//this act makes the code an O(n) bc we have too past on all the list.
        if (thisArea>=otherArea)
            return true;
        return false;
    }

    /**
     * this program is an O(n) program
     * this program try to fine the point p in the Polygon and gove back how much fare it is from the _head point .
     * @param p the point we have to fine in the polygon
     * @return an int of how much far the point is from the _head of the polygon is if we didnt fine the point we give back  -1.
     */
    public int findVertex(Point p){
        int count =1 ;
        PointNode ptr = _head;//the pointer.
        if (_head==null) 
            return -1;   
        while(ptr.getNext()!= null){//this act makes the code an O(n) bc we have too past on all the list.
            if (ptr.getPoint().equals(p))//if fine the point
                return count;
            //else we do those two things//else we do
            count++;
            ptr = ptr.getNext();
        }
        //if we didnt fine the point in the polygon
        return -1;
    }

    /**
     * this program is an O(n) program
     * give the point that come after the point (p) asked
     * @param p the point we have too fine
     * @return the point the come after this point in the polygon if we dont fine we return null.
     */
    public Point getNextVertex(Point p){
        int countFindVertex = findVertex(p);//finding where this point is on the polygon /this act makes the code an O(n) bc we have too past on all the list.
        int count =1;

        if (countFindVertex ==-1)//if we didnt fine the giving point on the polygon list
            return null;
        if (countFindVertex ==1||countFindVertex==length())//if the point is in the end of the polygon list then we return the first point of the polygon /this act makes the code an O(n) bc we have too past on all the list.(bc the length)
            return new Point(_head.getPoint());
        PointNode ptr = _head;//we make a pointer

        while(count != countFindVertex+1) {//if the both if on the top didnt find the point then we gonna find it with the next point by giving the a loop until we fined the point after the the one int findVertex and giving it to the pointer
            ptr = ptr.getNext();
        }
        return new Point (ptr.getPoint());//print the pointer

    }

    /**
     * this program is an O(n) program
     * this program  give an "hit box"(an rectangle that is parallel to the X and Y in the graph ) around the polygon
     * @return a new Polygon whit 4 point on it that represent the hit box of the current Polygon
     */
    public Polygon getBoundingBox(){
        if (_head==null||length()<3)//if smaller then 2 point return null.
            return null;
        PointNode ptr = _head.getNext();//make a pointer that gonna find which on of oll the point on the current polygon is highest lowest rightest and leftest.
        Point up =new Point(_head.getPoint()), down =new Point(_head.getPoint()),right = new Point(_head.getPoint()),left=new Point(_head.getPoint());// making the new 4 points of the new polygon
        while (ptr.getNext() != null){//finding all the 4 points (the highest lowest rightest and leftest.) / this act makes the code an O(n) bc we have too past on all the list.
            // asking this 4 qustion in every point the ptr give back then go the same whit the next one
            if (ptr.getPoint().isAbove(up))
                up= new Point(ptr.getPoint());
            if (ptr.getPoint().isUnder(down))
                down= new Point(ptr.getPoint());
            if (ptr.getPoint().isLeft(left))
                left= new Point(ptr.getPoint());
            if (ptr.getPoint().isRight(right))
                right=new Point(ptr.getPoint());
            ptr = ptr.getNext();
        }
        //setting the 4 point to make the perfect rectangle that was asked
        up.setX(right.getX());
        down.setX(right.getX());
        left.setY(up.getY());
        right.setY(down.getY());
        right.setX(left.getX());

        //making a new polygon an setting all those points
        Polygon poly = new Polygon();
        poly.addVertex(up,1);
        poly.addVertex(down,2);
        poly.addVertex(right,3);
        poly.addVertex(left,4);
        return poly;//the new polygon
    }



    private  double triangleArea(Point a, Point b, Point c){//take for points and giving the area of the triangle using "Heron" math calculation
        double aDistance= a.distance(b);
        double bDistance =b.distance(c);
        double cDistance = c.distance(a);
        double s = aDistance + bDistance + cDistance;
        s =s/2;
        return Math.sqrt((s-aDistance)*(s-bDistance)*(s-cDistance));//return the val of it
    }

    private int length(){//giving back an int of the length of all point
        PointNode temp=_head;
        int count =0;
        while (temp!=null) {// this act makes the code an O(n) bc we have too past on all the list.
            count++;
            temp.getNext();
        }
        return count;
    }
    private PointNode predecessor(PointNode node) {// find the pointNode before the one given / find on the page 111/20 second book
        if (_head == null || _head == node)//if empty
            return null;
        PointNode behind = _head;
        while (behind.getNext()!= node){
            if (behind.getNext() == node)
                return behind;
            else
                behind = behind.getNext();
        }
        return null;
    }
    private  void addToHead(PointNode newPoint){//find on the book page 109/12 second book
        PointNode temp = _head;
        _head= newPoint;
        newPoint.setNext(temp);

    }
    private void addToEnd (PointNode node){//find on the book page 109/11 second book
        if (_head==null)
            _head=node;
        else{
            PointNode ptr = _head;
            while (ptr.getNext() != null){
                ptr = ptr.getNext();
            }
            ptr.setNext(node);
        }
    }
}//end of public class Polygon

