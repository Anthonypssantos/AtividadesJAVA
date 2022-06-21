package Atividade30;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade=0, salario, rs=0;
		String nome, recebe, M, F;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Coloque sua idade"));
		nome = JOptionPane.showInputDialog("Coloque seu nome");
		salario = Integer.parseInt(JOptionPane.showInputDialog("Coloque seu salario fixo"));
		recebe = JOptionPane.showInputDialog("Coloque seu biotipo Ex: M/Maculino ou F/Feminino");
		
		if (recebe == "M") {
			
			M = recebe;
			
			if (idade >= 30) {
				
				rs = salario + 100;
				
			}
			
			if (idade < 30) {
				
				rs = salario + 50;
				
			}
		
		}
		
		if (recebe == "F") {
			
			F = recebe;
			
			if (idade >= 30) {
				
				rs = salario + 200;
				
			}
			
			if (idade < 30) {
				
				rs = salario + 80;
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Salario: "+ rs);
		
	}
}
