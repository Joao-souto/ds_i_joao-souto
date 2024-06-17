package Calculadora;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Calculadora {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                criarGUI();
            }
        });
    }

    public static void criarGUI() {
        JFrame frame = new JFrame("Calculadora - Java Swing");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel InterfaceGeral = new JPanel();

        // Criação do JPanel para os botões
        JPanel botoes = new JPanel();
        botoes.setLayout(new BoxLayout(botoes, BoxLayout.Y_AXIS));

        // Criação do JPanel para os inputs
        JPanel fileira1 = new JPanel();
        JPanel fileira2 = new JPanel();
        JPanel fileira3 = new JPanel();
        JPanel fileira4 = new JPanel();

        // Criação dos botões de operações
        JButton adicaoButton = new JButton("+");
        JButton subtracaoButton = new JButton("-");
        JButton divisaoButton = new JButton("/");
        JButton multiplicacaoButton = new JButton("*");
        botoes.add(adicaoButton);
        botoes.add(subtracaoButton);
        botoes.add(divisaoButton);
        botoes.add(multiplicacaoButton);

        // Criação dos botões de números
        JButton[] numButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
        }

        // Criação de botões restantes
        JButton virgulaButton = new JButton(",");
        JButton apague = new JButton("<|");

        // adicionando botões as fileiras
        fileira1.add(numButtons[9]);
        fileira1.add(numButtons[8]);
        fileira1.add(numButtons[7]);
        fileira2.add(numButtons[6]);
        fileira2.add(numButtons[5]);
        fileira2.add(numButtons[4]);
        fileira3.add(numButtons[3]);
        fileira3.add(numButtons[2]);
        fileira3.add(numButtons[1]);
        fileira4.add(numButtons[0]);
        fileira4.add(virgulaButton);
        fileira4.add(apague);

        JTextField textField = new JTextField("RESULTADO: ");
        textField.setEditable(false); 

        // Adicionando fileiras a um componente para organizar 
        InterfaceGeral.add(fileira1);
        InterfaceGeral.add(fileira2);
        InterfaceGeral.add(fileira3);
        InterfaceGeral.add(fileira4);

        // Adição dos componentes ao JFrame
        frame.add(InterfaceGeral);
        frame.add(botoes);

        // Exibe o JFrame
        frame.setVisible(true);
    }
}
