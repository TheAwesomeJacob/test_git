package Rest;

import java.util.Scanner;

public class englishClass {
    public static Scanner zadanie = new Scanner(System.in);
    public static int i;
    public static double sum = 0;
    public static double wynik;
    public static String[] tabela = new String[i];
    public static void main (String [] args){
        String kolektor = zadanie.nextLine();
        tabela = kolektor.split(" ");
        double h = tabela.length;
        for (String k: tabela){
            String t = tabela[i++];
            int p = t.length();
            sum = sum + p;
        }
            wynik = Math.ceil(sum/h);
        System.out.print((int)wynik);

    }
}
