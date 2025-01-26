import java.util.Date;

public class Engineer extends  Employee{
    private final double comissionRate;

    public Engineer(int ID, String name, String surname, Date dateOfBirth, int baseSalary, double comissionRate) {
        super(ID, name, surname, dateOfBirth, baseSalary);
        this.comissionRate = comissionRate;
        setSalary();
    }


    public double setSalary() {
        return getBaseSalary() + comissionRate * 20;
    }

}
