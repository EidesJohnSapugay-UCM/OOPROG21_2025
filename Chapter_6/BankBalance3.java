public class BankBalance3 {
    public static void main(String[] args) {
        double balance = 10000.0;
        double newBalance;
        double[] rates = {0.02, 0.03, 0.04, 0.05};

        System.out.println("Enter initial bank balance > " + (int)balance);

        for (int i = 0; i < rates.length; i++) {
            double rate = rates[i];
            newBalance = balance;

            System.out.println();
            System.out.printf("With an initial balance of %.4f at an interest rate of %.2f%n", balance, rate);

            for (int year = 1; year <= 4; year++) {
                newBalance = newBalance + (newBalance * rate);

                if (year == 1 || year == 2) {
                    System.out.printf("After year %d balance is %.1f%n", year, newBalance);
                } else if (year == 3) {
                    System.out.printf("After year %d balance is %.2f%n", year, newBalance);
                } else {
                    System.out.printf("After year %d balance is %s%n", year, newBalance);
                }
            }
        }
    }
}
