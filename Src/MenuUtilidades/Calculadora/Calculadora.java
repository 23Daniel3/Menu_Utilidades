package MenuUtilidades.Calculadora;

import java.util.Scanner;

import MenuUtilidades.Constants.*;
import MenuUtilidades.Calculadora.Operacoes.*;

/**
 * Classe principal da calculadora.
 * Responsável por capturar a entrada do usuário, executar a operação escolhida e mostrar o resultado.
 */
public class Calculadora {

    static Scanner input = new Scanner(System.in);
    private static double firstNumber;

    /**
     * Construtor responsavel por iniciar os metodos que pedem o primeiro numero, a operacao desejada e executa a operacao escolhida.
     */
    public Calculadora(){
            firstNumber = getFirstNumber();
            String operacao = getOperacao();
            execute(operacao);
    }

    /**
     * Solicita ao usuário o primeiro número da operação.
     *
     * @return O primeiro número digitado pelo usuário.
     */
    public static double getFirstNumber() {
        System.out.println(kObey.NMR1_STRING);
        return input.nextDouble();
    }

    /**
     * Solicita ao usuário a operação desejada.
     *
     * @return A operação digitada pelo usuário como uma string.
     */
    public static String getOperacao() {
        System.out.println(CalcConstants.STRING_OPERACAO);
        return input.next();
    }


    /**
     * Executa a operação desejada com base na entrada do usuário.
     *
     * @param operacao A operação desejada como uma string.
     */
    private static void execute(String operacao) {
        switch (operacao) {
            case "+":
                new Soma(firstNumber, 1);
                break;
            case "-":
                new Subtracao(firstNumber, 2);
                break;
            case "*":
                new Multiplicacao(firstNumber, 3);
                break;
            case "/":
                new Divisao(firstNumber, 4);
                break;
            case "^":
                System.out.println(CalcConstants.STRING_POT);
                new Potencia(firstNumber, 5);
                break;
            case "@":
                System.out.println(CalcConstants.STRING_RQ);
                new RaizQuadrada(firstNumber, 6);
                break;
            case "#":
                System.out.println(CalcConstants.STRING_RC);
                new RaizCubica(firstNumber, 7);
                break;
            case "%":
                System.out.println(PercConstants.K_FIRST);
                new Percentage(firstNumber, 8);
                break;
            case "//":
                new Media(firstNumber, 9);
            default:
                System.out.println(Kinvalid.INV_OPER);
                break;
        }
    }
}
