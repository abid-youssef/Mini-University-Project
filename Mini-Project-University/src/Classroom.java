import java.util.ArrayList;
public class Classroom {
    //Classroom data
    private String name;
    private String ID;

    //data related to other classes
    private ArrayList<Course> courses = new ArrayList<Course>();

    //setters and getters
    public String getName() {return name;}
    public String getID() {return ID;}
    public void setName(String name) {this.name = name;}
    public void setID(String ID) {this.ID = ID;}

    //constructor
    public Classroom(String name, String ID){
        this.name = name;
        this.ID = ID;
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
