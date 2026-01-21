package Main;

class Money {
    private final double amount;

    public Money(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Amount must be positive");
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
