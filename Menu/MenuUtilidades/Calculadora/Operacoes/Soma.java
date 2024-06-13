package MenuUtilidades.Calculadora.Operacoes;

import MenuUtilidades.Constants.SomaConstants;

/**
 * Classe que representa a operação de soma.
 */
public class Soma extends CalculatingBase {

    double numero1;

    /**
     * Construtor da classe Soma.
     * 
     * @param firstNumber O primeiro número para a operação de soma.
     * @param oper        O código da operação (não usado diretamente).
     */
    public Soma(double firstNumber, int oper) {
        super(oper);
        this.numero1 = firstNumber;
        double resultado = numero1 + numero2;
        System.out.println(SomaConstants.kStr + resultado);
    }
}