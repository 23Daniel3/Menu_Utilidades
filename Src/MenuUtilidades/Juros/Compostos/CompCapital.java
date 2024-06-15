package MenuUtilidades.Juros.Compostos;

import MenuUtilidades.Juros.JurosCompostos;

/**
 * Classe responsável por calcular o capital com juros compostos com base nos valores fornecidos pelo usuário.
 */
public class CompCapital {

    /**
     * Construtor responsavel por calcular o capital com juros compostos.
     */
    public CompCapital(){
        double taxa = JurosCompostos.getTaxa() / 100;
        double periodo = JurosCompostos.getPeriodo();
        double capital = (JurosCompostos.getMontante() - ((JurosCompostos.getValorMensal() * ((Math.pow((1 + taxa), 
        periodo)) - 1)) / taxa)) / Math.pow((1 + taxa), periodo);

        System.out.println("O capital é: " + capital);
    }
}
