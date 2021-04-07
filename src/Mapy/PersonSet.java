package Mapy;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PersonSet {
    public static void main (String[] args){
        Map<String, Person> person = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Podaj 5 nazwisk oraz dat urodzenia do utworzenia mapy:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Podaj nazwisko:");
                String sc1 = sc.nextLine();
                System.out.println("Podaj datę urodzenia:");
                int sc2 = sc.nextInt();
                sc.nextLine();
                person.put(sc1, new Person(sc1, sc2));
            }
            System.out.println("Osoby zapisane w mapie: ");
            System.out.println(person.values());
            System.out.println("Jaki obiekt chcesz usunąć? (podaj nazwisko osoby)");
            String sc1 = sc.nextLine();
            person.remove(sc1);
            System.out.println("Osoby zapisane w mapie: ");
            System.out.println(person.values());
        }
        catch (InputMismatchException e){
            System.out.println("Wprowadzono niepoprawne dane do mapy");
        }

    }
}
