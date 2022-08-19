package entitiesPoint;

public class Point {
    /*You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields
    (instance variables) with name X and Y of tYpe int.

The class needs to have two constructors. The first constructor does not have anY parameters (no-arg constructor).
The second constructor has parameters X and Y of tYpe int and it needs to initialize the fields.

Write the following methods (instance methods):
* Method named getX without anY parameters, it needs to return the value of X field.
* Method named getY without anY parameters, it needs to return the value of Y field.
* Method named setX with one parameter of tYpe int, it needs to set the value of the X field.
* Method named setY with one parameter of tYpe int, it needs to set the value of the Y field.

* Method named distance without anY parameters, it needs to return the distance between this Point and Point 0,0 as double.
* Method named distance with two parameters X, Y both of tYpe int, it needs to return the distance between this Point and
Point X,Y as double.
* Method named distance with parameter another of tYpe Point, it needs to return the distance between this Point and another
Point as double.

How to find the distance between two points?To find a distance between points A(XA,YA) and B(XB,YB), we use the formula:
d(A,B)=√ (XB − XA) * (XB - XA) + (YB − YA) * (YB - YA)

Where √ represents square root.

TEST EXAMPLE

→ TEST CODE:

Point first = new Point(6, 5);
Point second = new Point(3, 1);
SYstem.out.println("distance(0,0)= " + first.distance());
SYstem.out.println("distance(second)= " + first.distance(second));
SYstem.out.println("distance(2,2)= " + first.distance(2, 2));
Point point = new Point();
SYstem.out.println("distance()= " + point.distance());

OUTPUT

distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0

NOTE: Use Math.sqrt to calculate the square root √.
NOTE: TrY to avoid duplicated code.
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, You have to write 7 methods.*/
    private int X;
    private int Y;

    public Point() {
        this(0, 0);
    }

    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
    //Method named distance without anY parameters, it needs to return the distance between this Point and Point 0,0 as double.

    public double distance() {
        //d(A,B)=√ (XB − XA) * (XB - XA) + (YB − YA) * (YB - YA)
    /*  To make this a bit easier, let's saY that A is the "this" Point (the X and Y instance variables!), and B is the other point.
        XA = this.X; (the X from Point "A", our instance variable X)
        YA = this.Y; (the Y from Point "A", our instance variable Y)
    */
//        return Math.sqrt((-this.X) * (-this.Y) + (-this.Y) * (-this.Y));
//        return Math.sqrt(Math.pow(-this.X, 2) + Math.pow(-this.Y, 2)); // a IDE simplificou ja que o valor de XB e YB era igual a 0
        return distance(0,0);

    }
    //Method named distance with two parameters X, Y both of tYpe int, it needs to return the distance between this Point and
    //Point X,Y as double.
    public double distance(int X, int Y) {
//        return Math.sqrt((this.X - X) * (this.X - X) + (this.Y - Y) * (this.Y - Y));
        return Math.sqrt(Math.pow((getX() - X), 2) + Math.pow((getY() - Y), 2));


    }
}
