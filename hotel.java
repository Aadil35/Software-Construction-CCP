package Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

class Hotel {
    private final List<Room> rooms = new ArrayList<>();

    public Hotel(Name name) {
        Objects.requireNonNull(name);
    }

    public Reservation createReservation(Date date, LocalDate start,
                                         LocalDate end, int number) {
        return Reservation.create(date, start, end, number);
    }

  

public boolean available() {
    // Corrected: Use 'rooms' (the list), not 'Room' (the class)
    return rooms.stream().anyMatch(room -> !room.isOccupied()); // [cite: 125-127]
}

public void addRoom(Room room) {
    // Corrected: Use 'rooms.add', not 'Room.add'
    rooms.add(room); // [cite: 128-130]
}
}
