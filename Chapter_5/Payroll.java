import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input hours worked
        System.out.print("How many hours did you work this week? ");
        double hoursWorked = input.nextDouble();

        // Input pay rate
        System.out.print("What is your regular pay rate? ");
        double payRate = input.nextDouble();

        // nag Create employee object 
        Employee emp = new Employee(1, payRate);

        // kani kay gi ang Calculate pays
        double regularPay = emp.calculateRegularPay(hoursWorked);
        double overtimePay = emp.calculateOvertimePay(hoursWorked);

        // kani kay gi Display ang output 
        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);

        input.close();
    }
}
