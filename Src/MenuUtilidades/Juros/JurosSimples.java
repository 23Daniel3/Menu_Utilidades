package MenuUtilidades.Juros;

import java.util.Scanner;

import MenuUtilidades.Constants.*;

/**
 * Classe que calcula juros simples com base nos valores fornecidos pelo usuário.
 */
public class JurosSimples {

    private static Scanner input = new Scanner(System.in);

    private static double juros;
    private static double tempo;
    private static double taxa;
    private static double capital;

    /**
     * Construtor que exibe as opções de cálculo de juros simples e solicita a escolha do usuário.
     */
    public JurosSimples(){
        System.out.println(kJuros.SIMPLE_MESSAGE);
        execute(getUtilidade());
    }

    private void execute(int type){
        switch (type) {
            case 1:
                System.out.println(SimplesJuros.JUROS_STRING);
                break;
            case 2:
                System.out.println(SimplesJuros.TEMPO_STRING);
                break;
            case 3:
                System.out.println(SimplesJuros.TAXA_STRING);
                break;
            case 4:
                System.out.println(SimplesJuros.CAPITAL_STRING);
                break;
            default:
                System.out.println(Kinvalid.INV_OPER);
                break;
        }
    }

    /**
     * Método estático que obtém o valor dos juros fornecido pelo usuário.
     *
     * @return o valor dos juros inserido pelo usuário
     */
    public static double getJuros(){
        System.out.println(SimplesJuros.GET_JUROS_STRING);
        juros = input.nextDouble();
        return juros;
    }

    /**
     * Método estático que obtém o valor do tempo fornecido pelo usuário.
     *
     * @return o valor do tempo inserido pelo usuário
     */
    public static double getTempo(){
        System.out.println(SimplesJuros.GET_TEMPO_STRING);
        tempo = input.nextDouble();
        return tempo;
    }

    /**
     * Método estático que obtém o valor da taxa fornecida pelo usuário.
     *
     * @return o valor da taxa inserida pelo usuário
     */
    public static double getTaxa(){
        System.out.println(SimplesJuros.GET_TAXA_STRING);
        taxa = input.nextDouble();
        return taxa;
    }

    /**
     * Método estático que obtém o valor do capital fornecido pelo usuário.
     *
     * @return o valor do capital inserido pelo usuário
     */
    public static double getCapital(){
        System.out.println(SimplesJuros.GET_CAPITAL_STRING);
        capital = input.nextDouble();
        return capital;
    }

    private int getUtilidade(){
        return input.nextInt();
    }
}
