
package fabricadebolo;

public class FabricaDeBolo {

    public static void main(String[] args) {
       BoloFactory bolos = new BoloFactory();        
        Bolo boloAbacaxi = bolos.getBolo(BoloFactory.Bolos.ABACAXI);
        boloAbacaxi.sobreoBolo();
        boloAbacaxi.receita();
        
        Bolo boloChoconinho = bolos.getBolo(BoloFactory.Bolos.CHOCONINHO);
        boloChoconinho.sobreoBolo();
        boloChoconinho.receita();
        
        Bolo boloFlorestaNegra = bolos.getBolo(BoloFactory.Bolos.FLORESTANEGRA);
        boloFlorestaNegra.sobreoBolo();
        boloFlorestaNegra.receita();
        
        Bolo boloPrestigio = bolos.getBolo(BoloFactory.Bolos.PRESTIGIO);
        boloPrestigio.sobreoBolo();
        boloPrestigio.receita();
        
    }
    
}
