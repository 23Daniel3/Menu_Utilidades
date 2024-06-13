package MenuUtilidades.TurnTo;

import java.util.Scanner;

import MenuUtilidades.Constants.kTurn;

public class TurnBase {

    protected double number;

    Scanner input = new Scanner(System.in);

    public TurnBase(){
        System.out.println(kTurn.INPUT_STRING);
        number = input.nextDouble();
    }
}
