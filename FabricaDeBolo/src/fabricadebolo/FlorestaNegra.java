
package fabricadebolo;

public class FlorestaNegra extends AbstractBolo{

    public FlorestaNegra() {
        setNome("Floresta negra");
        setPreco(45.5f);
        setTipo("6 ovos");
    }    
    
    @Override
    public void receita() {
        System.out.println("Receita");
    }

}
