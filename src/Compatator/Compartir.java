package Compatator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Compartir{
    public static void main (String[] args){
        Random generator = new Random();
        Integer tab[] = new Integer[20];
        for (int i = 0; i < 20; i++) {
            tab[i] = generator.nextInt();
        }
        Arrays.sort(tab);
        System.out.println("Posortowana rosnąco");
        for (int k: tab) {
            System.out.println(k);
        }
        Arrays.sort(tab, new Comparator<Integer>(){
        @Override
        public int compare(Integer integer, Integer t1){
            return -(integer.compareTo(t1));
        }

        });
    }
}
