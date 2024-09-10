import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Challenge8 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream()
                .map(String::valueOf)
                .flatMapToInt(n -> n.chars())
                .map(Character::getNumericValue)
                .sum();

        System.out.println("Soma dos digitos de todos os valores: " + somaDigitos);
    }
}
