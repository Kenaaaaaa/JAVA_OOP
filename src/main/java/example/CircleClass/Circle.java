package example.CircleClass;
/*Circle class
Implement the  Circle  class. It should extend the  Shape  class. Implementation
should meet the below criteria:
information about the radius value
non-arguments constructor which will set: the  color  eld value to  unknown ,
the  isFilled  eld value to  false  and the  radius  eld value to  1
three-arguments constructor:  color ,  isFilled ,  radius
getter  methods which will be responsible for returning the  radius  value
setter  methods which will be responsible for setting the  radius  value
getArea  method which will be responsible for calculating the surface area
getPerimeter  method which will be responsible for calculating the circuit
toString  method which should return the following information:  Circle
with radius=? which is a subclass off y , where ? is a placeholder for
the radius value and the  y  info should be a result of the  toString
execution from the base class*/

public class Circle extends Shape{
    private double radius;

    // Non-arguments constructor
    public Circle(double radius){
        super();
        this.radius = 1;
    }

    // Three-arguments constructor
    public Circle(double radius, String color){
        super(color, false);
        this.radius = radius;
    }
}
