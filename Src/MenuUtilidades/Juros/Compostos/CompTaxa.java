package MenuUtilidades.Juros.Compostos;

import MenuUtilidades.Juros.JurosCompostos;

/**
 * Classe que calcula a taxa de juros compostos necessária para atingir um montante final,
 * com base nos valores fornecidos pelo usuário.
 */
public class CompTaxa {

    /**
     * Construtor que realiza o cálculo da taxa de juros compostos utilizando o método da bisseção.
     * A taxa é ajustada até que o montante final seja alcançado dentro de uma margem de erro.
     */
    public CompTaxa() {
        double taxaBaixa = 0.0;
        double taxaAlta = 1.0;
        double epsilon = 1e-6;
        double taxa = 0.0;
        double periodo = JurosCompostos.getPeriodo();
        double montanteFinal = JurosCompostos.getMontante();
        double valorMensal = JurosCompostos.getValorMensal();
        double capital = JurosCompostos.getCapital();

        while (taxaAlta - taxaBaixa > epsilon) {
            taxa = (taxaBaixa + taxaAlta) / 2;
            double montanteCalculado = ((valorMensal * ((Math.pow((1 + taxa), periodo)) - 1)) / taxa) + (capital * (Math.pow((1 + taxa), periodo)));

            if (montanteCalculado < montanteFinal) {
                taxaBaixa = taxa;
            } else {
                taxaAlta = taxa;
            }
        }

        taxa = taxa * 100; // Converte para percentual
        System.out.println("A taxa é: " + taxa + "%");
    }
}
