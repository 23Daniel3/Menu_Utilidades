package MenuUtilidades.Juros;

import java.util.Scanner;

import MenuUtilidades.Constants.*;
import MenuUtilidades.Juros.Simples.*;

public class JurosSimples {

    private static Scanner input = new Scanner(System.in);

    private static double juros;
    private static double tempo;
    private static double taxa;
    private static double capital;

    public JurosSimples(){
        System.out.println(kJuros.SIMPLE_MESSAGE);
        execute(getUtilidade());
    }

    private void execute(int type){
        switch (type) {
            case 1:
            new SimpleJuros();
                break;
            case 2:
                new SimpleTempo();
                break;
            case 3:
                new SimpleTaxa();
                break;
            case 4:
                new SimpleCapital();
                break;
            default:
                System.out.println(Kinvalid.invOper);
                break;
        }
    }

    public static double getJuros(){
        System.out.println("digite os juros");
        juros = input.nextDouble();
        return juros;
    }

    public static double getTempo(){
        System.out.println("digite o tempo (na mesma grandeza da taxa 'mês ou ano')");
        tempo = input.nextDouble();
        return tempo;
    }

    public static double getTaxa(){
        System.out.println("digite a taxa");
        taxa = input.nextDouble();
        return taxa;
    }

    public static double getCapital(){
        System.out.println("digite o Capital");
        capital = input.nextDouble();
        return capital;
    }

    private int getUtilidade(){
        return input.nextInt();
    }
}
