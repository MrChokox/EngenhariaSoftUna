package açai;

public class MontaAcai {

    public static void main(String[] args) { 
        Adicional add = new Acai();
        System.out.println(add.getDescricao());
        Adicional bn = new Banana(add);         
        System.out.println(bn.getDescricao());
        
        Adicional mr = new Morango(add);        
        mr = new LeiteCondensado(mr);

        
        System.out.println(mr.getDescricao());
       
        
        
        
    }
    
}
