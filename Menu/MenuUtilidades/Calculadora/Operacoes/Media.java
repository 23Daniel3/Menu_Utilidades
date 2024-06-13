package MenuUtilidades.Calculadora.Operacoes;

import MenuUtilidades.Constants.MedConstants;

/**
 * Classe que representa o cálculo de média.
 */
public class Media extends CalculatingBase {

    double numero1;

    /**
     * Construtor da classe Media.
     * 
     * @param firstNumber O primeiro número para a média entre os dois fornecidos.
     * @param oper        O código da operação (não usado diretamente).
     */
    public Media(double firstNumber, int oper) {
        super(oper);
        this.numero1 = firstNumber;
        double result = (numero1 + numero2) / 2;
        System.out.println(MedConstants.kStr + result);
    }
}
