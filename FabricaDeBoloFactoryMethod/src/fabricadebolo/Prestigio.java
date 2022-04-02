
package fabricadebolo;

public class Prestigio extends Bolo{

    public Prestigio() {
        setNome("Prestigio");
        setPreco(500.00f);
        setTipo("64 ovos");
    }    

    @Override
    public void receita() {
        System.out.println("10kg de coco, 2 copos de leite ninho, 64 ovos, 5 xicaras de farinha, 2 copos de leite e um vidro de leite de coco");
    }    
}
