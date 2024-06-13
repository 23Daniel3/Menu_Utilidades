package MenuUtilidades.Quadrilatero;

import java.util.Scanner;

public class Area {
    
    Scanner input = new Scanner(System.in);
    
    public Area(){
        System.out.println("Digite o lado 1:");
        double lado1 = input.nextDouble();

        System.out.println("Digite o lado 2:");
        double lado2 = input.nextDouble();

        double result = lado1 * lado2;
        System.out.println("A área do quadrilátero é: " + result);
    }
}
    