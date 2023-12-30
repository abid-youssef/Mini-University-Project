import java.util.ArrayList;
public class Event {
    //Event data
    private String name;
    private String ID;
    private String date;

    //setters and getters
    public String getName() {return name;}
    public String getID() {return ID;}
    public String getDate() {return date;}
    public void setName(String name) {this.name = name;}
    public void setID(String ID) {this.ID = ID;}
    public void setDate(String date) {this.date = date;}


    //data related to other classes
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Club> clubs = new ArrayList<Club>();

    //constructor
    public Event(String name, String ID, String date){
        this.name = name;
        this.ID = ID;
        this.date = date;
    }

    //methods related to other classes
    public void addStudent(Student student){
        students.add(student);
    }
    public void addClub(Club club){
        clubs.add(club);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public ArrayList<Club> getClubs(){
        return clubs;
    }
}
