package example.CircleClass;
/*Shape class
Implement the  Shape  class. It should contain:
color information
information if color should ll a shape
non-arguments constructor which will set: the  color  eld to  unknown  and
the  isFilled  eld to  false
two-arguments constructor:  color ,  isFilled
getter  methods which will be responsible for returning declared elds
setter  methods which will be responsible for setting declared elds
toString  method which should return the following information:  Shape
with color of ? and filled/NotFilled , where ? is a placeholder for the
color and the  filled / not filled  info should be returned depending on
the  isFilled  eld*/
public class Shape {
    private String color;
    private boolean filled;
    // Non-arguments constructor
    public Shape() {
        this.color = "unknown";
        this.filled = false;
    }
    // Two-arguments constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    // Getter for color
    public String getColor() {
        return color;
    }
    // Getter for filled
    public boolean isFilled() {
        return filled;
    }
    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }
    // Setter for filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    // toString method
    @Override
    public String toString() {
        return "Shape with color of " + color + " and " + (filled ? "filled" : "not filled");
    }
}
