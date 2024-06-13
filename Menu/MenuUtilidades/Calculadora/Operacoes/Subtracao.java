package MenuUtilidades.Calculadora.Operacoes;

import MenuUtilidades.Constants.SubtConstants;

/**
 * Classe que representa a operação de subtração.
 */
public class Subtracao extends CalculatingBase {

    double numero1;

    /**
     * Construtor da classe Subtracao.
     * 
     * @param firstNumber O primeiro número para a operação de subtração.
     * @param oper        O código da operação (não usado diretamente).
     */
    public Subtracao(double firstNumber, int oper) {
        super(oper);
        this.numero1 = firstNumber;
        double resultado = numero1 - numero2;
        System.out.println(SubtConstants.kStr + resultado);
    }
}