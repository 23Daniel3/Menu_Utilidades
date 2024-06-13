package MenuUtilidades.Calculadora.Operacoes;

import java.util.Scanner;

import MenuUtilidades.Constants.kObey;

/**
 * Classe base para operações de cálculo.
 * Esta classe serve como base para diversas operações matemáticas
 * que podem exigir um segundo número como entrada.
 */
public class CalculatingBase {

    /**
     * O segundo número para a operação.
     */
    protected double numero2;

    /**
     * Scanner para leitura de entrada do usuário.
     */
    Scanner scan = new Scanner(System.in);

    /**
     * Construtor da classe CalculatingBase.
     * Este construtor solicita ao usuário o segundo número para a operação
     * se a operação exigir um segundo número.
     * 
     * @param oper O código da operação. As operações que exigem um segundo número são:
     *             1 (soma), 2 (subtração), 3 (multiplicação), 4 (divisão), 5 (potência), 8 (porcentagem) e 9 (média).
     */
    public CalculatingBase(int oper){
        if (oper == 1 || oper == 2 || oper == 3 || oper == 4 || oper == 5 || oper == 9){
            System.out.println(kObey.nmr2Str);
            this.numero2 = scan.nextDouble();
        } else if (oper == 8){
            this.numero2 = scan.nextDouble();
        }
    }
}
