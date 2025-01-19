import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{

  private int count = 0;                                                     // contador a 0
  private JFrame frame;
  private JLabel label;
  private JPanel panel;

  public GUI() {

      frame = new JFrame();                                                  // frame do GUI

      JButton button = new JButton("Click me");                              // cria um botão
      button.addActionListener(this);
      label = new JLabel("Number of clicks: 0");                             // texto inicial do programa
 

      panel = new JPanel();
      panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));      // painel do GUI
      panel.setLayout(new GridLayout(0, 1));
      panel.add(button);                                                     // adiciona o botão
      panel.add(label);                                                      // adiciona o texto inicial

      frame.add(panel, BorderLayout.CENTER);                                 // centra o GUI
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                  // botão de fechar 
      frame.setTitle("Our GUI");                                             // nome do GUI 
      frame.pack();                                                          // encaixa o GUI no windows
      frame.setVisible(true);                                                // visível
  }

  @Override
  public void actionPerformed(ActionEvent e) {
      count++;                                                               // incrementa o contador sempre que se clica no botão
      label.setText("Number of clicks: " + count);                           // atualiza o texto para o número de vezes que o botão já foi clicado
      
  }

  public static void main(String[] args) {
    new GUI();
  }

}
