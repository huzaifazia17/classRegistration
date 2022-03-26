public class Person {
    protected String name;

    //Constructors
    public Person(String initialName) {
        this.name = initialName;
    }

    public Person() {
    }

    //Set name of person
    public void setName( String fullName) {
        this.name = fullName;
    }
    //get name of person
    public String getName() {
        return this.name;
    }
    //to string method of person class
    public String toString() {
        return (name);

    }
}
