import java.util.ArrayList;
public class Club {
    //Club data
    private String name;
    private String ID;
    //setters and getters
    public String getName() {return name;}
    public String getID() {return ID;}
    public void setEvents(ArrayList<Event> events) {this.events = events;}
    public void setID(String ID) {this.ID = ID;}
    public void setName(String name) {this.name = name;}


    //data related to other classes
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Event> events = new ArrayList<Event>();

    //constructor
    public Club(String name, String ID){
        this.name = name;
        this.ID = ID;
    }
    //methods related to other classes
    public void addStudent(Student student){
        students.add(student);
    }
    public void addEvent(Event event){
        events.add(event);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public ArrayList<Event> getEvents(){
        return events;
    }
}
