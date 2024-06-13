package MenuUtilidades.Juros.Compostos;

import MenuUtilidades.Juros.JurosCompostos;

public class Montante {

    public Montante() {
        double taxa = JurosCompostos.getTaxa() / 100;
        double periodo = JurosCompostos.getPeriodo();
        double montanteFinal = ((JurosCompostos.getValorMensal() * ((Math.pow((1 + taxa), 
        periodo)) - 1)) / taxa) + (JurosCompostos.getCapital() * (Math.pow((1 + taxa), periodo)));

        System.out.println("O montante é: " + montanteFinal);
    }
}