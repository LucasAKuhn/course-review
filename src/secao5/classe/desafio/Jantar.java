package secao5.classe.desafio;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Lucas k", 75.400);
        Pessoa p2 = new Pessoa("Haidi K", 56.250);

        Comida c1 = new Comida("Mocoto", 0.200);
        Comida c2 = new Comida("Salada", 0.50);

        p1.comer(c1);
        p1.comer(c1);


        System.out.println(p1.peso);

    }
}
