import java.util.ArrayList;
public class Course {
    //Course data
    private String name;
    private String ID;

    //data related to other classes
    private ArrayList<Student> students = new ArrayList<Student>();
    private Teacher teacher;
    private Classroom classroom;
    private Exam exam;

    //setters and getters
    public String getName() {return name;}
    public String getID() {return ID;}
    public Teacher getTeacher() {return teacher;}
    public Classroom getClassroom() {return classroom;}
    public Exam getExam() {return exam;}
    //constructor
    public Course(String name, String ID, Teacher teacher, Classroom classroom, Exam exam){
        this.name = name;
        this.ID = ID;
        this.teacher = teacher;
        this.classroom = classroom;
        this.exam = exam;
    }
    //methods related to other classes
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public ArrayList<Student> getStudents(){
        return students;
    }

}
