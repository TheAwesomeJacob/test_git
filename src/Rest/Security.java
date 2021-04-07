package Rest;

import java.util.Scanner;

public class Security {
    public static char thieft = 'T';
    public static char guard = 'G';
    public static char money = '$';
    public static char freeSpace = 'x';
    public static Scanner text = new Scanner(System.in);
    public static String text2;

    public static void main(String[] args){
        text2 = text.nextLine();
        String table[] = text2.split(" ");
        for(int i = 0; i<text2.length(); i++){
            if(freeSpace == 'x'){
                continue;
            }
        }
    }
}
