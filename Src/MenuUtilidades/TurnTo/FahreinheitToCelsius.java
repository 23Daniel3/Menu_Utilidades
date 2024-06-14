package MenuUtilidades.TurnTo;

import MenuUtilidades.Constants.kTurn;

/**
 * Classe responsavel por realizar o calculo de tranformacao de graus Fahreinheit para celsius.
 */
public class FahreinheitToCelsius extends TurnBase{

    /**
     * Construtor que realiza o cálculo e imprime o resultado.
     */
    public FahreinheitToCelsius(){
        double result = (number - 32) / 1.8;
        System.out.println(kTurn.ANSW_STRING + result);
    }
}
