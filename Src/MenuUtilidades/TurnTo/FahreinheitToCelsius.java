package MenuUtilidades.TurnTo;

import MenuUtilidades.Constants.kTurn;

public class FahreinheitToCelsius extends TurnBase{

    public FahreinheitToCelsius(){
        double result = (number - 32) / 1.8;
        System.out.println(kTurn.ANSW_STRING + result);
    }
}
