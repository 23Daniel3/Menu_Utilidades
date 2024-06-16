package MenuUtilidades.Juros.Compostos;

import MenuUtilidades.Juros.JurosCompostos;

/**
 * Classe que calcula um montante com juros compostos com base nos valores fornecidos pelo usuário.
 */
public class Montante {

    /**
     * Construtor que solicita ao usuário os valores para calcular o montante.
     */
    public Montante() {
        double taxa = JurosCompostos.getTaxa() / 100;
        double periodo = JurosCompostos.getPeriodo();
        double montanteFinal = ((JurosCompostos.getValorMensal() * ((Math.pow((1 + taxa), 
        periodo)) - 1)) / taxa) + (JurosCompostos.getCapital() * (Math.pow((1 + taxa), periodo)));

        System.out.println("O montante é: " + montanteFinal);
    }
}