import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
                .filter(num -> num % 2 == 0)
                .toList();

        System.out.println("Lista sem números ímpares: " + numerosPares);

    }
}
