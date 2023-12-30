//to simplify this class, i did not include a list of students since it would be redundant
//every student enrolled in a course is implicitly enrolled in the exam related to that course

public class Exam {
    //Exam data
    private String name;
    private String ID;
    private String date;
    //setters and getters
    public String getName() {return name;}
    public String getID() {return ID;}
    public String getDate() {return date;}


    //data related to other classes
    private Course course;

    public Course getCourse() {return course;}
    public void setCourse(Course course) {this.course = course;}

    //constructor
    public Exam(String name, String ID, String date, Course course){
        this.name = name;
        this.ID = ID;
        this.date = date;
        this.course = course;
    }


}
