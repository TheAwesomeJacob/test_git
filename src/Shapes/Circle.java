package Shapes;
import java.util.Scanner;
class Circle implements Shape {
    Scanner sc = new Scanner(System.in);
    private static double PI = 3.14;
    public void plusOb(){
        System.out.println("Wprowadź dane figury ");
        double sc2a = sc.nextInt();
        double x = PI * (sc2a * sc2a);
        System.out.println(x);
    }
    public void plusV(){
        System.out.println("Wprowadź dane figury ");
        double sc2a = sc.nextInt();
        double x = 2 * PI * sc2a;
        System.out.println(x);
    }
}
