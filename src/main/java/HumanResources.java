import java.util.ArrayList;

public class HumanResources {
        private void printPaymentInfo(IPayable person){
            System.out.println(person.getClass().getSimpleName() + " should be paid "+ person.calculatePay());
        }
        public void payPerson(ArrayList<IPayable> people){
            for (IPayable person : people){
                printPaymentInfo(person);
            }
        }
        public void issueBadge(Employee[] employees) {
            for (Employee employee : employees) {
                employee.printBadge();


            }
        }
    }
