package ImportantLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomNumbersWithLambda {
    public static void main(String[] args){
        Random random = new Random();
        Supplier<Integer> supplier = () ->{
            int rand = random.nextInt(100);
            return rand;
        };
        List<Integer> list = randomNumberList(supplier);
        showList(list, n->System.out.print(n + " "));
        List<Integer> listDivided = numbersDividedByTwo(list, n -> n%2 == 0);
        System.out.println(" ");
        showList(listDivided, n->System.out.print(n + " "));
    }
    private static <T> List<T> randomNumberList(Supplier<T> supplier){
        List <T> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(supplier.get());
        }
        return numbers;
    }
    private static <T> void showList(List<T> list, Consumer<T> consumer){
        for (T k: list) {
            consumer.accept(k);
        }
    }
    private static <T> List<T> numbersDividedByTwo(List<T> list, Predicate<T> predicate){
        List <T> numbers = new ArrayList<>();
        for (T k: list) {
            if (predicate.test(k))
                numbers.remove(k);
            else
                numbers.add(k);
        }
        return numbers;
    }
}
