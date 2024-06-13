package MenuUtilidades.Juros;

import java.util.Scanner;

import MenuUtilidades.Constants.Kinvalid;
import MenuUtilidades.Constants.kJuros;

public class Juros {

    static Scanner input = new Scanner(System.in);

    public Juros(){
        System.out.println(kJuros.TYPE);
        execute(getCalc());
    }

    private static int getCalc(){
        return input.nextInt();
    }

    private static void execute(int calc) {
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