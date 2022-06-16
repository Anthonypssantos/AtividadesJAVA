package Java3;

import javax.swing.JOptionPane;

public class Main8 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		String nome, rn; 
		
		int i=0;
		
		nome = JOptionPane.showInputDialog("Insire seu primeiro nome");
		
		
		for (i=0; i < nome.length();i++){
		
			JOptionPane.showMessageDialog(null, "Nome separado: " + nome.charAt(i));
			
		}
		
		int j = nome.length()-1;
		
		for (i = j; i >= 0; i--){		
			
			JOptionPane.showMessageDialog(null, "Teste: "+ nome.charAt(i));
		
		}
	}
}