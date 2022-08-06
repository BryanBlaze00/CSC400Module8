/**
 * Person Object Class
 */
public class Person {
    private int age;
    private String firstName, lastName;

    /**
     * Default Constructor
     */
    public Person( ) {
    }

    /**
     * Parameterized Constructor
     * @param age - Age of Person
     * @param firstName - First Name of Person
     * @param lastName - Last Name of Person
     */
    public Person(int age , String firstName , String lastName) {
        this.age       = age;
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    /**
     * Getter's and Setter's of Person Attributes
     */
    public int getAge( ) {return age;}
    public void setAge(int age) {this.age = age;}
    public String getFirstName( ) {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName( ) {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    /**
     * Overridden toString method
     * @return - Person Object Attributes
     */
    @Override
    public String toString( ) {
        return "Name: " + firstName + " " + lastName + ", Age: " + age;
    }
}
