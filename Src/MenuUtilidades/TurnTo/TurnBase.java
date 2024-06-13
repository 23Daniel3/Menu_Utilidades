package MenuUtilidades.TurnTo;

import java.util.Scanner;

public class TurnBase {

    protected double number;

    Scanner input = new Scanner(System.in);

    public TurnBase(){
        System.out.println("Digite o número:");
        number = input.nextDouble();
    }
}
