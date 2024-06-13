package MenuUtilidades.Triangulo;

import java.util.Scanner;

public class TriBase {

    protected double base;

     Scanner input = new Scanner(System.in);

    public TriBase(){
        System.out.println("Digite a base:");
        base = input.nextDouble();
    }
}
