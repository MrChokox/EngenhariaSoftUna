
package fabricadebolo;

public class FlorestaNegra extends Bolo{

    public FlorestaNegra() {
        setNome("Floresta negra");
        setPreco(23.00f);
        setTipo("7 ovos");
    }    

    @Override
    public void receita() {
        System.out.println("5 colheres de chocolate amargo, 7 ovos, 5 xicaras de farinha");
    }

   
}
