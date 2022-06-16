package Atividade3java;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome, sobrenome;
		
		
		nome = JOptionPane.showInputDialog("Insira somente seu primeiro nome");
		
		sobrenome = JOptionPane.showInputDialog("Insira somente seu segundo nome");
		
		JOptionPane.showMessageDialog(null, nome.charAt(0)+""+sobrenome.charAt(0));
	
		
		
	}

}
