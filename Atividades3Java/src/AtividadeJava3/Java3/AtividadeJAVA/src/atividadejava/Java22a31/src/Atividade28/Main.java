package Atividade28;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=0, r=0, menos=0;
		String nome;
		
		nome = JOptionPane.showInputDialog("Coloque seu nome!");
		n = Integer.parseInt(JOptionPane.showInputDialog("Coloque o quanto você ganha!"));
		
		if (n <= 400) {
			
			r = n * 5;
			menos = r - n;
			JOptionPane.showMessageDialog(null, "Seu nome: "+nome+"\nReajuste de "+ n +" para "+ r +"\nFoi acrescentado: "+ menos);
			
		}
		
		if (n >= 3600 && n <= 12000) {
			
			r = n * 2;
			menos = r - n;
			JOptionPane.showMessageDialog(null, "Seu nome: "+nome+"\nReajuste de "+ n +" para "+ r +"\nFoi acrescentado: "+ menos);
			
		}
		
		if (n >= 12000 && n <= 24000) {
			
			r = n * 1;
			menos = r - n;
			JOptionPane.showMessageDialog(null, "Seu nome: "+nome+"\nReajuste de "+ n +" para "+ r +"\nFoi acrescentado: "+ menos);
			
		}
		
		if (n > 24000) {
			
			r = n * 1;
			menos = r - n;
			JOptionPane.showMessageDialog(null, "Seu nome: "+nome+"\nReajuste de "+ n +" para "+ r +"\nFoi acrescentado: "+ menos);
			
		}	
	
	}
}
