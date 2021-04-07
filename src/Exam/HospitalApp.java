package Exam;
import java.util.Scanner;
public class HospitalApp {
    public static void main(String[] args) {
        Hospital action = new Hospital();
        Scanner scan = new Scanner(System.in);
        int h = 1;
        do{
            System.out.println("Co chcesz zrobić?");
            System.out.println("0 - wyjście z systemu");
            System.out.println("1 - przypisz nowego pacjenta");
            System.out.println("2 - wyświetl wszystkich zapisanych pacjentów");
            int i = scan.nextInt();
          switch(i){
              case 0:
              {
                  System.out.println("Do widzenia...");
                  h = 0;
                  break;
              }
              case 1:
              {
                  System.out.println("Ilu chcesz wprowadzić pacjentów? ");
                  int number = scan.nextInt();
                  if(action.getRegPatient() == 10){
                      System.out.println("Nie ma miejsca w systemie na nowych pacjenów...");
                  }
                  else {
                      for (int j = 0; j < number; j++) {
                          action.setRegPatient(j);
                          action.newPatient();
                      }
                  }
                  break;
              }
              case 2:
              {
                  action.listOfPatient();
                  h = 2;
                  break;
              }
          }
        }while(h == 1);
    }
}
