package ItShop;
import java.util.Scanner;
public class DataStore {
    private final static int MAX_COMPUTERS = 10000;
    private final static int START = 1;
    private final static int PRINT = 2;
    private final static int END = 0;
    int sc2;
    Scanner sc = new Scanner(System.in);
    private String[] computers = new String[MAX_COMPUTERS];
    private Computer CPU = new Computer();
    public void add(){
        int sc1;
        do{
            System.out.println("Co chcesz zrobić?");
            System.out.println(START + " Dodać komputer");
            System.out.println(PRINT + " Wypisać wszysztkie komputery");
            System.out.println(END + " Zakończyć program");
            sc1 = sc.nextInt();
            switch(sc1){
                case START:{
                    System.out.println("Ile chcesz dodać komputerów?");
                    sc2 = sc.nextInt();
                    addComputer();
                    break;
                }
                case PRINT:{
                    for (int notebook = 0; notebook < sc2; notebook++){
                        System.out.println(computers[notebook]);
                    }
                    break;
                }
                case END:{
                    System.out.println("Żegnam...");
                    break;
                }
            }
       }while(sc1 != END);
    }
    public void addComputer(){
        for (int notebook = 0; notebook < sc2; notebook++){
            System.out.println("Podaj model:");
            int sc3 = sc.nextInt();
            CPU.setModel(sc3);
            System.out.println("Podaj producenta:");
            sc.nextLine();
            String sc4 = sc.nextLine();
            CPU.setProducer(sc4);
            String comp = CPU.getModel() + " " + CPU.getProducer();
            computers[notebook] = comp;
        }
    }
}
