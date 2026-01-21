package Main;

import java.util.Objects;

class ReservePlayer {
    private final CreditCard creditCard;
    private final String identity;

    public ReservePlayer(CreditCard creditCard, String identity) {
        this.creditCard = Objects.requireNonNull(creditCard);
        if (identity == null || identity.isBlank())
            throw new IllegalArgumentException("Identity required");
        this.identity = identity;
    }

    public static ReservePlayer create(CreditCard card, String identity) {
        return new ReservePlayer(card, identity);
    }
}
