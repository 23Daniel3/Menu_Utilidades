package MenuUtilidades.Calculadora.Operacoes;

import MenuUtilidades.Constants.RQConstants;

/**
 * Classe que representa a operação de raiz quadrada.
 */
public class RaizQuadrada extends CalculatingBase {

    double numero1;

    /**
     * Construtor da classe RaizQuadrada.
     * 
     * @param firstNumber O número para calcular a raiz quadrada.
     * @param oper        O código da operação (não usado diretamente).
     */
    public RaizQuadrada(double firstNumber, int oper) {
        super(oper);
        this.numero1 = firstNumber;
        double result = Math.sqrt(numero1);
        System.out.println(RQConstants.kStr + result);
    }
}