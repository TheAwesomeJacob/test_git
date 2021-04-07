package ZUT;
import java.util.Scanner;
public class Student {
    private final static int maxStudents = 1000;
    private String firstName;
    private String lastName;
    public static int Index = 0;
    public static String[] students = new String[maxStudents];
    public static Scanner sc = new Scanner(System.in);

    Student(){

    }
    Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public static Student createStudent(){
        System.out.println("Imię studenta: ");
        String firstName = sc.nextLine();
        System.out.println("Nazwisko studenta: ");
        String lastName = sc.nextLine();
        String newStudent = firstName + " "  + lastName + " " + Index;
        students[Index] = newStudent;
        Index++;
        return new Student();

    }
    public void close(){
        sc.close();
    }
    public void printinfo(){
        if (Index == 1){
            System.out.println("Za mało studentów do wyświetlenia");
        }
        else{
            System.out.println(students[Index]);
        }
    }

}
