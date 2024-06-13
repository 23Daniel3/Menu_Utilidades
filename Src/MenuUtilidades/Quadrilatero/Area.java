package MenuUtilidades.Quadrilatero;

import java.util.Scanner;

import MenuUtilidades.Constants.kQuadrilatero;

/**
 * Calcula a área de um quadrilátero com base nos lados informados pelo usuário.
 */
public class Area {
    
    Scanner input = new Scanner(System.in);
    
    /**
     * Construtor que solicita os lados do quadrilátero e exibe sua área.
     */
    public Area(){
        System.out.println(kQuadrilatero.LADO_STRING);
        double lado1 = input.nextDouble();

        System.out.println(kQuadrilatero.LADO_STRING2);
        double lado2 = input.nextDouble();

        double result = lado1 * lado2;
        System.out.println(kQuadrilatero.AREA_STRING + result);
    }
}
