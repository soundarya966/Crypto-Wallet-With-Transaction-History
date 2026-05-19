import java.util.ArrayList;

public class WalletService {

    ArrayList<Transaction> transactions =
            new ArrayList<>();

    // Send cryptocurrency
    public void sendMoney(
            Wallet sender,
            Wallet receiver,
            double amount
    ) {

        if (sender.getBalance() >= amount) {

            sender.deductBalance(amount);

            receiver.addBalance(amount);

            Transaction transaction =
                    new Transaction(
                            sender.getOwnerName(),
                            receiver.getOwnerName(),
                            amount
                    );

            transactions.add(transaction);

            System.out.println(
                    "\nTransaction Successful!"
            );

        } else {

            System.out.println(
                    "\nInsufficient Balance!"
            );
        }
    }

    // Display transactions
    public void displayTransactions() {

        for (Transaction transaction : transactions) {

            transaction.displayTransaction();
        }
    }
}
