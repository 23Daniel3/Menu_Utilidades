package MenuUtilidades.Triangulo;

import MenuUtilidades.Constants.kTriangulo;

/**
 * Classe responsável por descobrir a hipotenusa de um triângulo com base nos dados fornecidos pelo usuário.
 */
public class Hipotenusa extends TriBase{

    /**
     * Construtor responsável por solicitar os dados e realizar o cálculo para descobrir hipotenusa.
     */
    public Hipotenusa(){
        System.out.println(kTriangulo.INPUT_STRING2);
        double base2 = input.nextDouble();
        double result = Math.sqrt(Math.pow(base, 2) + Math.pow(base2, 2));
        System.out.println(kTriangulo.ANSW_STRING2 + result);
    }
}
