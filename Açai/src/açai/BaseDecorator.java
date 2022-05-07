package açai;

public class BaseDecorator implements Adicional{
    public Adicional wrapper;

    public BaseDecorator (Adicional ac) {
        wrapper = ac;
    }
        
    @Override
    public String getDescricao() {
       return wrapper.getDescricao();
    }

    @Override
    public double custo() {
         return wrapper.custo();
    }
}
