package MenuUtilidades;

import MenuUtilidades.Juros.JurosSimples;

/**
 * Classe que contém todas as constantes usadas na calculadora.
 */
public final class Constants {

    /**
     * Constantes relacionadas à operação de soma.
     */
    public static final class SomaConstants {
        /**
         * Mensagem de resultado da soma.
         */
        public static final String STRING = "Resultado da Soma: ";
    }

    /**
     * Constantes relacionadas à operação de subtração.
     */
    public static final class SubtConstants {
        /**
         * Mensagem de resultado da subtração.
         */
        public static final String STRING = "Resultado da Subtração: ";
    }

    /**
     * Constantes relacionadas à operação de multiplicação.
     */
    public static final class MultConstants {
        /**
         * Mensagem de resultado da multiplicação.
         */
        public static final String STRING = "Resultado da Multiplicação: ";
    }

    /**
     * Constantes relacionadas à operação de divisão.
     */
    public static final class DivConstants {
        /**
         * Mensagem de resultado da divisão.
         */
        public static final String STRING = "Resultado da Divisão: ";
    }

    /**
     * Constantes relacionadas à media de dois números.
     */
    public static final class MedConstants {
        /**
         * Mensagem de resultado da divisão.
         */
        public static final String STRING = "Media dos dois valores: ";
    }

    /**
     * Constantes relacionadas à operação de raiz quadrada.
     */
    public static final class RQConstants {
        /**
         * Mensagem de resultado da raiz quadrada.
         */
        public static final String STRING = "A Raiz quadrada é: ";
    }

    /**
     * Constantes relacionadas à operação de raiz cúbica.
     */
    public static final class RCConstants {
        /**
         * Mensagem de resultado da raiz cúbica.
         */
        public static final String STRING = "A Raiz cubica é: ";
    }

    /**
     * Constantes relacionadas à operação de potência.
     */
    public static final class PotConstants {
        /**
         * Mensagem de resultado da potência.
         */
        public static final String STRING = "Resultado da Potência: ";
    }

    /**
     * Constantes relacionadas à operação de porcentagem.
     */
    public static final class PercConstants {
        /**
         * Mensagem para pedir o número para descobrir a porcentagem.
         */
        public static final String K_FIRST = "Digite o número à descobrir a porcentagem: ";
        /**
         * Mensagem de resultado da porcentagem.
         */
        public static final String STRING = "A porcentagem é: ";
    }

    /**
     * Constantes relacionadas à operação da calculadora.
     */
    public static final class CalcConstants {
        /**
         * Mensagem para pedir a operação desejada.
         */
        public static final String STRING_OPERACAO = "Digite a operação desejada:\n"
                + "(+) para Soma\n"
                + "(-) para Subtração\n"
                + "(*) para Multiplicação\n"
                + "(/) para Divisão\n"
                + "(^) para Potência\n"
                + "(@) para Raiz Quadrada\n"
                + "(#) para Raiz cubica\n"
                + "(%) para descobrir porcentagem\n"
                + "(//) para descobria a média\n";

        /**
         * Mensagem de aviso para a operação de potência.
         */
        public static final String STRING_POT = "Atenção!! Digite primeiro o numero e depois a potência";
        /**
         * Mensagem de aviso para a operação de raiz quadrada.
         */
        public static final String STRING_RQ = "Atenção!! Você receberá o radicando 'arredondado' ao índice 2";
        /**
         * Mensagem de aviso para a operação de raiz cúbica.
         */
        public static final String STRING_RC = "Atenção!! Você receberá o radicando 'arredondado' ao índice 3";
    }

    /**
     * Constantes relacionadas a operações inválidas.
     */
    public static final class Kinvalid {
        /**
         * Mensagem de operação inválida.
         */
        public static final String INV_OPER = "Operação Invalida";
    }

    /**
     * Constantes relacionadas à entrada do usuário.
     */
    public static final class kObey {
        /**
         * Mensagem para pedir o primeiro número.
         */
        public static final String NMR1_STRING = "Digite o primeiro número: ";
        /**
         * Mensagem para pedir o segundo número.
         */
        public static final String NMR2_STRING = "Digite o segundo número: ";
        /**
         * Mensagem para pedir o número total.
         */
        public static final String NMR3_STRING = "Digite o número total: ";
        /**
         * Mensagem para pedir o número desejado.
         */
        public static final String NMR4_STRING = "Digite o número desejado: ";
        /**
         * Mensagem para perguntar se o usuário deseja continuar calculando.
         */
        public static final String CONT = "Deseja continuar calculando? digite 'sim' para continuar ou 'menu' para voltar ao menu";
    }

    public static final class kUtilidade {

        public static final String INITIAL_MESSAGE = "\n"
                + "Digite a sua necessidade\n"
                + "(1) para Calculadora\n"
                + "(2) para transformar graus celsius em fahrenheit\n"
                + "(3) para transformar graus fahrenheit em celsius\n"
                + "(4) para descobrir a hipotenusa entre uma base e altura\n"
                + "(5) para descobrir a altura entre uma hipotenusa e uma base\n"
                + "(6) para descobrir a área de um quadrilátero\n"
                + "(7) para descobrir a área de um triângulo\n"
                + "(8) para calcular juros\n";
    }

    public static final class kJuros {

        public static final String SIMPLE_MESSAGE = "\n"
            + "Digite o que quer descobrir\n"
            + "(1) para juros\n"
            + "(2) para tempo\n"
            + "(3) para taxa\n"
            + "(4) para capital\n";

        public static final String COMPOST_MESSAGE = "\n"
            + "Digite o que quer descobrir\n"
            + "(1) para montante final (se não tiver aportes mensais, apenas digitar '0' no valor mensal)\n"
            + "(2) para capital\n"
            + "(3) para taxa\n"
            + "(4) para periodo\n";

        public static final String TYPE = 
            "Digite o tipo de cálculo de juros:\n"
            +"(1) para juros compostos\n"
            +"(2) para juros simples\n";

        public static final String PERIODO_STRING = "digite o periodo em meses";
        public static final String TAXA_STRING = "digite a taxa mensal";
        public static final String CAPITAL_STRING = "digite o Capital";
        public static final String VALOR_STRING = "digite o valor mensal";
        public static final String MONTANTE_STRING = "digite o montante";
    }

    public final class SimplesJuros {
        public static final double TEMPO = (JurosSimples.getJuros() * 100) / (JurosSimples.getCapital() * JurosSimples.getTaxa());
        public static final String TEMPO_STRING = "O tempo é: " + TEMPO + " na grandeza de tempo da taxa";

        public static final double TAXA = (JurosSimples.getJuros() * 100) / (JurosSimples.getCapital() * JurosSimples.getTempo());
        public static final String TAXA_STRING = "A taxa é: " + TAXA + " % na grandeza do tempo";

        public static final double JUROS = JurosSimples.getTaxa() * JurosSimples.getCapital() * JurosSimples.getTempo() / 100;
        public static final String JUROS_STRING = "Os juros são: " + JUROS;

        public static final double CAPITAL = (JurosSimples.getJuros() * 100) / (JurosSimples.getTaxa() * JurosSimples.getTempo());
        public static final String CAPITAL_STRING = "O capital é: " + CAPITAL;
    }
}
