package Exam;
import java.util.Scanner;
public class Hospital {
    private final int maxPatientNumber = 10;
    Scanner user = new Scanner (System.in);
    private Patient[] tab = new Patient[maxPatientNumber];

    public int getRegPatient() {
        return regPatient;
    }

    public void setRegPatient(int regPatient) {
        this.regPatient = regPatient;
    }

    private int regPatient = 0;
    public Patient newPatient(){
            System.out.println("Imię pacjenta: ");
            String firstName = user.nextLine();
            System.out.println("Nazwisko pacjenta: ");
            String lastName = user.nextLine();
            System.out.println("Wpisz jego PESEL: ");
            String PESEL = user.nextLine();
            return tab[regPatient] = new Patient(firstName, lastName, PESEL);
    }
    public void listOfPatient(){
        for (Patient tmp: tab) {
            Patient info = tmp;
            System.out.println(info);
        }
    }
    public void close(){
        user.close();
    }
}
