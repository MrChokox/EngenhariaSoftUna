
package patoadapter;

public class TestaPatoAdapter {

    public static void main(String[] args) {
        PatoReal patoR = new PatoReal();
        System.out.println("O pato diz...");        
        patoR.voar();
        patoR.grasnar();
        
        PeruSelvagem peruS = new PeruSelvagem();
        System.out.println("O peru diz...");
        peruS.voar();
        peruS.gorgolejar();
        
        PeruAdapter peruA = new PeruAdapter(peruS);
        testaPato(peruA);        
    }
    
    public static void testaPato(Pato p){
        p.grasnar();
        p.voar();
    }
}
