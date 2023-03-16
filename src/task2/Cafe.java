package task2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    ArrayList<String> coffeeMenu = new ArrayList<String>();


    public void loadMenuData() {

        try {
            File file = new File("coffees.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
                System.out.println(coffeeMenu);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot read file ");
            e.printStackTrace();
        }

        coffeeMenu.add("coffees.txt");

        for (String menu : coffeeMenu) {
            System.out.println(menu);

        }
    }
}


