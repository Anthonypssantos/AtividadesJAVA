package Atividade2;

import javax.swing.JOptionPane;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=0, r=0;
		
		JOptionPane.showMessageDialog(null, "Insira um numero entre 8, 9, 7, 4, 5 e 6");
		
		n = Integer.parseInt(JOptionPane.showInputDialog("informe um numero entre 8, 9, 7, 4, 5 e 6\n"));
		
		r = (n / 2);
	
		JOptionPane.showMessageDialog(null, "Numero inserido anteriormente é: "+ r);
	}

}
