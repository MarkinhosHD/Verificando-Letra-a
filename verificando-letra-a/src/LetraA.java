import javax.swing.JOptionPane;

public class LetraA {

	public static void main(String[] args) {

		        
		        String texto = JOptionPane.showInputDialog(null, "Digite aqui.");

		        int contador = 0;
		        int maiuscula = 0;
		        int minuscula = 0;

		        // Percorre cada caractere da string
		        for (int i = 0; i < texto.length(); i++) {
		            char l = texto.charAt(i);
		            // Verifica se o caractere é 'a' ou 'A'
		            
		            if (l == 'a' || l == 'A') {
		                contador++;
		                
		                if (l == 'a') {
		                	minuscula++;
		                } else {
		                	maiuscula++;
		                }
		                
		            }
		        }

		        if (contador > 0) {
		        	JOptionPane.showMessageDialog(null,"A letra 'a' é usada " + contador + " vezes. "
		        			+ "\nLetra A Maiúscula aparecem " + maiuscula 
		        			+ "\nLetra a Minúscula aparecem " + minuscula);
		            
		        } else {
		        	JOptionPane.showMessageDialog(null,"A letra 'a' não foi usada.");
		        }	
	}

}
