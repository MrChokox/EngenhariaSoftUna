
package fabricadebolo;

public class Abacaxi extends AbstractBolo{      
    
    public Abacaxi() {
        setNome("Abacaxi");
        setPreco(13.34f);
        setTipo("2 ovos");
    }    
    
    @Override
    public void receita() {
        System.out.println("Receita");
    }
    
}
