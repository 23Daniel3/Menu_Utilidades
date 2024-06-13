package MenuUtilidades.Triangulo;

public class TriArea extends TriBase{
    
    public TriArea(){
        System.out.println("Digite a altura do triangulo:");
        double altura = input.nextDouble();

        double result = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + result);
    }
}
    