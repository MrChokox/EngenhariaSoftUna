
package testaforma;

public class FormaFactory extends AbstractFactory{
    public enum Tipo{
        RETANGULO, TRIANGULO, CIRCULO;
    }
    
    @Override
    public Forma getForma(Tipo t){
        Forma f = null;
        
        switch(t){
            case RETANGULO:
                f = new Retangulo();
                break;
            case CIRCULO:
                f = new Circulo();
                break;
            case TRIANGULO:
                f = new Triangulo();
                break;                
        }   
        return f;
    }
}
