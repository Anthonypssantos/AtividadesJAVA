package Atividade2;

import javax.swing.JOptionPane;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int smo=1200, j,r=0, p=0;
		
		r = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira seu salario\n"));
		
		 if (r > 1.200) {
		
			 p = (r / smo);
			 j = (r - smo);
			 JOptionPane.showMessageDialog(null, "Você recebe: "+ p + "\nSalários/o mínimos/o"+ "\nE o resto: "+ j);
			 
		 }
		 
		 
		 
	}
}
