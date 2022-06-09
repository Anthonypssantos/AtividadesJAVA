package Atividade2;

import javax.swing.JOptionPane;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float s=0, r=0;
		
		JOptionPane.showMessageDialog(null, "Insira um saldo aleatorio\n");
		
		s = Float.parseFloat(JOptionPane.showInputDialog("Insire seu saldo com ."));
		
		r = s - 1;
		
		JOptionPane.showMessageDialog(null, "Teste: "+ r);
		
	}

}
