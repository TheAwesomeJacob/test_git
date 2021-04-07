package ImportantLambdas;

import java.util.Arrays;
import java.util.List;

public class SortPersonLambda {
    static List<String> list = Arrays.asList("Krzysztof", "Kamil", "Tadeusz", "Włodzimierz", "Maciej");

    public static void main(String[] args){
        list.sort(String::compareToIgnoreCase);
        list.forEach(System.out::println);
    }
}
