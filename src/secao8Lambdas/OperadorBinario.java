package secao8Lambdas;

import java.util.function.BinaryOperator;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media =
                (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(8.5, 5.5));
    }
}
