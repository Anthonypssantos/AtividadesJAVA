package Java4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int casos=0, n=0, r=0, d=0;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("insire um numero\n"));
		d = Integer.parseInt(JOptionPane.showInputDialog("insire outro numero\n"));
		casos = Integer.parseInt(JOptionPane.showInputDialog("Insire 1 para somar\nInsire 2 para dividir\nInsire 3 para Multiplicar\nInsire 4 para subtrair\n"));
		
		switch (casos) {
		
		case 1:{
			
			r = (n + d);
			
		}
		case 2:{
			
			r = (n / d);
			
		}
		case 3:{
			
			r = (n * d);
			
		}
		case 4:{
			
			r = (n - d);
			
			}
		
		JOptionPane.showMessageDialog(null, "Sua operação matematica: "+ r);
		
		}	
	
	}
}
