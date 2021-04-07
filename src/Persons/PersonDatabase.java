package Persons;
import java.util.Arrays;
import java.util.Scanner;
public class PersonDatabase {
    private int NumbersOfPersons = 0;
    protected Person[] person = new Person[NumbersOfPersons];
    Scanner sc = new Scanner(System.in);

    public void add(Person p){
        try {
            System.out.println("Wprowadź imię pracownika:");
            String name = sc.nextLine();
            System.out.println("Wprowadź nazwisko pracownika:");
            String surName = sc.nextLine();
            System.out.println("Wprowadź PESEL pracownika:");
            String PESEL = sc.nextLine();
            Person person1 = new Person(name, surName, PESEL);
            person[NumbersOfPersons] = person1;
            person = Arrays.copyOf(person, person.length + 1);
            System.out.println("Dodałeś " + toString());
            Arrays.sort(person);
        }
        catch (NullPointerException e){
            System.err.println("Nie podawaj wartości NULL");
        }
    }

    public  void remove(Person p){
        System.out.println("Twoja tablica posiada " + person.length + " pracowników");
        for (Person per : person) {
            System.out.println(per);
        }
        System.out.println("Podaj numer id pracownika do usunięcia: ");
        int id = sc.nextInt();
        person[id] = null;
        Arrays.sort(person);

    }

    public  void getIndex(int index){
        System.out.println("Podaj numer id pracownika do wyświetlenia: ");
        int indx = sc.nextInt();
        System.out.println(person[indx]);
    }

    public void size(){
        System.out.println(person.length);
    }
}
