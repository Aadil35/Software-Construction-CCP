package Main;

class Address {
    private final String details;

    public Address(String details) {
        if (details == null || details.isBlank())
            throw new IllegalArgumentException("Address cannot be empty");
        this.details = details;
    }
}
