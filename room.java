package Main;

class Room {
    private final int number;
    private Guest occupant;

    public Room(int number) {
        if (number <= 0)
            throw new IllegalArgumentException("Room number must be positive");
        this.number = number;
    }

    public boolean isOccupied() {
        return occupant != null;
    }

    public void createGuest(Guest guest) {
        if (isOccupied())
            throw new IllegalStateException("Room already occupied");
        this.occupant = guest;
    }

	public static Object stream() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void add(Room room) {
		// TODO Auto-generated method stub
		
	}
}
