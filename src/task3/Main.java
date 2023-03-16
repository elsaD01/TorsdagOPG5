package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Building building = new Building(2, 3, true);
        System.out.println(countLampsInBuilding(building));
        System.out.println(isNormal(building));

    }
    public static int countLampsInBuilding(Building b1){

        ArrayList<Room> rooms = b1.getRooms();
        int total = 0;
        for (Room room:rooms) {
            int NumberOfLamps = room.getNumberOfLamps();
            total += NumberOfLamps;

        }
        return total;

    }

    public static boolean isNormal(Building b1){
        int numberOfRooms = b1.getRooms().size();
        int numberOfFloors = b1.getNumberOfFloors();
        if (numberOfFloors > numberOfRooms){
            return true;
        }else{
            System.out.println("this is a very weird building");
            return false;
        }

    }

}
