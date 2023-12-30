
public class Staff extends PersonInfo{
//Additional staff data
    private String position;
    private String department;

    public String getPosition() {return position;}
    public String getDepartment() {return department;}
    public void setPosition(String position) {this.position = position;}
    public void setDepartment(String department) {this.department = department;}

    //constructor
    public Staff(String name, String ID, String phone, String position, String department){
        super(name, ID, phone);
        this.position = position;
        this.department = department;
    }

}

class Admin extends Staff{
    //constructor
    public Admin(String name, String ID, String phone, String position, String department){
        super(name, ID, phone, position, department);
    }
}

class Faculty extends Staff{
    //constructor
    public Faculty(String name, String ID, String phone, String position, String department){
        super(name, ID, phone, position, department);
    }
}
