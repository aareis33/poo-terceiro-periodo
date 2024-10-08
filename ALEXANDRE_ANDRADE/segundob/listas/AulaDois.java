package segundob.listas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants; // Corrigido para 'javax.swing.SwingConstants'

public class AulaDois {

    public static void main(String[] args) {

        JFrame frame = new JFrame("XVIDEOS!");
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(); // Corrigido: remoção de um painel duplicado
        panel.setBackground(Color.WHITE);
        panel.setLayout(null); // Adicionando layout se necessário

        JLabel label = new JLabel("Clique no botão"); // Corrigido: nome da variável 'label'
        label.setHorizontalAlignment(SwingConstants.CENTER); // Corrigido para 'SwingConstants.CENTER'

        JButton button = new JButton("Clique aqui"); // Adicionado JButton e corrigido nome
        button.setBounds(300, 150, 200, 50); // Definindo tamanho e posição do botão

        button.addActionListener(new ActionListener() { // Corrigido: adição de parênteses
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isBtnClicado = label.getText().equals("Botão clicado"); // Corrigido ':' para ';'

                label.setText(isBtnClicado ? "Clique Aqui" : "Botão clicado"); // Corrigido: aspas simples para aspas duplas
            }
        });

        panel.add(label);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }

}
