package Shapes;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Jaką figurę chcesz obliczyć: ");
        String sc1 = sc.nextLine();
        switch (sc1){
            case "trójkąt":{
                Triangle triangle = new Triangle();
                triangle.plusOb();
                triangle.plusV();
                break;
            }
            case "prostokąt":{
                Rectangle rectangle = new Rectangle();
                rectangle.plusOb();
                rectangle.plusV();
                break;
            }
            case "koło":{
                Circle circle = new Circle();
                circle.plusOb();
                circle.plusV();
                break;
            }
        }
    }
}
