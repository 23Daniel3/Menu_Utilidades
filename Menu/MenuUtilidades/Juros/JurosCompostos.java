package MenuUtilidades.Juros;

import java.util.Scanner;

import MenuUtilidades.Constants.*;
import MenuUtilidades.Juros.Compostos.CompCapital;
import MenuUtilidades.Juros.Compostos.CompPeriodo;
import MenuUtilidades.Juros.Compostos.CompTaxa;
import MenuUtilidades.Juros.Compostos.Montante;

public class JurosCompostos {

    private static Scanner input = new Scanner(System.in);

    private static int tempo;
    private static double taxa;
    private static double capital;
    private static double valorMensal;
    private static double montante;

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
                System.out.println(Kinvalid.invOper);
                break;
        }
    }

    public static int getPeriodo(){
        System.out.println("digite o periodo em meses");
        tempo = input.nextInt();
        return tempo;
    }

    public static double getTaxa(){
        System.out.println("digite a taxa em meses");
        taxa = input.nextDouble();
        return taxa;
    }

    public static double getCapital(){
        System.out.println("digite o Capital");
        capital = input.nextDouble();
        return capital;
    }

    public static double getValorMensal(){
        System.out.println("digite o valor mensal");
        valorMensal = input.nextDouble();
        return valorMensal;
    }

    public static double getMontante(){
        System.out.println("digite o montante");
        montante = input.nextDouble();
        return montante;
    }

    private int getUtilidade(){
        return input.nextInt();
    }
}
