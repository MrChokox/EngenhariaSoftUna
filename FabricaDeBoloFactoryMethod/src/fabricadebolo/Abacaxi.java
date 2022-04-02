
package fabricadebolo;

public class Abacaxi extends Bolo{    

    public Abacaxi() {
        setNome("Abacaxi");
        setPreco(20.00f);
        setTipo("35 ovos");
    }   

    @Override
    public void receita() {
        System.out.println("10kg de abacaxi, 2 copos de leite, 35 ovos, 5 xicaras de farinha, 2 copos de leite");
    }
}
