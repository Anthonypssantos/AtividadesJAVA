package Ativade23;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		
		n =Integer.parseInt(JOptionPane.showInputDialog("insire um numero!"));
		
		if (n > 80) {
			
			JOptionPane.showMessageDialog(null, "Numero maior que 80");
			
		}
		
		if (n < 25) {
					
					JOptionPane.showMessageDialog(null, "Numero menor que 25");
					
		}
		
		if (n == 40) {
	
			JOptionPane.showMessageDialog(null, "Numero igual a 40");
	
		}
		
	}

}
