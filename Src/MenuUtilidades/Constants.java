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

    /**
    * Constantes relacionadas às utilidades diversas da aplicação.
    */
    public static final class kUtilidade {

        /**
        * Mensagem inicial exibida ao usuário para seleção de funcionalidades.
        */
        public static final String INITIAL_MESSAGE = "\n"
            + "Digite a sua necessidade\n"
            + "(1) para Calculadora\n"
            + "(2) para transformações de graus\n"
            + "(3) para descobrir a hipotenusa entre uma base e altura\n"
            + "(4) para descobrir a altura entre uma hipotenusa e uma base\n"
            + "(5) para descobrir a área de um quadrilátero\n"
            + "(6) para descobrir a área de um triângulo\n"
            + "(7) para calcular juros\n";
    }

    /**
    * Constantes relacionadas aos cálculos de juros.
    */
    public static final class kJuros {

    /**
     * Mensagem exibida ao usuário para escolha de cálculo de juros simples.
     */
    public static final String SIMPLE_MESSAGE = "\n"
        + "Digite o que quer descobrir\n"
        + "(1) para juros\n"
        + "(2) para tempo\n"
        + "(3) para taxa\n"
        + "(4) para capital\n";

    /**
     * Mensagem exibida ao usuário para escolha de cálculo de juros compostos.
     */
    public static final String COMPOST_MESSAGE = "\n"
        + "Digite o que quer descobrir\n"
        + "(1) para montante final (se não tiver aportes mensais, apenas digitar '0' no valor mensal)\n"
        + "(2) para capital\n"
        + "(3) para taxa\n"
        + "(4) para período\n";

    /**
     * Mensagem exibida ao usuário para escolha entre juros compostos e simples.
     */
    public static final String TYPE = 
        "Digite o tipo de cálculo de juros:\n"
        +"(1) para juros compostos\n"
        +"(2) para juros simples\n";

    /**
     * Mensagem para inserção do período em meses.
     */
    public static final String PERIODO_STRING = "digite o período em meses";

    /**
     * Mensagem para inserção da taxa mensal.
     */
    public static final String TAXA_STRING = "digite a taxa mensal (se precisar, use virgula ',')";

    /**
     * Mensagem para inserção do capital.
     */
    public static final String CAPITAL_STRING = "digite o Capital";

    /**
     * Mensagem para inserção do valor mensal.
     */
    public static final String VALOR_STRING = "digite o valor mensal";

    /**
     * Mensagem para inserção do montante.
     */
    public static final String MONTANTE_STRING = "digite o montante";
}

    /**
    * Constantes relacionadas aos cálculos de juros simples.
    */
    public final class SimplesJuros {

        /**
        * Calcula e exibe o tempo necessário para Juros Simples.
        */
        public static final double TEMPO = (JurosSimples.getJuros() * 100) / (JurosSimples.getCapital() * JurosSimples.getTaxa());
        public static final String TEMPO_STRING = "O tempo é: " + TEMPO + " na grandeza de tempo da taxa";

        /**
        * Calcula e exibe a taxa de Juros Simples.
        */
        public static final double TAXA = (JurosSimples.getJuros() * 100) / (JurosSimples.getCapital() * JurosSimples.getTempo());
        public static final String TAXA_STRING = "A taxa é: " + TAXA + " % na grandeza do tempo";

        /**
        * Calcula e exibe os juros de Juros Simples.
        */
        public static final double JUROS = JurosSimples.getTaxa() * JurosSimples.getCapital() * JurosSimples.getTempo() / 100;
        public static final String JUROS_STRING = "Os juros são: " + JUROS;

        /**
        * Calcula e exibe o capital de Juros Simples.
        */
        public static final double CAPITAL = (JurosSimples.getJuros() * 100) / (JurosSimples.getTaxa() * JurosSimples.getTempo());
        public static final String CAPITAL_STRING = "O capital é: " + CAPITAL;

        /**
        * Mensagem para inserção do valor dos juros.
        */
        public static final String GET_JUROS_STRING = "digite os juros";

        /**
        * Mensagem para inserção do tempo (na mesma grandeza da taxa 'mês ou ano').
        */
        public static final String GET_TEMPO_STRING = "digite o tempo (na mesma grandeza da taxa 'mês ou ano')";

        /**
        * Mensagem para inserção da taxa.
        */
        public static final String GET_TAXA_STRING = "digite a taxa";

        /**
        * Mensagem para inserção do capital.
        */
        public static final String GET_CAPITAL_STRING = "digite o capital";
}

    /**
    * Constantes relacionadas ao cálculo de um quadrilátero.
    */
    public static final class kQuadrilatero {

        /**
        * Mensagem para inserção do lado 1 do quadrilátero.
        */
        public static final String LADO_STRING = "Digite o lado 1:";

        /**
        * Mensagem para inserção do lado 2 do quadrilátero.
        */
        public static final String LADO_STRING2 = "Digite o lado 2:";

        /**
        * Mensagem exibindo a área do quadrilátero.
         */
        public static final String AREA_STRING = "A área do quadrilátero é: ";
    }

    /**
    * Constantes relacionadas ao cálculo de um triângulo.
    */
    public static final class kTriangulo {

        /**
        * Mensagem para inserção da hipotenusa do triângulo.
        */
        public static final String INPUT_STRING = "Digite a hipotenusa:";

        /**
        * Mensagem exibindo a altura do triângulo.
        */
        public static final String ANSW_STRING = "A altura é: ";

        /**
        * Mensagem para inserção da altura do triângulo.
        */
        public static final String INPUT_STRING2 = "Digite a altura do triângulo:";

        /**
        * Mensagem exibindo a hipotenusa do triângulo.
        */
        public static final String ANSW_STRING2 = "A hipotenusa é: ";

        /**
        * Mensagem exibindo a área do triângulo.
        */
        public static final String ANSW_STRING3 = "A área do triângulo é: ";

        /**
        * Mensagem para inserção da base do triângulo.
        */
        public static final String INPUT_STRING4 = "Digite a base:";
    }

    /**
    * Constantes relacionadas à entrada e saída de dados de um cálculo genérico.
    */
    public static final class kTurn {

        /**
         * Mensagem para reber o calculo desejado.
         */
        public static final String OPTION_STRING = 
                "Digite o calculo desejado\n"
                + "(1) para tranformar graus celcius em fahrenheit\n"
                + "(2) para transformar graus fahrenheit em celcius\n"; 

        /**
        * Mensagem para inserção de um número.
        */
        public static final String INPUT_STRING = "Digite o número:";

        /**
        * Mensagem exibindo o resultado do cálculo.
        */
        public static final String ANSW_STRING = "O resultado é: ";
    }
}