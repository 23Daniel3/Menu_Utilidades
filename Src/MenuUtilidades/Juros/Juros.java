package MenuUtilidades.Juros;

import java.util.Scanner;

import MenuUtilidades.Constants.Kinvalid;
import MenuUtilidades.Constants.kJuros;

/**
 * Classe que apresenta um menu de escolha entre juros simples e compostos para o usuário.
 */
public class Juros {

    static Scanner input = new Scanner(System.in);

    /**
     * Construtor que exibe as opções de cálculo de juros (simples ou compostos) e solicita a escolha do usuário.
     */
    public Juros(){
        System.out.println(kJuros.TYPE);
        execute(getCalc());
    }

    private static byte getCalc(){
        return input.nextByte();
    }

    private static void execute(byte calc) {
        switch (calc) {
            case 1:
                new JurosCompostos();
                break;
            case 2:
                new JurosSimples();
                break;
            default:
                System.out.println(Kinvalid.INV_OPER);
                break;
        }
    }
}
