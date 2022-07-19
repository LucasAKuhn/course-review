package secao5.classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Monitor";
        p1.preco = 1.000;

        System.out.println(p1.precoComDesconto(0));

        //System.out.println(p1);
    }
}
