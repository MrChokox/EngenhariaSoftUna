
package fabricadebolo;

public class Prestigio extends Bolo{

    public Prestigio() {
        setNome("Prestigio");
        setPreco(45.56f);
        setTipo("64 ovos");
    }    

    @Override
    public void receita() {
        System.out.println("10kg de coco, 2 copos de leite ninho, 3 ovos, 5 xicaras de farinha, 2 copos de leite e um vidro de leite de coco");
    }    
}
