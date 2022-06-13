package Java3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sb=0, ht=0, sh=0, nd=0, inss=0, ir=0;
		
		ht = Integer.parseInt(JOptionPane.showInputDialog("Insire a quantidade de horas trabalhadas\n"));

		sh = Integer.parseInt(JOptionPane.showInputDialog("Insire a sua quantidade de salario hora\n"));
		
		nd = Integer.parseInt(JOptionPane.showInputDialog("Insire o seu numero dependente\n"));
		
		sb = ht + sh + (50 * nd);
		
		if (sb <= 1000){
			
			inss = sb * 7/100;
			
		}
		
		if (sb > 1000){
			
			inss = sb * 9/100;
			
		}
	
		if (sb <= 500){
			
			ir = 0;
			
		}
		
		if (sb > 500 && sb <= 1000){
			
			ir = sb * 5/100;
			
		}
		
		if (sb > 1000){
			
			ir = sb * 7/100;
			
		}
		
		JOptionPane.showMessageDialog(null, "Seu salario bruto: "+ sb + "\nSeu desconto de INSS: "+ inss + "Seu ir"+ ir);
		
	}
}