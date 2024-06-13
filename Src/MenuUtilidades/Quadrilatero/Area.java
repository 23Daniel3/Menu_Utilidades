package MenuUtilidades.Quadrilatero;

import java.util.Scanner;

import MenuUtilidades.Constants.kQuadrilatero;

public class Area {
    
    Scanner input = new Scanner(System.in);
    
    public Area(){
        System.out.println(kQuadrilatero.LADO_STRING);
        double lado1 = input.nextDouble();

        System.out.println(kQuadrilatero.LADO_STRING2);
        double lado2 = input.nextDouble();

        double result = lado1 * lado2;
        System.out.println(kQuadrilatero.AREA_STRING + result);
    }
}
    