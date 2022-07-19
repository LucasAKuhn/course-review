package secao5.classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();

        Data d2 = new Data(03, 02, 1996);

        System.out.println(d1.obterDataFormatada());

        System.out.println(d2.obterDataFormatada());
        //System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano );
    }
}
