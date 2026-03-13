public class Transaction {

    String description;
    double amount;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }
    public void printSummary() {
        System.out.println(
             description + " RM " + amount
        );
        }

    public static void main(String[] args) {

        // Create a Transaction object
        Transaction t = new Transaction("Each person pays ",12.50);

        // Call its method
        t.printSummary();
        // Output: Transaction: Lunch - RM12.5

        // Create another — completely independent
        Transaction t2 = new Transaction("Each person pays ",8.00);
        t2.printSummary();
        // Output: Transaction: Lunch - RM8.0

    }
}