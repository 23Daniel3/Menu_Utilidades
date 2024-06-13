package MenuUtilidades.Juros.Simples;

import MenuUtilidades.Juros.JurosSimples;

public class SimpleCapital {

    public SimpleCapital(){
        double result = (JurosSimples.getJuros() * 100) / (JurosSimples.getTaxa() * JurosSimples.getTempo());
        System.out.println("O capital é: " + result);
    }
}
