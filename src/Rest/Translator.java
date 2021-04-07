package Rest;

import java.util.Scanner;
public class Translator {
    public static int i;
    public static String[] wp = new String[i];
    public static void main(String[] args){
        String s;
        Scanner zdanie = new Scanner(System.in);
        System.out.println("Write sentence in english to translate to Pig Latin.");
        String pz = zdanie.nextLine();
        wp = pz.split(" ");
        System.out.println("Processing...");
        System.out.println(wp.length);
        int c = wp.length;
        for(String k: wp){
            System.out.print(k + " ");
            String t = wp[i++];
            int p = t.length();
            System.out.print(p + " ");
            t = pz.substring(1, p);
            char l = pz.charAt(0);
            String sk = t + l +"ay" + " ";
            System.out.print(sk);
        }
        }
}
