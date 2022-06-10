package Atividades;

import javax.swing.JOptionPane;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menos=0, mais=0, recebe=0;
		
		recebe = Integer.parseInt(JOptionPane.showInputDialog(null, "Insire um numero"));
		
		mais = (recebe + 1);
		menos = (recebe - 1);
		
		JOptionPane.showMessageDialog(null, "Numero principal: "+ recebe + "\nAntecessor: " + menos + "\nSucessor: " + mais);
		
	}

}
