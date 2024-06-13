package MenuUtilidades.Juros.Simples;

import MenuUtilidades.Juros.JurosSimples;

public class SimpleJuros {

    public SimpleJuros(){
        double result = JurosSimples.getTaxa() * JurosSimples.getCapital() * JurosSimples.getTempo() / 100;
        System.out.println("Os juros são: " + result);
    }
}
