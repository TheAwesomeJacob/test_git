package Napisy;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String sc2;
        System.out.println("Ile wyrazów chcesz wproadzić?: ");
        int sc1 = sc.nextInt();
        ++sc1;
        System.out.println("Wprowadź wyrazy:");
        for (int i = 0; i < sc1; i++) {
            sc2 = sc.nextLine();
            if(sc2.length() != 0) {
                char sc4 = sc2.charAt(sc2.length() - 1);
                builder.append(sc4);
            }
        }
        String numbers = builder.toString();
        System.out.println(numbers);
    }
}
