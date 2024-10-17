package segundob.listaum;

import javax.swing.JOptionPane;

// Classe principal
public class MainDois {

    public static void main(String[] args) {
        try {
            realizarCalculo();
        } catch (MinhaExcecao e) {
            mostrarErro(e.getMessage());
        }
    }

    // Método para realizar o cálculo
    public static void realizarCalculo() throws MinhaExcecao {
        String operacao = escolherOperacao();
        double num1 = obterNumero("Digite o primeiro número:");
        double num2 = obterNumero("Digite o segundo número:");

        double resultado = calcular(operacao, num1, num2);
        mostrarMensagem("O resultado é: " + resultado);
    }

    // Método para escolher a operação
    public static String escolherOperacao() {
        String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        return (String) JOptionPane.showInputDialog(null, "Escolha uma operação:",
                "Calculadora", JOptionPane.QUESTION_MESSAGE, null, operacoes, operacoes[0]);
    }

    // Método para obter um número
    public static double obterNumero(String mensagem) throws MinhaExcecao {
        String entrada = JOptionPane.showInputDialog(mensagem);
        try {
            return Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            throw new MinhaExcecao("Entrada inválida! Por favor, insira um número.");
        }
    }

    // Método para calcular
    public static double calcular(String operacao, double num1, double num2) throws MinhaExcecao {
        switch (operacao) {
            case "Soma":
                return num1 + num2;
            case "Subtração":
                return num1 - num2;
            case "Multiplicação":
                return num1 * num2;
            case "Divisão":
                if (num2 == 0) {
                    throw new MinhaExcecao("Divisão por zero não é permitida.");
                }
                return num1 / num2;
            default:
                throw new MinhaExcecao("Operação inválida.");
        }
    }

    // Método para mostrar mensagens
    public static void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para mostrar erros
    public static void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    // Exceção personalizada
    static class MinhaExcecao extends Exception {
        public MinhaExcecao(String mensagem) {
            super(mensagem);
        }
    }
}
