
package fabricadebolo;

public class BoloFactory {
     public enum Bolos{
        ABACAXI, PRESTIGIO, FLORESTANEGRA , CHOCONINHO;
    }
    
    public AbstractBoloInterface getBolo(Bolos b){
        AbstractBoloInterface bolo = null;
        
        switch(b){
            case ABACAXI:
                bolo = new Abacaxi();
                break;
            case PRESTIGIO:
                bolo = new Prestigio();
                break;
            case FLORESTANEGRA:
                bolo = new FlorestaNegra();
                break;    
            case CHOCONINHO:
            bolo = new Choconinho();
            break;    
        }   
        return bolo;
    }
}
