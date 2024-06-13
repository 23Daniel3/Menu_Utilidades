package MenuUtilidades.Juros.Compostos;

import MenuUtilidades.Juros.JurosCompostos;

public class CompCapital {

    public CompCapital(){
        double taxa = JurosCompostos.getTaxa() / 100;
        double periodo = JurosCompostos.getPeriodo();
        double capital = (JurosCompostos.getMontante() - ((JurosCompostos.getValorMensal() * ((Math.pow((1 + taxa), 
        periodo)) - 1)) / taxa)) / Math.pow((1 + taxa), periodo);

        System.out.println("O capital é: " + capital);
    }
}
