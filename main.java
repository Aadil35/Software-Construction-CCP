package Main;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        HotelChain chain = new HotelChain();
        Hotel hotel = new Hotel(new Name("Grand Hotel"));
        chain.addHotel(hotel);

        Room room = new Room(101);
        hotel.addRoom(room);

        Guest guest = Guest.create(
                new Name("Ali Khan"),
                new Address("Karachi")
        );

        room.createGuest(guest);

        Reservation reservation = chain.makeReservation(
                hotel,
                new Date(),
                LocalDate.now(),
                LocalDate.now().plusDays(2),
                1
        );

        System.out.println("Reservation created successfully.");
    }
}
