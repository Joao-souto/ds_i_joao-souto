package Calculadora;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Calculadora {

    public static void main(String[] args){
        JFrame miJFrame = new JFrame("Calculadora - Java Swing");
        miJFrame.setSize(500,300); 

        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);

        // usamos este diseño para centrar los componentes de JPanel
        miJPanel.setLayout(new GridBagLayout());

        // componente JTextField
        JLabel miJLabel = new JLabel();
        miJLabel.setText("RESULTADO: ");

        JTextField miJTextArea = new JTextField(); 

        // conecta los componentes JLabel y JTextField en JPanel
        miJPanel.add(miJLabel);
        miJPanel.add(miJTextArea);

        // conectar Jpanel a JFrame
        miJFrame.add(miJPanel);

        // hacer visible JFrame
        miJFrame.setVisible(true);
    }
}