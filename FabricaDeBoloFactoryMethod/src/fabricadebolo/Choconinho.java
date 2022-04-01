
package fabricadebolo;

public class Choconinho extends Bolo{

    public Choconinho() {
        setNome("Choconinho");
        setPreco(20.76f);
        setTipo("50 ovos");
    }
    

    @Override
    public void receita() {
        System.out.println("5 colheres de cacau, 2 copos de leite ninho, 7 ovos, 5 xicaras de farinha");
    }

    
}
