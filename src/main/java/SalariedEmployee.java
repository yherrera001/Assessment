public class SalariedEmployee extends Employee implements IPayable {
    private int salary;

    public SalariedEmployee(String name, HireDate hireDate, int salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    //methods
    @Override
    public void printBadge() {
        System.out.println("Name: " + this.getName());
        System.out.println("Type of employee: SalariedEmployee" );
        System.out.println("HireDate: " + getHireDate());
    }
    @Override
    public double calculatePay(){
        return salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                '}';
    }
}
