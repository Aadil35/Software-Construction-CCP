package Main;

import java.util.Objects;

class Guest {
    private final Name name;
    private final Address addressDetails;

    public Guest(Name name, Address addressDetails) {
        this.name = Objects.requireNonNull(name);
        this.addressDetails = Objects.requireNonNull(addressDetails);
    }

    public static Guest create(Name name, Address address) {
        return new Guest(name, address);
    }
}
