import java.util.ArrayList;
public class Teacher extends PersonInfo{
    //Additional teacher data
    private String specialty;

    public String getSpecialty() {return specialty;}
    public void setSpecialty(String specialty) {this.specialty = specialty;}

    //data related to other classes
    private ArrayList<Course> courses = new ArrayList<Course>();
    //constructor
    public Teacher(String name, String ID, String phone, String specialty){
        super(name, ID, phone);
        this.specialty = specialty;
    }
    //methods related to other classes
    public void addCourse(Course course){
        courses.add(course);
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }
    public ArrayList<Course> getCourses(){
        return courses;
    }




}
