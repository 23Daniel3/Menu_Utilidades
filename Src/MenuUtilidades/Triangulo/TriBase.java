package MenuUtilidades.Triangulo;

import java.util.Scanner;

import MenuUtilidades.Constants.kTriangulo;
/**
 * Classe base para cálculo de lados de triângulos.
 */
public class TriBase {

    protected double base;

    Scanner input = new Scanner(System.in);

    /**
     * Construtor que pede ao usuário o número inicial que servirá de base para outras contas.
     */
    public TriBase(){
        System.out.println(kTriangulo.INPUT_STRING4);
        base = input.nextDouble();
    }
}
