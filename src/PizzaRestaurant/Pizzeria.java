package PizzaRestaurant;
import java.util.Scanner;
public class Pizzeria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dostępne pizze: ");
        for (Pizza name : Pizza.values()) {
            System.out.println(name.getName());
        }
        System.out.println("Jaką pizze chcesz?");
        String scName = sc.nextLine();
        Pizza pizza = Pizza.fromName(scName);
        System.out.println("Wybrałeś"+ " " + pizza);

    }
}
