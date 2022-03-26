import java.util.Vector;

public class Course{
    //Private Department Class variables
    private Department dept;
    private String title; // title of the course (e.g. Intro to programming);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    Vector <Student>classList; // contains all students registered in this course

    //Constructors
    public Course(String code, int number, Department dept, String title) {
        this.code = code;
        this.number = number;
        this.dept = dept;
        this.title = title;
        this.classList = new Vector<Student>();
    }
    public String getDept() {
        return this.dept.toString();// Get Department
    }
    public int getCode() {
        return Integer.parseInt(this.code);
    } //Get Code
    public int getNumber(){return this.number;}// Get number
    public Vector<Student> getClassList(){return this.classList;}// Get Class List

    public boolean checkForStudentInCourse(Student student){
        if(classList.contains(student)){ // CHeck if a class list contains a student or not
            return true;
        } else{
            return false;
        }
    }
    public void addStudentToCourse(Student student){
        classList.add(student); // adds a student to a course
    }


    public String toString() { // Course class to string method
        // return a string representation of the course with the course code,
        // name, and number of people registered in the course in the following
        // format:
        // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260
        String output = (this.code + " " + this.number + " " + this.title + ", Enrollment = " + this.classList.size() );
        return output;
    }



}
