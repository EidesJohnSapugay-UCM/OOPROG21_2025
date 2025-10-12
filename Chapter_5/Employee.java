public class Employee {
    private int employeeNumber;
    private double payRate;

    // Constants
    public static final int MAX_EMPLOYEE_NUMBER = 9999;

    public static final double MAX_PAY_RATE = 500.00;
    public static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate) {
        setEmployeeNumber(employeeNumber);
        setPayRate(payRate);
    }

    public void setEmployeeNumber(int employeeNumber) {
        if (employeeNumber > 0 && employeeNumber <= MAX_EMPLOYEE_NUMBER) {
            this.employeeNumber = employeeNumber;
        } else {
            throw new IllegalArgumentException("Invalid Employee Number (1 - " + MAX_EMPLOYEE_NUMBER + ")");
        }
    }

    public void setPayRate(double payRate) {
        if (payRate > 0 && payRate <= MAX_PAY_RATE) {
            this.payRate = payRate;
        } else {
            throw new IllegalArgumentException("Invalid Pay Rate (1 - " + MAX_PAY_RATE + ")");
        }
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double calculateRegularPay(double hoursWorked) {
        double regularHours = Math.min(40, hoursWorked);
        return regularHours * payRate;
    }

    public double calculateOvertimePay(double hoursWorked) {
        double overtimeHours = Math.max(0, hoursWorked - 40);
        return overtimeHours * payRate * OVERTIME_MULTIPLIER;
    }
          }
