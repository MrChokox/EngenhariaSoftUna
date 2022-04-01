
package fabricadebolo;

public class BoloFactory implements AbstractBoloInterface{    
    
     public enum Bolos{
        ABACAXI, PRESTIGIO, FLORESTANEGRA , CHOCONINHO;
    }
    
     @Override
    public Bolo getBolo(Bolos b){
        Bolo bolo = null;
        
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
