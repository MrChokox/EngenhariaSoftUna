
package testaforma;

public class TestaForma {

    public static void main(String[] args) {
        FormaFactory formas = new FormaFactory();        
        Forma f1 = formas.getForma(FormaFactory.Tipo.CIRCULO);
        f1.desenhar();
        
        Forma f2 = formas.getForma(FormaFactory.Tipo.RETANGULO);
        f2.desenhar();
        
        Forma f3 = formas.getForma(FormaFactory.Tipo.TRIANGULO);
        f3.desenhar();
    }
    
}
