package MenuUtilidades.Triangulo;

import MenuUtilidades.Constants.kTriangulo;

/**
 * Classe responsável por descobrir a altura de um triângulo com base nos dados fornecidos pelo usuário
 */
public class Altura extends TriBase{

    /**
     * Construtor responsável por solicitar os dados e realizar o cálculo para descobrir a altura de um triângulo
     */
    public Altura(){
        System.out.println(kTriangulo.INPUT_STRING);
        double hipotenusa = input.nextDouble();
        double result = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(base, 2));
        System.out.println(kTriangulo.ANSW_STRING + result);
    }
}
