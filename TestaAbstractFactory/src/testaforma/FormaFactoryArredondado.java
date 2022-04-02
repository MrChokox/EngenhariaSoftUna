
package testaforma;

public class FormaFactoryArredondado extends AbstractFactory{

    @Override
    Forma getForma(FormaFactory.Tipo t) {
        Forma f = null;
        
        switch(t){
            case RETANGULO:
                f = new RetanguloArredondado();
                break;            
            case TRIANGULO:
                f = new TrianguloArredondado();
                break;                
        }   
        return f;
    }
    
    public enum Tipo{
        RETANGULO, TRIANGULO, CIRCULO;
    }    
   
}
