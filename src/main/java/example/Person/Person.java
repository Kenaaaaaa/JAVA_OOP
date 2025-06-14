package example.Person;
/*Person class
Implement the  Person  abstract class.
 It should contain:
two String fields:  name ,  address
non-arguments constructor which will set  name ,  address  fields as empty
strings
two-arguments constructor:  String name ,  String address
getter  methods which will be responsible for returning  name ,  address
elds values
setter  methods which will be responsible for setting  name ,  address  elds
values
toString  method which should return string in the following format:  ?->? ,
where  ?  is the name and adress value accordingly*/
public abstract class Person {
    // Fields
    private String name;
    private String address;
    // Non-arguments constructor
    public Person() {
        this.name = "";
        this.address = "";
    }
    // Two-arguments constructor
    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }
    // Getter for name
    public String getName(){
        return name;
    }
    // Getter for address
    public String getAddress(){
        return address;
    }
    // Setter for name
    public void setName(String name){
        this.name = name;
    }
    // Setter for address
    public void setAddress(String address){
        this.address = address;
    }
    // toString method
    @Override
    public String toString() {
        return name + "->" + address;
    }
}
