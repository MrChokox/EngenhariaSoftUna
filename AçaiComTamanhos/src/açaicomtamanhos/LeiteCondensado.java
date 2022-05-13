package açaicomtamanhos;

public class LeiteCondensado extends BaseDecorator {
    
    public LeiteCondensado(Adicional ac) {
        super(ac);
    }
    @Override
    public double custo() {
        return super.custo() + 12;
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " com Leite condensado";
    }
}
