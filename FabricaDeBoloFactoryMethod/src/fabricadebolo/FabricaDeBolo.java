
package fabricadebolo;

public class FabricaDeBolo {

    public static void main(String[] args) {
       BoloFactory bolos = new BoloFactory();        
        AbstractBoloInterface boloAbacaxi = bolos.getBolo(BoloFactory.Bolos.ABACAXI);
        boloAbacaxi.receita();
        
    }
    
}
