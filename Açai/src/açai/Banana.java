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
public class Banana extends BaseDecorator {

    public Banana(Acai ac) {
        super(ac);
    }

    @Override
    public double custo() {
        return super.custo() + 13; 
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " Banana ";
    }
   
    
}
