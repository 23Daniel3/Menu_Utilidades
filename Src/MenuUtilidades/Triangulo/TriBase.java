package MenuUtilidades.Triangulo;

import java.util.Scanner;

import MenuUtilidades.Constants.kTriangulo;

public class TriBase {

    protected double base;

     Scanner input = new Scanner(System.in);

    public TriBase(){
        System.out.println(kTriangulo.INPUT_STRING4);
        base = input.nextDouble();
    }
}
