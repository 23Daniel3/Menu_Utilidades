package MenuUtilidades.TurnTo;

import MenuUtilidades.Constants.kTurn;

/**
 * Classe responsável por realizar o calculo de tranformação de graus celsius para Fahreinheit.
 */
public class CelsiusToFahrenheit extends TurnBase{

    /**
     * Construtor que realiza o cálculo e imprime o resultado.
     */
    public CelsiusToFahrenheit(){
        double result = number * 1.8 + 32;
        System.out.println(kTurn.ANSW_STRING + result);
    }
}
