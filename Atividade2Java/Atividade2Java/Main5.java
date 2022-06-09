package Atividades;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p=0, valor1=0,valor2=0, ipi=0, quant1=0, quant2=0;
		
		JOptionPane.showMessageDialog(null, "Insire os dados");
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Peça 1\n"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Peça 2\n"));
		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Peça 2\n"));
		quant1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade 1\n"));
		quant2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade 2\n"));
		ipi = Integer.parseInt(JOptionPane.showInputDialog(null, "Insire o IPI\n"));
		
		p = (valor1*quant1*valor2*quant2)*(ipi/100 + 1);
		
		
		JOptionPane.showMessageDialog(null, "Formula: "+ p);
		
	}

}
