import java.util.Scanner;

class CurrencyConverter {
    void Ruppe_to_other() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();

        System.out.print("----------------------------------------");
        System.out.println("\nRuppe to other currency");
        System.out.println("Dollar: " + amount * 0.012); // US Dollar
        System.out.println("Euro: " + amount * 0.011);
        System.out.println("Pound: " + amount * 0.0095); // British pound
        System.out.println("Yen: " + amount * 1.78); // Japanese Yen
        System.out.print("----------------------------------------\n");
    }

    void Dollar_to_other() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = sc1.nextDouble();

        System.out.print("----------------------------------------");
        System.out.println("\nDollar to other currency");
        System.out.println("Ruppe: " + amount * 83.11); // Indian Rupee
        System.out.println("Euro: " + amount * 0.92);
        System.out.println("Pound: " + amount * 0.79); // British pound
        System.out.println("Yen: " + amount * 148.16); // Japanese Yen
        System.out.print("----------------------------------------\n");
    }

    void Euro_to_other() {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = sc2.nextDouble();

        System.out.print("----------------------------------------");
        System.out.println("\nEuro to other currency");
        System.out.println("Ruppe: " + amount * 90.20); // Indian Rupee
        System.out.println("Dollar: " + amount * 1.09); // US Dollar
        System.out.println("Pound: " + amount * 0.85); // British pound
        System.out.println("Yen: " + amount * 160.78); // Japanese Yen
        System.out.print("----------------------------------------\n");
    }

    void Pound_to_other() {
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = sc3.nextDouble();

        System.out.print("----------------------------------------");
        System.out.println("\nEuro to other currency");
        System.out.println("Ruppe: " + amount * 105.57); // Indian Rupee
        System.out.println("Dollar: " + amount * 1.27); // US Dollar
        System.out.println("Euro: " + amount * 1.17);
        System.out.println("Yen: " + amount * 188.19); // Japanese Yen
        System.out.print("----------------------------------------\n");
    }

    void Yen_to_other() {
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = sc4.nextDouble();

        System.out.print("----------------------------------------");
        System.out.println("\nEuro to other currency");
        System.out.println("Ruppe: " + amount * 0.56); // Indian Rupee
        System.out.println("Dollar: " + amount * 0.0067); // US Dollar
        System.out.println("Euro: " + amount * 0.0062);
        System.out.println("Pound: " + amount * 0.0053); // British pound
        System.out.print("----------------------------------------\n");
    }
}

class Main {
    public static void main(String[] args) {
        CurrencyConverter c = new CurrencyConverter();
        Scanner sc5 = new Scanner(System.in);
        System.out.println("----------------Welcome to the Currency Converter----------------");
        boolean b = true;
        while (b) {
            System.out.println("\nPress 1 INR to other"); // Indian Rupee
            System.out.println("Press 2 USD to other"); // US Dollar
            System.out.println("Press 3 EUR to other"); // Euro
            System.out.println("Press 4 GBP to other"); // British pound
            System.out.println("Press 5 JPY to other"); // Japanese Yen
            System.out.println("Press 6 for exit from the system\n");

            System.out.print("Enter your choice: ");
            int choice = sc5.nextInt();

            switch (choice) {
                case 1:
                    c.Ruppe_to_other();
                    break;

                case 2:
                    c.Dollar_to_other();
                    break;

                case 3:
                    c.Euro_to_other();
                    break;

                case 4:
                    c.Pound_to_other();
                    break;

                case 5:
                    c.Yen_to_other();
                    break;

                case 6:
                    b = false;
                    System.out.println("Thank You for visiting");
                    break;

                default:
                    System.out.println("You have Entered invalid choice, Please enter correct choice.");
                    break;
            }

        }

    }
}