package MenuUtilidades.Triangulo;

public class Altura extends TriBase{

    public Altura(){
        System.out.println("Digite a hipotenusa:");
        double hipotenusa = input.nextDouble();
        double result = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(base, 2));
        System.out.println("A altura é: " + result);
    }
}
