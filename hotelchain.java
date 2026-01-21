package Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class HotelChain {
    private final List<Hotel> hotels = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public Reservation makeReservation(Hotel hotel, Date date,
                                       LocalDate start, LocalDate end, int number) {
        return hotel.createReservation(date, start, end, number);
    }

    public void cancelReservation() {
        // logic placeholder
    }

    public void checkInGuest() {
        // logic placeholder
    }

    public void checkOutGuest() {
        // logic placeholder
    }

    public ReservePlayer createReservePlayer(CreditCard card, String id) {
        return ReservePlayer.create(card, id);
    }

    public boolean canMakeReservation() {
        return true;
    }
}
