import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Texto extends JFrame implements ActionListener
{
   private JTextField txtTexto;
   private JLabel lblTexto;
   private JButton btnMostrar, btnLimpar, btnSair;
   
   public Texto()
   {
      super("Texto");
      
      //entrada
      JPanel painelDadosEntrada = new JPanel(new GridLayout(4, 2));
      JPanel painelEntrada = new JPanel(new FlowLayout());
      txtTexto = new JTextField(10);
      lblTexto = new JLabel("Texto: ");
      painelDadosEntrada.add(lblTexto);
      painelEntrada.add(painelDadosEntrada);
      
      //saida
      JPanel painelDadosSaida = new JPanel(new GridLayout(4, 2));
      JPanel painelSaida = new JPanel(new FlowLayout());
      txtTexto = new JTextField(10);
      painelDadosSaida.add(lblTexto);
      painelDadosSaida.add(txtTexto);
      painelSaida.add(painelDadosSaida);
      
      //botoes
      JPanel painelBotoes = new JPanel(new FlowLayout());
      btnMostrar = new JButton("Mostrar");
      btnLimpar= new JButton("Limpar");
      btnSair = new JButton("Sair");
      painelBotoes.add(btnMostrar);
      painelBotoes.add(btnLimpar);
      painelBotoes.add(btnSair);
      
      //mostrar tela
      Container caixa = getContentPane();
      caixa.setLayout(new BorderLayout());
      caixa.add(painelSaida, BorderLayout.WEST);
      caixa.add(painelBotoes, BorderLayout.SOUTH);
      
      //listerner botoes
      btnMostrar.addActionListener(this);
      btnLimpar.addActionListener(this);
      btnSair.addActionListener(this);
      
      // arremates finais
      setSize(310, 190);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e) 
   {
      // depois iremos aprender a modularizar melhor
      if (e.getSource() == btnMostrar) 
      {
         String texto = txtTexto.getText();
         JOptionPane.showMessageDialog(null, texto);
      }
      else if (e.getSource() == btnLimpar) 
      {
         txtTexto.setText("");
      } 
      else 
      {
         System.exit(0);
      }
   }
}