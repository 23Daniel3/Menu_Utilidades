package MenuUtilidades.Calculadora.Operacoes;

import MenuUtilidades.Constants.DivConstants;

/**
 * Classe que representa a operação de divisão.
 */
public class Divisao extends CalculatingBase {

    double numero1;

    /**
     * Construtor da classe Divisao.
     * 
     * @param firstNumber O primeiro número para a operação de divisão.
     * @param oper        O código da operação (não usado diretamente).
     */
    public Divisao(double firstNumber, int oper) {
        super(oper);
        this.numero1 = firstNumber;
        double result = numero1 / numero2;
        System.out.println(DivConstants.kStr + result);
    }
}
