package MenuUtilidades;

import java.util.Scanner;

import MenuUtilidades.Calculadora.Calculadora;
import MenuUtilidades.Constants.Kinvalid;
import MenuUtilidades.Constants.kUtilidade;
import MenuUtilidades.Juros.Juros;
import MenuUtilidades.Quadrilatero.Area;
import MenuUtilidades.Triangulo.*;
import MenuUtilidades.TurnTo.*;

/**
 * Classe principal que apresenta um menu de utilidades ao usuário.
 */
public class Utilidades {

    static Scanner scan = new Scanner(System.in);

    /**
     * Método principal que inicia o programa e exibe o menu de utilidades.
     *
     * @param args argumentos da linha de comando (não utilizados neste programa)
     */
    public static void main(String[] args) {
        boolean execute = true;

        while (execute) {
            System.out.println(kUtilidade.INITIAL_MESSAGE);

            execute(getUtilidade());
        }
    }

    /**
     * Método que executa a funcionalidade correspondente à opção escolhida pelo usuário.
     *
     * @param utilidade número que representa a opção escolhida pelo usuário
     */
    private static void execute(int utilidade) {
        switch (utilidade) {
            case 1:
                new Calculadora();
                break;
            case 2:
                new CelsiusToFahrenheit();
                break;
            case 3:
                new FahreinheitToCelsius();
                break;
            case 4:
                new Hipotenusa();
                break;
            case 5:
                new Altura();
                break;
            case 6:
                new Area();
                break;
            case 7: 
                new TriArea();
                break;
            case 8:
                new Juros();
                break;
            default:
                System.out.println(Kinvalid.INV_OPER);
                break;
        }
    }

    /**
     * Método que obtém a opção de utilidade escolhida pelo usuário.
     *
     * @return número que representa a opção escolhida pelo usuário
     */
    private static int getUtilidade() {
        return scan.nextInt();
    }
}