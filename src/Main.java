public class Main {

    public static void main(String[] args) {

        // Create Wallets
        Wallet user1 =
                new Wallet("Alice");

        Wallet user2 =
                new Wallet("Bob");

        // Wallet Service
        WalletService service =
                new WalletService();

        System.out.println("=================================");
        System.out.println(" CRYPTO WALLET SYSTEM ");
        System.out.println("=================================");

        // Display Wallets
        System.out.println(
                "\nWallets Created Successfully!"
        );

        System.out.println(
                "\nAlice Wallet Address: "
                        + user1.getWalletAddress()
        );

        System.out.println(
                "Bob Wallet Address: "
                        + user2.getWalletAddress()
        );

        // Initial Balances
        System.out.println(
                "\nInitial Wallet Balances:"
        );

        System.out.println(
                "Alice Balance: "
                        + user1.getBalance()
        );

        System.out.println(
                "Bob Balance: "
                        + user2.getBalance()
        );

        // Transaction
        System.out.println(
                "\nSending 200 coins from Alice to Bob..."
        );

        service.sendMoney(
                user1,
                user2,
                200
        );

        // Updated Balances
        System.out.println(
                "\nUpdated Wallet Balances:"
        );

        System.out.println(
                "Alice Balance: "
                        + user1.getBalance()
        );

        System.out.println(
                "Bob Balance: "
                        + user2.getBalance()
        );

        // Transaction History
        System.out.println(
                "\nTransaction History:"
        );

        service.displayTransactions();

        System.out.println("\n=================================");
        System.out.println(" TRANSACTION COMPLETED ");
        System.out.println("=================================");
    }
}
