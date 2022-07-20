package secao8Lambdas;

import java.util.function.BinaryOperator;

public class Calculo {

    public static void main(String[] args) {

    BinaryOperator<Double> calc = (x, y) -> { return x + y; };
    System.out.println(calc.apply(2.0, 5.0));

    }
}