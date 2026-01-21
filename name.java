package Main;

import java.time.LocalDate;
import java.util.*;

class Name {
    private final String value;

    public Name(String value) {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException("Name cannot be empty");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
