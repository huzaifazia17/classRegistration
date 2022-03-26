import java.util.Vector;

public class Student extends Person{
    // Student class private variables
    private String id;
    private Vector<Course> courses; // contains all courses the student is registered in
    private String name = super.name;

    // Constructor
    public Student (String id, String name){
        this.name = name;
        this.id = id;
        this.courses = new Vector<Course>();
    }

    public String getName() {
        return name; //get name
    }

    public String getId() {
        return this.id; // get ID
    }

    public void registerFor(Course course){ // registers student in a course if student is not already registered in that course
        if(!courses.contains(course)){
            courses.add(course);
        }
    }
    public boolean isRegisteredInCourse(Course course){
        return course.checkForStudentInCourse(this); // check if student is registered in a certain course
    }

    // to String method for String class
    public String toString() {
        String output = (this.id + " " + name + "\n" + "Registered Courses: " + courses);
        return output;
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850

    }
}
