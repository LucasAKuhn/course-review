package secao8Lambdas;

import java.util.function.Function;

public class FunctionLambda {

    public static void main(String[] args) {

        //Recebe algum tipo de valor, e retorna outro tipo de valor

        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Impar";


        System.out.println(parOuImpar.apply(32));
    }
}
