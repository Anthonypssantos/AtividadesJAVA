package Atividade2;

import javax.swing.JOptionPane;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia=30, mes=12, ano=365, rm=0, ra=0, da=0, n=0, m=0, d=0, p=0;
		
		
		JOptionPane.showMessageDialog(null, "Insire sua idade, mês atual e dia");
		m = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês atual"));
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos anos você tem"));
		d = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia atual"));
		
		if (m >= 1 && m <= 12) {
			
			rm = (mes * m);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Você só pode inserir o mês de 1 até 12");
				
		}
		
		if (n >= 1) {
			
			ra = (ano * n);
			
		}
		
		if (d >= 1 && d <= 30) {
			
			da = (dia * d);
	
					
		}else {
			
			
			JOptionPane.showMessageDialog(null, "Você só pode inserir o dia de 1 até 30");
			
		}
		
		p = ra + rm + da;
		
		JOptionPane.showMessageDialog(null, "Quantidade de dias: "+ p);
		
	}
	
}