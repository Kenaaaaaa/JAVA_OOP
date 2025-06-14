package example.Person;
/*Implement the  Student  class. It should extend the  Person  class.
Implementation should meet the below criteria:
three elds: type of study, year of study, study price
three-arguments constructor: type of study, year of study, study price
getter  methods which will be responsible for returning declared fields
setter  methods which will be responsible for setting declared elds
toString  method which should return details information about a student*/

public class Student extends Person {
    private String major;
    private int yearOfStudy;
    private double price;

    // Three-arguments constructor
    public Student(String major, int yearOfStudy, double price) {
        super();
        this.major=major;
        this.yearOfStudy=yearOfStudy;
        this.price=price;
    }
    //getter for major
    public String getMajor(){
        return major;
    }
    //getter for yearOfStudy
    public int getYearOfStudy(){
        return yearOfStudy;
    }
    //getter for price
    public double getPrice(){
        return price;
    }
    //setter for major
    public void setMajor(String major){
        this.major=major;
    }
    //setter for yearOfStudy
    public void setYearOfStudy(int yearOfStudy){
        this.yearOfStudy=yearOfStudy;
    }
    //setter for price
    public void setPrice(double price){
        this.price=price;
    }
    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Major: " + major + ", Year: " + yearOfStudy + ", Price: $" + price;
    }
}
