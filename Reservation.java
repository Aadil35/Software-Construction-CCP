package Main;

import java.time.LocalDate;
import java.util.Date;

class Reservation {
    private final LocalDate endDate;
    private final int number;

    public Reservation(Date reservationDate, LocalDate startDate,
                       LocalDate endDate, int number) {
        if (startDate.isAfter(endDate))
            throw new IllegalArgumentException("Invalid date range");

        this.endDate = endDate;
        this.number = number;
    }

    public static Reservation create(Date reservationDate,
                                     LocalDate startDate,
                                     LocalDate endDate,
                                     int number) {
        return new Reservation(reservationDate, startDate, endDate, number);
    }
}
