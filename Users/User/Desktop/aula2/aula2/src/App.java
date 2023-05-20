import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       JOptionPane.showMessageDialog(null, "Olá, Mundo!");
       String nome = JOptionPane.showInputDialog("Qual seu nome?");
       JOptionPane.showMessageDialog(null, "Seja bem vindo(a): "+nome);
      int idade = Integer.parseInt( JOptionPane.showInputDialog("Informe sua idade?"));
      JOptionPane.showMessageDialog(null, "Sua idade é: "+idade);
      if (idade<18){
        JOptionPane.showMessageDialog(null, "Menor de idade.");
        }
    else{
        JOptionPane.showMessageDialog(null, "Maior de idade.");
        }


    }
}
