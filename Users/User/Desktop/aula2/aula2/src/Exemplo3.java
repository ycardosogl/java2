import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args) {
         String opc = JOptionPane.showInputDialog("Informe um curso:\n 1- Java \n 2- JavaScript");

         opc = opc.toLowerCase();
         if(opc.equals("1") || opc.equals("java")){
            JOptionPane.showMessageDialog(null," Curso de Backend"); }
        else if(opc.equals("2") || opc.equals("javascrips")) {
            JOptionPane.showMessageDialog(null," Curso de Frontend");
        }
        else{
            JOptionPane.showMessageDialog(null," Opção Invalida!"); }

        }
        
    }
    

