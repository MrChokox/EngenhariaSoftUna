package açaicomtamanhos;

public class Acai implements Adicional{  
    public char Tamanho = 'p';    
   
    @Override
    public String getDescricao() {
        return "Acaí comum tamanho: " + Tamanho;
    }

    @Override
    public double custo() {
        switch (Tamanho) {
            case 'p':
                return 10;
            case 'm':
                return 12;
            default:
                return 15;
        }
    }

    @Override
    public void setTamanho(char t) {
        this.Tamanho = t;        
    }
    
}
