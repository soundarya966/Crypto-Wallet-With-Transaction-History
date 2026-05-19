public class Transaction {

    private String sender;
    private String receiver;
    private double amount;

    public Transaction(
            String sender,
            String receiver,
            double amount
    ) {

        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    public void displayTransaction() {

        System.out.println("---------------------------------");

        System.out.println("Sender: " + sender);

        System.out.println("Receiver: " + receiver);

        System.out.println("Amount: " + amount);

        System.out.println("---------------------------------");
    }
}
