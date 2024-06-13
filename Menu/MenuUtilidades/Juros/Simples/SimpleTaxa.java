package MenuUtilidades.Juros.Simples;

import MenuUtilidades.Juros.JurosSimples;

public class SimpleTaxa {

    public SimpleTaxa(){
        double result = (JurosSimples.getJuros() * 100) / (JurosSimples.getCapital() * JurosSimples.getTempo());
        System.out.println("A taxa é: " + result + " % na grandeza do tempo");
    }
}
