package MenuUtilidades.Calculadora.Operacoes;

import MenuUtilidades.Constants.MultConstants;

/**
 * Classe que representa a operação de multiplicação.
 */
public class Multiplicacao extends CalculatingBase {

    double numero1;

    /**
     * Construtor da classe Multiplicacao.
     * 
     * @param firstNumber O primeiro número para a operação de multiplicação.
     * @param oper        O código da operação (não usado diretamente).
     */
    public Multiplicacao(double firstNumber, int oper) {
        super(oper);
        this.numero1 = firstNumber;
        double result = numero1 * numero2;
        System.out.println(MultConstants.kStr + result);
    }
}