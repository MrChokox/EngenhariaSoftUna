
package testaforma;

public class TestaForma {

    public static void main(String[] args) {
        AbstractFactory formas = ProdutorFactory.getFactory(false);        
         
        Forma f1 = formas.getForma(FormaFactory.Tipo.RETANGULO);
        f1.desenhar();
        
        Forma f2 = formas.getForma(FormaFactory.Tipo.TRIANGULO);
        f2.desenhar();
        
        AbstractFactory ff1 = ProdutorFactory.getFactory(true);
        
        Forma f3 = ff1.getForma(FormaFactory.Tipo.TRIANGULO);
        f3.desenhar();
    }
    
}
