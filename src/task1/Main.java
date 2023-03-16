package task1; //ArrayList og objekter
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> Customer = new ArrayList<>();

        Customer.add("Ted");
        Customer.add("Kai");
        Customer.add("Mai");
        Customer.add("Lea");
        Customer.add("Mel");
        Customer.add("Yea");

        System.out.println("\n" + "List of customers: ");

        Customer.forEach((n)-> printCustomers(n));


        Customer c1 = new Customer();
        System.out.println("\n" + "Private firstName and userName: ");
        c1.SetCustomer("ElsaD","IamElsa122");


        System.out.println(c1.getFirstName());
        System.out.println(c1.getUsername());

    }

    public static void printCustomers(String n){
        System.out.println("Customers names are: " + n);
    }

}
