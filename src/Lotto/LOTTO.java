package Lotto;

import java.util.*;

public class LOTTO {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static Random random = new Random();
    public static void main(String[] args){
        System.out.println("Podaj swoje typy do losowania Lotto: ");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int sc1 = sc.nextInt();
            arrayList1.add(sc1);
        }
        generate();
        randomize();
        checkResult(arrayList1);

    }
    public static void generate(){
        for (int i = 0; i < 6; i++) {
            arrayList.add(random.nextInt(49));
        }
    }
    public static void randomize(){
        Collections.shuffle(arrayList);
    }
    public static void checkResult(ArrayList<Integer> numbers){
        System.out.println("Trafione liczby");
        for (Integer s : numbers) {
            int freq = Collections.frequency(arrayList, s);
            if(freq == 1) {
            System.out.println("Liczba " + s + " " + "została wylosowana");
            }
            else{
                System.out.println("Liczba " + s + " nie została wylosowana");
            }
        }
    }
}
