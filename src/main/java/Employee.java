
import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.Scanner;

public abstract class Employee extends Person {
    //properties
    private HireDate hireDate;


    //constructor
    public Employee(String name, HireDate hireDate) {
        super(name);
        this.hireDate = hireDate;
    }


    public HireDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }
    public void printBadge() {
        System.out.println("Name: " + this.getName());
        System.out.println("Type of employee: " );
        System.out.println("HireDate: " + getHireDate());
    }

}
