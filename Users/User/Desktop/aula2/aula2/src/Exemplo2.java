import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args) {
        //ler valor de um produto 
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto:")) ;       
      JOptionPane.showMessageDialog(null, "Preço: "+valor);
    if (valor<0){
        JOptionPane.showMessageDialog(null, "Valor invalido.");
        }
    else if(valor<500){
        JOptionPane.showMessageDialog(null, "Produto de baixo custo.");
        }
    else{
            JOptionPane.showMessageDialog(null, "Produto de alto custo.");
        }
        
    }

    
}
