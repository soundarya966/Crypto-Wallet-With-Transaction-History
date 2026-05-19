public class Wallet {

    private String walletAddress;
    private String ownerName;
    private double balance;

    public Wallet(String ownerName) {

        this.ownerName = ownerName;

        this.walletAddress =
                StringUtil.applySha256(
                        ownerName + System.currentTimeMillis()
                ).substring(0, 12);

        this.balance = 1000.0;
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double amount) {
        balance += amount;
    }

    public void deductBalance(double amount) {
        balance -= amount;
    }
}
