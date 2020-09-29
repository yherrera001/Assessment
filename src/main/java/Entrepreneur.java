public class Entrepreneur extends Person implements IPayable{
    //properties, instance fields, attributes,
    private double income;

    //constructor
    public Entrepreneur(String name, double income) {
        super(name);
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    //methods
    public double calculatePay(){
return getIncome();
    }

    @Override
    public String toString() {
        return "Entrepreneur{" +
                "income=" + income +
                '}';
    }
}
