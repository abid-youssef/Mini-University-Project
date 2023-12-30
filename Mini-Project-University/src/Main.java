//i'm working on a University application that includes the following classes that interact within eachother:
//Student, Course, Teacher, Staff(with inherited classes of Admin and Faculty), Clubs, Events, Classrooms, and Exams

import java.util.ArrayList;
interface person{
    public String getName();
    public String getID();
    public String getPhone();

}
class PersonInfo implements person{
    //Person data
    private String name;
    private String ID;
    private String phone;
    //constructor
    public PersonInfo(String name, String ID, String phone){
        this.name = name;
        this.ID = ID;
        this.phone = phone;
    }
    //setters and getters
    public String getName(){
        return name;
    }
    public String getID(){
        return ID;
    }
    public String getPhone(){
        return phone;
    }

    public void setID(String ID) {this.ID = ID;}
    public void setName(String name) {this.name = name;}
    public void setPhone(String phone) {this.phone = phone;}
}




public class Main {
    public static void main(String[] args) {


    }
}