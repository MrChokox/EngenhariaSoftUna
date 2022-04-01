
package fabricadebolo;

public class FlorestaNegra extends Bolo{

    public FlorestaNegra() {
        setNome("Floresta negra");
        setPreco(45.5f);
        setTipo("6 ovos");
    }    

    @Override
    public void receita() {
        System.out.println("5 colheres de chocolate amargo, 7 ovos, 5 xicaras de farinha");
    }

   
}
