package Shapes;
import java.util.Scanner;
class Rectangle implements Shape {
    Scanner sc = new Scanner(System.in);
    public void plusOb(){
        System.out.println("Wprowadź dane figury ");
        double sc2a = sc.nextInt();
        double sc2b = sc.nextInt();
        double x = (2 * sc2a) + (2 * sc2b);
        System.out.println(x);
    }
    public void plusV(){
        System.out.println("Wprowadź dane figury ");
        double sc2a = sc.nextInt();
        double sc2b = sc.nextInt();
        double x = sc2a * sc2b;
        System.out.println(x);
    }
}
