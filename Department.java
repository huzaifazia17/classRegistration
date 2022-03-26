import java.util.Vector;

public class Department {
    //Variable Declarations
    private String name; // the name of school Dept of Computing and Info Science
    private String id; // short name for courses SOFE, ELEE, STAT, etc
    Vector <Course>courseList; // all courses offered by the department
    Vector <Student> registerList; // all students taking courses in the department.

    // Constructors
    public Department(String name, String id) {
        this.name = name;
        this.id = id;
        this.courseList = new Vector<Course>();
        this.registerList = new Vector<Student>();
    }

    public String getName() {

        return name; //Get name
    }

    public String getId() {
        return id;// Get id
    }
    public void offerCourse(Course course){
        courseList.add(course); // Add  course to course list
    }
    public void printCoursesOffered(){ // Print the course offered by the department
        for(Course i : courseList){
            System.out.println(i.toString());
        }
    }
    public void printStudentsByName(){ // Print the students in a department
        for(Student i: registerList){
            System.out.println(i.toString());
        }
    }

    public boolean isStudentRegistered(Student student){
        return this.registerList.contains(student); //; Check if a student is registered in a department
    }
    public void registerStudentCourseInDepartment(Student s, Course c){
        if(!registerList.contains(s)){ // Registers a student and course into the department
            registerList.add(s);
        }
        if(!courseList.contains(c)){
            courseList.add(c);
        }
    }
    public void printStudentsRegisteredInCourse(int code){} //Bonus Question-did not do
    public void studentsRegisteredInCourse(){//Bonus Question-did not do

    }
    public Course largestCourse(){//Bonus Question-did not do
        return null;
    }
    // To string method for the department class
    public String toString() {
        // returns a string representation of department name, number
        // of courses offered and number of students registered in the
        // department. Use the format:
        // ECSE: 53 courses, 460 students
        String output = (this.id + ": " + this.courseList.size() + " course "  + this.registerList.size()
        + " students");
        return output;
    }
}