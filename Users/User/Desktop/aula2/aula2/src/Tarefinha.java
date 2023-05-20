import javax.swing.JOptionPane;

public class Tarefinha {
    public static void main(String[] args) {
        int salario = Integer.parseInt( JOptionPane.showInputDialog("Informe seu salario?"));
            JOptionPane.showMessageDialog(null, "Seu salario é: "+salario);
        if (salario>=1320){
            JOptionPane.showMessageDialog(null, "Salario Alto.");
        }
        else if(salario<1320 && salario>0){
            JOptionPane.showMessageDialog(null, "Salario Baixo.");
        }
        else if(salario<0){
            JOptionPane.showMessageDialog(null, "Trabalho escravo.");
        }

        
    }
    
}
