
package pinos;

public class PinoQuadradoAdapter {
    private final PinoQuadrado pino;
    
    public PinoQuadradoAdapter(PinoQuadrado pino){
        this.pino = pino;
    }
    
    public double getRaio(){
        return Math.pow((pino.getLargura()/2), 2);
    }
}
