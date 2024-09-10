import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge1 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(8, 5, 3, 4, 2, 6, 9, 1, 7, 10, 5, 4, 3);

        List<Integer> numerosOrdem = numeros.stream()
                .sorted()
                .toList();

        System.out.println("Lista em ordem: " + numerosOrdem);

    }
}
