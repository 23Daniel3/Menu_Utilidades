package MenuUtilidades.Juros;

import java.util.Scanner;

import MenuUtilidades.Constants.*;
import MenuUtilidades.Juros.Compostos.CompCapital;
import MenuUtilidades.Juros.Compostos.CompPeriodo;
import MenuUtilidades.Juros.Compostos.CompTaxa;
import MenuUtilidades.Juros.Compostos.Montante;

/**
 * Classe que calcula juros compostos com base nos valores fornecidos pelo usuário.
 */
public class JurosCompostos {

    private static Scanner input = new Scanner(System.in);

    private static int tempo;
    private static double taxa;
    private static double capital;
    private static double valorMensal;
    private static double montante;

    /**
     * Construtor que exibe as opções de cálculo de juros compostos e solicita a escolha do usuário.
     */
    public JurosCompostos(){
        System.out.println(kJuros.COMPOST_MESSAGE);
        execute(getUtilidade());
    }

    private void execute(int type){
        switch (type) {
            case 1:
                new Montante();
                break;
            case 2:
                new CompCapital();
                break;
            case 3:
                new CompTaxa();
                break;
            case 4:
                new CompPeriodo();
                break;
            default:
                System.out.println(Kinvalid.INV_OPER);
                break;
        }
    }

    /**
     * Método estático que obtém o valor do período fornecido pelo usuário.
     *
     * @return o valor do período inserido pelo usuário
     */
    public static int getPeriodo(){
        System.out.println(kJuros.PERIODO_STRING);
        tempo = input.nextInt();
        return tempo;
    }

    /**
     * Método estático que obtém o valor da taxa fornecida pelo usuário.
     *
     * @return o valor da taxa inserida pelo usuário
     */
    public static double getTaxa(){
        System.out.println(kJuros.TAXA_STRING);
        taxa = input.nextDouble();
        return taxa;
    }

    /**
     * Método estático que obtém o valor do capital fornecido pelo usuário.
     *
     * @return o valor do capital inserido pelo usuário
     */
    public static double getCapital(){
        System.out.println(kJuros.CAPITAL_STRING);
        capital = input.nextDouble();
        return capital;
    }

    /**
     * Método estático que obtém o valor mensal fornecido pelo usuário.
     *
     * @return o valor mensal inserido pelo usuário
     */
    public static double getValorMensal(){
        System.out.println(kJuros.VALOR_STRING);
        valorMensal = input.nextDouble();
        return valorMensal;
    }

    /**
     * Método estático que obtém o valor do montante fornecido pelo usuário.
     *
     * @return o valor do montante inserido pelo usuário
     */
    public static double getMontante(){
        System.out.println(kJuros.MONTANTE_STRING);
        montante = input.nextDouble();
        return montante;
    }

    private int getUtilidade(){
        return input.nextInt();
    }
}
