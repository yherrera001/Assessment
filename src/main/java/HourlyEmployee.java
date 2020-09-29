public class HourlyEmployee extends Employee implements IPayable{
    //properties
    private double hourlyRate;
    private double hoursWorked;


    //constructor
    public HourlyEmployee(String name, HireDate hireDate, double hourlyRate, double hoursWorked) {
        super(name, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    @Override
    public void printBadge() {
        System.out.println("Name: " + this.getName());
        System.out.println("Type of employee: HourlyEmployee" );
        System.out.println("HireDate: " + getHireDate());
    }
    @Override
    public double calculatePay(){
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
