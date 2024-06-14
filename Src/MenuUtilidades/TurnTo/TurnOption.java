package MenuUtilidades.TurnTo;

import java.util.Scanner;

import MenuUtilidades.Constants.Kinvalid;
import MenuUtilidades.Constants.kTurn;

/**
 * Classe responsavel por pedir ao usuario a opcao de transformacao de graus desejada.
*/
public class TurnOption {

    Scanner input = new Scanner(System.in);

    /**
     * Cosntrutor que pede ao usuario a opcao de transformacao e executa a classe desejada.
     */
    public TurnOption(){
        System.out.println(kTurn.OPTION_STRING);
        execute(getTurn());
    }

    /**
     * @param turn responsavel por executar cada classe com base no numero digitado.
     */
    private static void execute(byte turn){
        switch(turn){
            case 1:
                new CelsiusToFahrenheit();
                break;
            case 2:
                new FahreinheitToCelsius();
                break;
            default:
                System.out.println(Kinvalid.INV_OPER);
        }
    }

    /**
     * @return o numero digitado pelo usuario referente a opcao escolhida.
     */
    private byte getTurn(){
        return input.nextByte();
    }

}
