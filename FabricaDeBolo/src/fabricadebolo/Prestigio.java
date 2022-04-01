
package fabricadebolo;

public class Prestigio extends AbstractBolo{

    public Prestigio() {
        setNome("Prestigio");
        setPreco(45.56f);
        setTipo("64 ovos");
    }

    
    @Override
    public void receita() {
       System.out.println("Receita");
    }

    
}
