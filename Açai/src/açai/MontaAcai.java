package açai;

public class MontaAcai {

    public static void main(String[] args) { 
        Acai acai = new Acai();
        BaseDecorator bd = new BaseDecorator(acai);
        System.out.println(bd.getDescricao());
        System.out.println(bd.custo());
        
        Banana bn = new Banana(acai);
        System.out.println(bn.getDescricao());
        
        
    }
    
}
