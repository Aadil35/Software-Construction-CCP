package Main;

class CreditCard {
    private final String number;

    public CreditCard(String number) {
        if (number == null || number.length() < 8)
            throw new IllegalArgumentException("Invalid credit card");
        this.number = number;
    }
}
