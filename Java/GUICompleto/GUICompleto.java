import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class GUICompleto {
// Construção de um GUI completo
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("Spongebob2.jpg");                  // cria um ícone de uma imagem no label ou na tela
        Border border = BorderFactory.createLineBorder(Color.green, 3);     // cria uma fronteira que sublinha toda a imagem
        JLabel label = new JLabel();                                        // cria um espaço de texto
        label.setText("Bruh");                                              // escreve o texto
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);                     // posicionar texto no centro, esquerda ou direita  
        label.setVerticalTextPosition(JLabel.TOP);                          // posicionar texto no topo, centro ou em baixo
        label.setForeground(Color.BLACK);                                   // muda a cor da fonte do texto 
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));                 // muda o tipo de fonte, tamanho, estilo do texto
        label.setIconTextGap(0);                                           // muda a distância do texto à imagem
        label.setBackground(Color.black);                                   // cor do plano de fundo
        //label.setOpaque(false);                                           // ativa/desativa o setBackground()
        label.setBorder(border);                                            // coloca a fronteira                             
        label.setVerticalAlignment(JLabel.CENTER);                          // coloca a posição do ícone + texto no centro (vertical)
        label.setHorizontalAlignment(JLabel.CENTER);                        // coloca a posição do ícone + texto no centro (horizontal)
        //label.setBounds(100, 100, 250, 250);                                // coloca o a posição nas coordenadas x,y,z e dimensão

        JFrame frame = new JFrame();                                        // cria a frame/tela
        frame.setTitle("Diogo Sargaco");                                    // título da tela/programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);               // sai do programa quando clicamos no butão de sair
        frame.setResizable(true);                                           // impede a tela de ser reajustada se false
        //frame.setSize(420,420);                                           // tamanho da tela
        //frame.setLayout(null);
        frame.setVisible(true);                                             // tela fica visível
        frame.add(label);
        frame.setIconImage(image.getImage());                               // muda o ícone da tela
        frame.getContentPane().setBackground(Color.CYAN);                   // muda a cor do plano de fundo (ciano)
        frame.pack();                                                       // vem depois de tudo
    }
}