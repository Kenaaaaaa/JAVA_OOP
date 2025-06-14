package example.Person;

/*Staff class
Implement the  Lecturer  class. It should extend the  Person  class.
Implementation should meet the below criteria:
two elds: specialization, salary
two-arguments constructor: specialization, salary
getter  methods which will be responsible for returning declared elds
setter  methods which will be responsible for setting declared elds
toString  method which should return detials information about a lecturer
Please provide an example usage of above implementation.
*/
public class Staff  extends Person {
    private String specialization;
    private int salary;

    // Two-arguments constructor
    public Staff(String specialization, int salary) {
        super();
        this.specialization = specialization;
        this.salary = salary;
    }
    // Getter for specialization
    public String getSpecialization() {
        return specialization;
    }
    // Getter for salary
    public int getSalary() {
        return salary;
    }
    // Setter for specialization
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    // Setter for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }
    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Specialization: " + specialization + ", Salary: $" + salary;
    }


}
