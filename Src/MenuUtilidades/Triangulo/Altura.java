package MenuUtilidades.Triangulo;

import MenuUtilidades.Constants.kTriangulo;

public class Altura extends TriBase{

    public Altura(){
        System.out.println(kTriangulo.INPUT_STRING);
        double hipotenusa = input.nextDouble();
        double result = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(base, 2));
        System.out.println(kTriangulo.ANSW_STRING + result);
    }
}
