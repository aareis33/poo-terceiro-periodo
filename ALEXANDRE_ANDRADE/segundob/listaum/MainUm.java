package segundob.listaum;
import javax.swing.JOptionPane;

public class MainUm {

    public static void main(String[] args) {
        mostrarMensagem("Olá, Mundo!");
        String nome = pedirNome();
        mostrarMensagem("Bem-vindo(a), " + nome + "!");
        String opcao = escolherOpcao();
        mostrarMensagem("Você escolheu: " + opcao);

        try {
            throw new MinhaExcecao("Ocorreu um erro personalizado.");
        } catch (MinhaExcecao e) {
            mostrarErro(e.getMessage());
        }
    }

    public static void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static String pedirNome() {
        return JOptionPane.showInputDialog("Qual é o seu nome?");
    }

    public static String escolherOpcao() {
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        return (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Opções",
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
    }

    public static void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    static class MinhaExcecao extends Exception {
        public MinhaExcecao(String mensagem) {
            super(mensagem);
        }
    }
}
