package Rest;

import java.util.Scanner;
public class AlienTranslator {
    public static Scanner sample = new Scanner (System.in);
    public static char kw;
    public static void main(String[] args){
        System.out.println("Write sentence in English to translate:");
        String sw = sample.nextLine();

        for (int i = sw.length()-1; i >= 0 ; --i){
            System.out.print(sw.charAt(i));
        }
    }
}
