package secao8Lambdas;

import java.util.function.Consumer;

public class ConsumerLambda {

    public static void main(String[] args) {
        //Utilizando Lambda que recebe um valor, e não retorna nada (void)

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.50, 0.15);
        imprimir.accept(p1);
    }
}
