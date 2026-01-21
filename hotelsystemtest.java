package Main; 

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
          

import java.time.LocalDate;
import java.util.Date;

import org.junit.Test;

class HotelSystemTest {

    @Test
    void testInvalidNameThrows() {
    
        assertThrows(IllegalArgumentException.class, () -> {
            new Name(""); 
        });
    }

    @Test 
    void testInvalidDateRange() {
   
        LocalDate start = LocalDate.now().plusDays(10);
        LocalDate end = LocalDate.now();
        assertThrows(IllegalArgumentException.class, () -> {
            new Reservation(new Date(), start, end, 1);
        });
    }

    @Test
    void testRoomOccupancy() {
      
        Room room = new Room(101);
        assertFalse(room.isOccupied());
        
        Guest guest = Guest.create(new Name("Test Guest"), new Address("Test Road"));
        room.createGuest(guest);
        assertTrue(room.isOccupied());
    }
}
