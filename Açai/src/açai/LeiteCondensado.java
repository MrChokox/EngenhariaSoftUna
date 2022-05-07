/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package açai;

/**
 *
 * @author 42113921
 */
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
        return super.getDescricao() + " Leite condensado";
    }
}
