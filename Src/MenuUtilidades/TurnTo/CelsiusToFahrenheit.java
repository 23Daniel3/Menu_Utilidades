package MenuUtilidades.TurnTo;

import MenuUtilidades.Constants.kTurn;

public class CelsiusToFahrenheit extends TurnBase{

    public CelsiusToFahrenheit(){
        double result = number * 1.8 + 32;
        System.out.println(kTurn.ANSW_STRING + result);
    }
}
