package açaicomtamanhos;

public class MontaAcai {

    public static void main(String[] args) {
        Adicional add = new Acai();
        add.setTamanho('p');          
        System.out.println(add.getDescricao());
        
        
        Adicional bn = new Banana(add); 
        bn.setTamanho('g'); 
        System.out.println(bn.getDescricao());
        
        Adicional mr = new Morango(add);        
        mr = new LeiteCondensado(mr);
        
        System.out.println(mr.getDescricao());    
    }
    
}
