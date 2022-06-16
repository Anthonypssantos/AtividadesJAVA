package Atividades3Java;

import javax.swing.JOptionPane;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int US=0, rD=0;
		
		US = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor em dolar"));
		
		rD = (US / 5);
		
		JOptionPane.showMessageDialog(null, "Converção para reais: "+ rD);
	}

}
