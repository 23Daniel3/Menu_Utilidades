package MenuUtilidades.Juros.Simples;

import MenuUtilidades.Juros.JurosSimples;

public class SimpleTempo {

    public SimpleTempo(){
        double result = (JurosSimples.getJuros() * 100) / (JurosSimples.getCapital() * JurosSimples.getTaxa());
        System.out.println("O tempo é: " + result + " na grandeza de tempo da taxa");
    }
}
