package ZUT;

import java.util.Scanner;

public class University {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int exit = 0;
        int start = 1;
        int end = 0;
        int open = 2;
        int option;
        Student student = new Student();
        do{
            System.out.println("Wybierz opcję wyboru:");
            System.out.println(start + " - wprowadzenie studenta");
            System.out.println(open +  " - lista studentów");
            System.out.println(end + " - zakończenie programu");
            option = sc.nextInt();
            switch (option){
                case 1:
                    student.createStudent();
                    break;
                case 2:
                    for (int i = 0; i < Student.Index; i++) {
                        student.printinfo();
                    }
                    break;
                case 0:
                    System.out.println("Zakończenie programu...");
                    break;
            }

        }while(option != exit);
    }
}
