package Calculator2WithExepctions;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wporawdź pierwszą liczbę: ");
        double sc1 = sc.nextInt();
        System.out.println("Wporowadź znak operacji matematycznej: ");
        sc.nextLine();
        String sc2 = sc.nextLine();
        System.out.println("Wprowadź drugą liczbę: ");
        int sc3 = sc.nextInt();
        try{
            switch (sc2){
                    case "+":
                    {

                        Double sc4 = sc1 + sc3;
                        System.out.println(sc4);
                        System.out.println("Działanie wykonane prawidłowo");
                        break;
                    }
                    case "-":
                    {
                        Double sc4 = sc1 - sc3;
                        System.out.println(sc4);
                        System.out.println("Działanie wykonane prawidłowo");
                        break;
                    }
                    case "*":
                    {
                        Double sc4 = sc1 * sc3;
                        System.out.println(sc4);
                        System.out.println("Działanie wykonane prawidłowo");
                        break;
                    }
                    case "/":
                    {
                        Double sc4 = sc1 / sc3;
                        System.out.println(sc4);
                        System.out.println("Działanie wykonane prawidłowo");
                        break;
                    }
                default:{
                    throw new UnknownOperatorException("Podałeś nieprawidłowe dane");
                }
                }
    } catch (ArithmeticException | UnknownOperatorException e){
            System.err.println("Działanie zostało wykonane nieprawidłowo");
            System.err.println(e.getMessage());
            sc.nextLine();
        }
    }
}
