package açai;

public class Acai implements Adicional{  
    
    @Override
    public String getDescricao() {
        return "Acaí comum";
    }

    @Override
    public double custo() {
        return 10;
    }
    
}
