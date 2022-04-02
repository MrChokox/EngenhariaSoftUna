
package fabricadebolo;

public class Choconinho extends Bolo{

    public Choconinho() {
        setNome("Choconinho");
        setPreco(12.00f);
        setTipo("50 ovos");
    }
    

    @Override
    public void receita() {
        System.out.println("5 colheres de cacau, 2 copos de leite ninho, 50 ovos, 5 xicaras de farinha");
    }

    
}
