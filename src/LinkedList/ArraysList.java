package LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList {
    static ArrayList<Integer> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static String sc2;
    public static void main (String[] args){
        int w = 0;
        do{
            load();
        }
        while (!sc2.equals("exit"));

        for (int i = 0; i < list.size(); i++) {
            w += list.get(i);
        }
        System.out.println(w);

    }
    static void load(){
        System.out.println("Wprowadź dowolną liczbę lub exit");
            sc2 = sc.nextLine();
            if (!sc2.equals("exit")){
                list.add(Integer.valueOf(sc2));
            }
    }
}
