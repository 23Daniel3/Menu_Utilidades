package MenuUtilidades.TurnTo;

import java.util.Scanner;

import MenuUtilidades.Constants.kTurn;

/**
 * Classe base para os cálculos de tranformação de graus
 */
public class TurnBase {

    /**
     * Criando o número base para transformação
     */
    protected double number;

    Scanner input = new Scanner(System.in);

    /**
     * Construtor responsável por receber o primeiro número e adiciona-lo a variavel base - (number)
     */
    public TurnBase(){
        System.out.println(kTurn.INPUT_STRING);
        number = input.nextDouble();
    }
}
