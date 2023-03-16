package task2;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ArrayList<String> coffeeMenu = new ArrayList<>();

        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        Scanner scan = new Scanner(System.in);
        scan.nextLine();

      /*  ArrayList<String> coffeeMenu = new ArrayList<>();
        for (int i = 0; i < coffeeMenu.size(); i++) {
            String menu = coffeeMenu.get(i);
            System.out.println(menu);
        }
        */


    }
}