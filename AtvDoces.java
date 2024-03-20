import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] args) {
        JFrame caixa = new JFrame("VENDA DE DOCES");
        caixa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        caixa.setSize(3000, 2000);
      
        JPanel panel = new JPanel();
        caixa.add(panel);
      
        JLabel titulo = new JLabel("LOJA DE DOCES");
        panel.add(titulo);
      
        JLabel label = new JLabel("R$ 10,00");
        panel.add(label);
      
        JTextField textField = new JTextField(10);
        panel.add(textField);
  
        JLabel label2 = new JLabel("R$ 15,00");
        panel.add(label2);
      
        JTextField textField2= new JTextField(10);
        panel.add(textField2);
      
        JLabel label3 = new JLabel("R$ 20,00");
        panel.add(label3);
      
        JTextField textField3= new JTextField(10);
        panel.add(textField3);
      
        JButton button = new JButton("Clique Aqui");
        panel.add(button);
    
        button.addActionListener((var e) -> {
            JOptionPane.showMessageDialog(null, "Total: R$ 45,00 ");
        });
      
        caixa.setVisible(true);
    }
}
