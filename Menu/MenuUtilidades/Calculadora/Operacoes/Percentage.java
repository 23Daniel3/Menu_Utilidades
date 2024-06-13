package MenuUtilidades.Calculadora.Operacoes;

import MenuUtilidades.Constants.PercConstants;

/**
 * Classe que representa a operação de porcentagem.
 */
public class Percentage extends CalculatingBase {

    double numero1;
    float result;

    /**
     * Construtor da classe Percentage.
     * 
     * @param firstNumber O número para calcular a porcentagem.
     * @param oper        O código da operação (não usado diretamente).
     */
    public Percentage(double firstNumber, int oper) {
        super(oper);
        this.numero1 = firstNumber;
        result = (float) ((firstNumber * 100) / numero2);
        System.out.println(PercConstants.kStr + result + "%");
    }
}
