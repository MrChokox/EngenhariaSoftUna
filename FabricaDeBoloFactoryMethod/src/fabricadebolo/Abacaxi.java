
package fabricadebolo;

public class Abacaxi extends Bolo{    

    public Abacaxi() {
        setNome("Abacaxi");
        setPreco(13.34f);
        setTipo("2 ovos");
    }   

    @Override
    public void receita() {
        System.out.println("10kg de abacaxi, 2 copos de leite, 35 ovos, 5 xicaras de farinha, 2 copos de leite");
    }
}
