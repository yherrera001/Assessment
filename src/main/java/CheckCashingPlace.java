import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class CheckCashingPlace {

        public static void main(String[] args) {

            HireDate hiredate = new HireDate("2","30","2020");
            HourlyEmployee hourlyEmployee = new HourlyEmployee("Mike", hiredate , 40.0, 35.0);
            Entrepreneur entrepreneur = new Entrepreneur("Jeff", 20000.0);
            HumanResources humanResources = new HumanResources();
            SalariedEmployee salariedEmployee = new SalariedEmployee("James", hiredate, 1000);

            IPayable[] payablePeople = new IPayable[3];
            payablePeople[0] = (IPayable) salariedEmployee; //casting IPayable
            payablePeople[1] = (IPayable) hourlyEmployee;
            payablePeople[2] = (IPayable) entrepreneur;

            Employee[] payableEmployee = new Employee[2];
            payableEmployee[0] = salariedEmployee;
            payableEmployee[1] = hourlyEmployee;

            humanResources.issueBadge(payableEmployee);

            ArrayList<IPayable> unsortedPeople = new ArrayList<IPayable>();
            unsortedPeople.add(salariedEmployee);
            unsortedPeople.add(hourlyEmployee);
            unsortedPeople.add(entrepreneur);
            hourlyEmployee.printBadge();
            System.out.println();
            System.out.println("Prior to sorting people by pay...");
            humanResources.payPerson(unsortedPeople);

            System.out.println();

            System.out.println("After sorting by pay... ");
            Collections.sort(unsortedPeople, new SortPeople());
            humanResources.payPerson(unsortedPeople);

            System.out.println("I freakin killed it");

        }
    }
