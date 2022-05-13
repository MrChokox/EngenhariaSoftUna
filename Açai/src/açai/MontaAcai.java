package açai;

public class MontaAcai {

    public static void main(String[] args) { 
        Adicional add = new Acai();
        System.out.println(add.getDescricao());
        System.out.println("Custo: " + add.custo());
        Adicional bn = new Banana(add);         
        System.out.println(bn.getDescricao());
        System.out.println("Custo: " + bn.custo());
        
        Adicional mr = new Morango(add);        
        mr = new LeiteCondensado(mr);
        
        System.out.println(mr.getDescricao());
        System.out.println("Custo: " + mr.custo());        
        
    }
    
}
