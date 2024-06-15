package MenuUtilidades.TurnTo;

import java.util.Scanner;

import MenuUtilidades.Constants.Kinvalid;
import MenuUtilidades.Constants.kTurn;

/**
 * Classe responsável por pedir ao usuário a opção de transformação de graus desejada.
*/
public class TurnOption {

    Scanner input = new Scanner(System.in);

    /**
     * Cosntrutor que pede ao usuário a opção de transformação e executa a classe desejada.
     */
    public TurnOption(){
        System.out.println(kTurn.OPTION_STRING);
        execute(getTurn());
    }

    /**
     * @param turn responsável por executar cada classe com base no numero digitado.
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
     * @return o número digitado pelo usuário referênte a opção escolhida.
     */
    private byte getTurn(){
        return input.nextByte();
    }

}
