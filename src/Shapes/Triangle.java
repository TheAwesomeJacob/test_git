package Shapes;
import java.util.Scanner;
class Triangle implements Shape {
    Scanner sc = new Scanner(System.in);
    public Triangle(){
    }
    public void plusOb(){
        System.out.println("Wprowadź dane figury do obliczenia obwodu ");
        double sc2a = sc.nextInt();
        double sc2b = sc.nextInt();
        double sc2c = sc.nextInt();
        double x =  sc2a + sc2b + sc2c;
        System.out.println(x);
    }
    public void plusV(){
        System.out.println("Wprowadź dane figury do pobliczenia pola ");
        double sc2h = sc.nextInt();
        double sc2a = sc.nextInt();
        double x = (sc2a * sc2h) / 2;
        System.out.println(x);
    }
}
