package MenuUtilidades.Juros.Compostos;

import MenuUtilidades.Juros.JurosCompostos;

public class CompPeriodo {

    public CompPeriodo() {
        double taxa = JurosCompostos.getTaxa() / 100;
        double capital = JurosCompostos.getCapital();
        double montanteFinal = JurosCompostos.getMontante();
        double valorMensal = JurosCompostos.getValorMensal();
        double epsilon = 1e-6;
        double periodoBaixo = 0;
        double periodoAlto = 1000; // Valor alto arbitrário para garantir que a solução esteja dentro do intervalo
        double periodo = 0;

        while (periodoAlto - periodoBaixo > epsilon) {
            periodo = (periodoBaixo + periodoAlto) / 2;
            double montanteCalculado = ((valorMensal * (Math.pow(1 + taxa, periodo) - 1)) / taxa) + (capital * Math.pow(1 + taxa, periodo));

            if (montanteCalculado < montanteFinal) {
                periodoBaixo = periodo;
            } else {
                periodoAlto = periodo;
            }
        }

        System.out.println("O período necessário é: " + periodo + " meses");
    }
}
