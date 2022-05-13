package açaicomtamanhos;

public class Morango extends BaseDecorator {
    
    public Morango(Adicional ac) {
        super(ac);
    }
    
    @Override
    public double custo() {
        return super.custo() + 15;
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " com Morango ";
    }
    
    
}
