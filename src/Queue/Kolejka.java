package Queue;
        import java.util.InputMismatchException;
        import java.util.LinkedList;
        import java.util.Queue;
        import java.util.Scanner;

public class Kolejka {
    public static void main(String[] args) {
        Queue<Integer> kolejka = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj 10 liczb: ");
        try {
            for (int i = 0; i < 10; i++) {
                int sc1 = sc.nextInt();
                kolejka.offer(sc1);
            }
            System.out.println("Stan kolejki: " + kolejka);
            kolejka.poll();
            System.out.println("Stan kolejki: " + kolejka);
            System.out.println("Jaką liczbę chcesz sprawdzić?: ");
            int sc2 = sc.nextInt();
            for (int j = 0; j < 9; j++) {
                int k = kolejka.poll();
                if (k == sc2) {
                    System.out.println("Podana przez Ciebie liczba znajduje się w kolejce: " + k);
                    break;
                } else {
                    System.out.println("Niestety ta liczba w kolejce nie pasuje do podanej przez Ciebie. Przechodzimy do kolejnej liczby.");
                }
            }
        }
        catch (NullPointerException | InputMismatchException e){
            System.out.println("Podano niewłaściwe dane do konsoli");
        }

    }
}
