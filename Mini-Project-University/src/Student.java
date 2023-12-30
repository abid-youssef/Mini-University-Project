import java.util.ArrayList;
class Student extends PersonInfo{

    //Additional student data
    private String major;
    private String level;

    //setters and getters
    public String getMajor() {return major;}
    public String getLevel() {return level;}
    public void setMajor(String major) {this.major = major;}
    public void setLevel(String level) {this.level = level;}

    //data related to other classes
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Club> clubs = new ArrayList<Club>();
    private ArrayList<Event> events = new ArrayList<Event>();
    //no need to add exams, since they are already added to courses, every course has an exam

    //constructor
    public Student(String name, String ID, String phone, String major,String level){
        super(name, ID, phone);
        this.major = major;
        this.level = level;
    }
    //methods related to other classes
    public void addCourse(Course course){
        courses.add(course);
    }
    public void addClub(Club club){
        clubs.add(club);
    }
    public void addEvent(Event event){
        events.add(event);
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }
    public void removeClub(Club club){
        clubs.remove(club);
    }
    public void removeEvent(Event event){
        events.remove(event);
    }
    public ArrayList<Course> getCourses(){
        return courses;
    }
    public ArrayList<Club> getClubs(){
        return clubs;
    }
    public ArrayList<Event> getEvents(){
        return events;
    }

}