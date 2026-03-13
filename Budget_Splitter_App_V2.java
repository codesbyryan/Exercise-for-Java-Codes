import java.util.Scanner;

public class Budget_Splitter_App_V2 {
    static void startApp(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Budget Splitter App");

        double totalAmount;
        do {
            System.out.print("What is the total amount? ");
            totalAmount = input.nextDouble();

            if (totalAmount <= 0) {
                System.out.println("Impossible, try again.");
            }
        } while (totalAmount <= 0);

        int numberOfPeople;
        do {
            System.out.print("How many people are sharing the budget? ");
            numberOfPeople = input.nextInt();

            if (numberOfPeople <= 1) {
                System.out.println("What? Be realistic, try again.");
            }
        } while (numberOfPeople <= 1);

        double amountPerPerson = totalAmount / numberOfPeople;
        amountPerPerson = Math.round(amountPerPerson * 100.0) / 100.0;

         // Create a Transaction object
        Transaction t = new Transaction("Each person pays ", amountPerPerson);

        // Call its method
        t.printSummary();

        input.close();
    }

    public static void main(String[] args) {
        startApp(args);
    }
}

class Transaction {
    String description;
    double amount;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public void printSummary() {
        System.out.println(description + " RM " + amount);
    }
}
