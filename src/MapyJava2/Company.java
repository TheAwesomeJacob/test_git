package MapyJava2;

import java.util.Scanner;
import java.util.TreeMap;

public class Company {
    TreeMap <String, Employee> treeMap = new TreeMap<>();
    Scanner sc = new Scanner(System.in);
    public void option() {
        final int NEW_EMPLOYEE = 1;
        final int SEARCH_EMPLOYEE = 2;
        final int EXIT = 0;
        int sc1;
        String sc2, sc3;
        do {
        System.out.println("Opcje do wyboru");
        System.out.println("Wprowadzenie nowego pracownika" + " " + NEW_EMPLOYEE);
        System.out.println("Wyszukanie pracownika" + " " + SEARCH_EMPLOYEE);
        System.out.println("Wyjście z programu" + " " + EXIT);
        sc1 = sc.nextInt();
            switch (sc1) {
                case NEW_EMPLOYEE: {
                    System.out.println("Podaj imię pracownika:");
                    sc.nextLine();
                    sc2 = sc.nextLine();
                    System.out.println("Podaj nazwisko pracownika:");
                    sc3 = sc.nextLine();
                    System.out.println("Podaj wynagrodzenie pracownika:");
                    sc1 = sc.nextInt();
                    setNEW_EMPLOYEE(sc2, sc3, sc1);
                    System.out.println("Wprowadzono poprawnie parcownika ^^");
                    break;
                }
                case SEARCH_EMPLOYEE: {
                    System.out.println("Podaj nazwisko pracownika aby wyszukać informacje na jego temat:");
                    sc.nextLine();
                    sc3 = sc.nextLine();
                    setSEARCH_EMPLOYEE(sc3);
                    break;
                }
                case EXIT: {
                    System.out.println("Shutdown system...");
                    break;
                }
            }
        }while(sc1 != EXIT);
    }
    public void setNEW_EMPLOYEE(String n, String s, int w){
        treeMap.put(s, new Employee(n, s, w));
    }
    public void setSEARCH_EMPLOYEE(String s){
        Employee w = treeMap.get(s);
        System.out.println(w);
    }
}
