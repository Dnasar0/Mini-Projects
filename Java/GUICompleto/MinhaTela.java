import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class MinhaTela extends JFrame {
// Podemos usar uma classe secundária para construir a tela, por exemplo
    MinhaTela() {                                  

        this.setTitle("Diogo Sargaço");                             // título da tela/programa
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        // sai do programa quando clicamos no botão de sair
        this.setResizable(false);                                   // impede a tela de ser reajustada
        this.setSize(420,420);                                      // tamanho da tela
        this.setVisible(true);                                      // tela fica visível

        ImageIcon image = new ImageIcon("Spongebob.jpg");           // cria um ícone de uma imagem
        this.setIconImage(image.getImage());                        // muda o ícone da tela
        this.getContentPane().setBackground(new Color(255,215,0));  // muda a cor do plano de fundo (dourado)
    }
}