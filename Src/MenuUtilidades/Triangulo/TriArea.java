package MenuUtilidades.Triangulo;

import MenuUtilidades.Constants.kTriangulo;

/**
 * Classe responsável pelo cálculo da área de um triângulo com base em dados fornecidos pelo usuário.
 */
public class TriArea extends TriBase{
    
    /**
     * Construtor responsável por solicitar os dados e realizar o cálculo.
     */
    public TriArea(){
        System.out.println(kTriangulo.INPUT_STRING2);
        double altura = input.nextDouble();

        double result = (base * altura) / 2;
        System.out.println(kTriangulo.ANSW_STRING3 + result);
    }
}
    