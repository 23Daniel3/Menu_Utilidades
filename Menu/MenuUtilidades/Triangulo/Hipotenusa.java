package MenuUtilidades.Triangulo;

public class Hipotenusa extends TriBase{

    public Hipotenusa(){
        System.out.println("Digite a altura do triângulo:");
        double base2 = input.nextDouble();
        double result = Math.sqrt(Math.pow(base, 2) + Math.pow(base2, 2));
        System.out.println("A hipotenusa é: " + result);
    }
}
