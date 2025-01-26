import java.util.Date;

public class Employee {
    private int ID;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private int baseSalary;

    public Employee(){};

    public Employee(int ID, String name, String surname, Date dateOfBirth, int baseSalary) {
        this.ID =ID;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.baseSalary = baseSalary;
    }

    public void setID(int ID) {this.ID = ID;}

    public void setName(String name) {this.name = name;}

    public void setSurname(String surname) {this.surname = surname;}

    public void setAge(Date dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    public void setBaseSalary(int baseSalary) {this.baseSalary = baseSalary;}

    public int getID() {return ID;}

    public String getName() {return name;}

    public String getSurname() {return surname;}

    public Date getdateOfBirth() {return dateOfBirth;}

    public int getBaseSalary() {return baseSalary;}

}
