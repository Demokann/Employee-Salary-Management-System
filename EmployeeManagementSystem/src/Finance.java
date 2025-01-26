import java.util.Date;

public class Finance extends Employee{
    private double comissionRate;

    public Finance(int ID, String name, String surname, Date dateOfBirth, int baseSalary, double comissionRate) {
        super(ID, name, surname, dateOfBirth, baseSalary);
        this.comissionRate = comissionRate;
        setSalary();
    }

    public double setSalary() {
        return getBaseSalary() + comissionRate * 25;
    }

}
