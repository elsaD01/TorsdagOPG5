package task3;

import java.util.ArrayList;

public class Building {

    final ArrayList<Room> Rooms;

    int numberOfBathrooms;

    int numberOfFloors;

    boolean isOfficeBuilding;

    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        Room rom1 = new Room(2, 4, 6);
        Room rom2 = new Room(2, 4, 6);
        Room rom3 = new Room(2, 4, 6);

        ArrayList<Room> Rooms = new ArrayList<Room>();
        Rooms.add(rom1);
        Rooms.add(rom2);
        Rooms.add(rom3);
        this.Rooms = Rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room>getRooms()
    {
        return Rooms;
    }

    public int getNumberOfBathrooms()
    {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors()
    {
        return numberOfFloors;
    }

    public boolean getIsOfficeBuilding()
    {
        return isOfficeBuilding;
    }



}
