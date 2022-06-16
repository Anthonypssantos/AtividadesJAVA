package Atividade3java;

import javax.swing.JOptionPane;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0, n2=0; 
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um segundo numero"));
		
		if (n1 > n2){
			
			JOptionPane.showMessageDialog(null, "Menor numero: "+ n2 + "\nMaior numero: " + n1);
			
		}
		
		if (n2 > n1){
			
			JOptionPane.showMessageDialog(null, "Menor numero: "+ n1 + "\nMaior numero: "+ n2);
			
		}
		
		if (n1 == n2){
			
			JOptionPane.showMessageDialog(null, "Codigo encerrado");
			
		}
	}

}
