package secao5.classe;

public class ValorVsReferencia {

    public static void main(String[] args) {

        double a = 2;
        double b = a;   //Atribuição por valor (Tipo primitivo)

        //Cada objeto se torna independente
        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1;   // atribuição por referência  (Objeto)

        //Voce modifica o objeto, e consequentemente
        // todos os dados que apontam para o mesmo

        d1.dia = 31;
        d2.mes = 12;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

    }
}
