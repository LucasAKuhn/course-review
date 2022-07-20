package secao8Lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isCaro = prod -> prod.preco >= 50;

        Produto produto = new Produto("Notebook", 350.50, 0.15);
        System.out.println(isCaro.test(produto));
    }
}
