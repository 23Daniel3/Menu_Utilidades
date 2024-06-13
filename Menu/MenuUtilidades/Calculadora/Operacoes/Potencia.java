package MenuUtilidades.Calculadora.Operacoes;

import MenuUtilidades.Constants.PotConstants;

/**
 * Classe que representa a operação de potência.
 */
public class Potencia extends CalculatingBase {

    double numero1;

    /**
     * Construtor da classe Potencia.
     * 
     * @param firstNumber O número base para a operação de potência.
     * @param oper        O código da operação (não usado diretamente).
     */
    public Potencia(double firstNumber, int oper) {
        super(oper);
        this.numero1 = firstNumber;
        double result = Math.pow(numero1, numero2);
        System.out.println(PotConstants.kStr + result);
    }
}