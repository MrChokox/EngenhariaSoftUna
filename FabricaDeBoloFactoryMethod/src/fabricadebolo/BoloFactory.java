
package fabricadebolo;

public class BoloFactory {
     public enum Bolos{
        ABACAXI, PRESTIGIO, FLORESTANEGRA , CHOCONINHO;
    }
    
    public AbstractBoloInterface getBolo(Bolos b){
        AbstractBoloInterface bolo = null;
        
        switch(b){
            case ABACAXI:
                f = new Retangulo();
                break;
            case PRESTIGIO:
                f = new Circulo();
                break;
            case TRIANGULO:
                f = new Triangulo();
                break;                
        }   
        return f;
    }
}
