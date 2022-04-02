
package testaforma;

public class ProdutorFactory {
    public static AbstractFactory getFactory(boolean arredondado){
        if(arredondado){
            return new FormaFactoryArredondado();            
        }
        else{
            return new FormaFactory();
        }
    }
}
