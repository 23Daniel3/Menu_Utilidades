package MenuUtilidades;

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
        public static final String kStr = "Resultado da Soma: ";
    }

    /**
     * Constantes relacionadas à operação de subtração.
     */
    public static final class SubtConstants {
        /**
         * Mensagem de resultado da subtração.
         */
        public static final String kStr = "Resultado da Subtração: ";
    }

    /**
     * Constantes relacionadas à operação de multiplicação.
     */
    public static final class MultConstants {
        /**
         * Mensagem de resultado da multiplicação.
         */
        public static final String kStr = "Resultado da Multiplicação: ";
    }

    /**
     * Constantes relacionadas à operação de divisão.
     */
    public static final class DivConstants {
        /**
         * Mensagem de resultado da divisão.
         */
        public static final String kStr = "Resultado da Divisão: ";
    }

    /**
     * Constantes relacionadas à media de dois números.
     */
    public static final class MedConstants {
        /**
         * Mensagem de resultado da divisão.
         */
        public static final String kStr = "Media dos dois valores: ";
    }

    /**
     * Constantes relacionadas à operação de raiz quadrada.
     */
    public static final class RQConstants {
        /**
         * Mensagem de resultado da raiz quadrada.
         */
        public static final String kStr = "A Raiz quadrada é: ";
    }

    /**
     * Constantes relacionadas à operação de raiz cúbica.
     */
    public static final class RCConstants {
        /**
         * Mensagem de resultado da raiz cúbica.
         */
        public static final String kStr = "A Raiz cubica é: ";
    }

    /**
     * Constantes relacionadas à operação de potência.
     */
    public static final class PotConstants {
        /**
         * Mensagem de resultado da potência.
         */
        public static final String kStr = "Resultado da Potência: ";
    }

    /**
     * Constantes relacionadas à operação de porcentagem.
     */
    public static final class PercConstants {
        /**
         * Mensagem para pedir o número para descobrir a porcentagem.
         */
        public static final String kFirst = "Digite o número à descobrir a porcentagem: ";
        /**
         * Mensagem de resultado da porcentagem.
         */
        public static final String kStr = "A porcentagem é: ";
    }

    /**
     * Constantes relacionadas à operação da calculadora.
     */
    public static final class CalcConstants {
        /**
         * Mensagem para pedir a operação desejada.
         */
        public static final String kStrOperacao = "Digite a operação desejada:\n"
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
        public static final String strPot = "Atenção!! Digite primeiro o numero e depois a potência";
        /**
         * Mensagem de aviso para a operação de raiz quadrada.
         */
        public static final String strRQ = "Atenção!! Você receberá o radicando 'arredondado' ao índice 2";
        /**
         * Mensagem de aviso para a operação de raiz cúbica.
         */
        public static final String strRC = "Atenção!! Você receberá o radicando 'arredondado' ao índice 3";
    }

    /**
     * Constantes relacionadas a operações inválidas.
     */
    public static final class Kinvalid {
        /**
         * Mensagem de operação inválida.
         */
        public static final String invOper = "Operação Invalida";
    }

    /**
     * Constantes relacionadas à entrada do usuário.
     */
    public static final class kObey {
        /**
         * Mensagem para pedir o primeiro número.
         */
        public static final String nmr1Str = "Digite o primeiro número: ";
        /**
         * Mensagem para pedir o segundo número.
         */
        public static final String nmr2Str = "Digite o segundo número: ";
        /**
         * Mensagem para pedir o número total.
         */
        public static final String nmrPerc = "Digite o número total: ";
        /**
         * Mensagem para pedir o número desejado.
         */
        public static final String nmrDes = "Digite o número desejado: ";
        /**
         * Mensagem para perguntar se o usuário deseja continuar calculando.
         */
        public static final String kCont = "Deseja continuar calculando? digite 'sim' para continuar ou 'menu' para voltar ao menu";
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
    }
}
