package patoadapter;

public class PeruAdapter implements Pato{

    Peru peru;
    
    public PeruAdapter(Peru peru){
        this.peru = peru;
    }
    
    @Override
    public void voar() {
        // como os perus voam a curta distancia, chama o metodo voar mais vezes
        for (int i = 0; i < 5; i++) {
            peru.voar();
        }
    }

    @Override
    public void grasnar() {
        peru.gorgolejar();
    }
    
}
