package Java4;

import javax.swing.JOptionPane;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome, p,cripto="";
		int i=0;
		
		nome = JOptionPane.showInputDialog("Insira uma palavra");
		
		for(i=0;i<nome.length();i++) {
			
			
			
			cripto += String.valueOf((int)nome.charAt(i)+3);
			
		}
		JOptionPane.showMessageDialog(null, "Nome Criptografado: "+cripto+"\nNome: "+nome);
		
	}

}
