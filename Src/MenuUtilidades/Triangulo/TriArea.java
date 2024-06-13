package MenuUtilidades.Triangulo;

import MenuUtilidades.Constants.kTriangulo;

public class TriArea extends TriBase{
    
    public TriArea(){
        System.out.println(kTriangulo.INPUT_STRING2);
        double altura = input.nextDouble();

        double result = (base * altura) / 2;
        System.out.println(kTriangulo.ANSW_STRING3 + result);
    }
}
    