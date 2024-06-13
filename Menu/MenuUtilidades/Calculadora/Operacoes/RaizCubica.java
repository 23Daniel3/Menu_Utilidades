package MenuUtilidades.Calculadora.Operacoes;

import MenuUtilidades.Constants.RCConstants;

/**
 * Classe que representa a operação de raiz cúbica.
 */
public class RaizCubica extends CalculatingBase {

    double numero1;

    /**
     * 
     * Construtor da classe RaizCubica.
     * 
     * @param firstNumber O número para calcular a raiz cúbica.
     * @param oper        O código da operação (não usado diretamente).
     */
    public RaizCubica(double firstNumber, int oper) {
        super(oper);
        this.numero1 = firstNumber;
        double result = Math.cbrt(numero1);
        System.out.println(RCConstants.kStr + result);
    }
}
