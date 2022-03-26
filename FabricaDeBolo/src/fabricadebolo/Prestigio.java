
package fabricadebolo;

public class Prestigio extends AbstractBolo{

    public Prestigio() {
        setNome("Floresta negra");
        setPreco(45.56f);
        setTipo("6 ovos");
    }

    
    @Override
    public void receita() {
       System.out.println("Receita");
    }

    
}
