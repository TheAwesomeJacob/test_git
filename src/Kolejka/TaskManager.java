package Kolejka;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    static Scanner sc = new Scanner(System.in);
    private static final int ADD_TASK_TO_LIST = 1;
    private static final int EXIT = 0;
    private static final int TAKE_TASK_WITH_HIGH_PRIORITY = 2;
    static Queue <Task> queue = new PriorityQueue<>();
    public static void main(String[] args){
        option();
    }
    public static void option(){
        System.out.println("Wybierz opcje notatnika");
        System.out.println(" ");
        System.out.println("Dodanie do listy nowego zadania"+ " " + ADD_TASK_TO_LIST);
        System.out.println("Wypisania zadania z najwyższym priorytetem" + " " + TAKE_TASK_WITH_HIGH_PRIORITY);
        System.out.println("Wyjście z programu" + " " + EXIT);
        int sc1 = sc.nextInt();
        switch (sc1){
            case ADD_TASK_TO_LIST: {
                addTask();
            }
            case TAKE_TASK_WITH_HIGH_PRIORITY: {

            }
            case EXIT: {

            }
        }
    }
    public static void addTask(){
        System.out.println("Nazwa zadania:");
        String sc2 = sc.nextLine();
        System.out.println("Opis zadania (opcjonalnie)");
        System.out.println("Tak" + " " + 1 + " " + "Nie" + " " + 2);
        int sc3 = sc.nextInt();
        if (sc3 == 1){
            System.out.println("Podaj opis:");
            String sc4 = sc.nextLine();
        } else if (sc3 == 2){
            String sc4 = null;
        }
    }
}
