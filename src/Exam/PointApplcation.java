package Exam;
import Exam.Point;
import Exam.PointApplcation;
import java.util.Scanner;
public class PointApplcation {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        PointControler pc = new PointControler();
        Scanner number = new Scanner(System.in);
        System.out.println("Punkt: (" + p1.getX()+";"+p1.getY()+")");
        String choice = number.nextLine();
        switch (choice) {
            case "0": pc.addX(p1);
            System.out.println("Punkt addX: (" + p1.getX() + ";" + p1.getY() + ")");
            break;
            case "1": pc.addY(p1);
            System.out.println("Punkt addY: (" + p1.getX() + ";" + p1.getY() + ")");
            break;
            case "2": pc.minusX(p1);
            System.out.println("Punkt minusX: (" + p1.getX() + ";" + p1.getY() + ")");
            break;
            case "3": pc.minusY(p1);
            System.out.println("Punkt minusY: (" + p1.getX() + ";" + p1.getY() + ")");
            break;
        }
    }
}
