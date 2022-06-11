package Java3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n, md, r;
		boolean c=true;
		int casos=0;
		
		md = Float.parseFloat(JOptionPane.showInputDialog(null, "Insire o quanto você ganha em inteiro\n"));
		
		casos = Integer.parseInt(JOptionPane.showInputDialog(null, "Insire 1 para aumento de 1%\nInsire 2 para aumento de 3%\nInsire 3 para aumento de 4%\nInsire 4 para aumento de 8%\nInsire 5 para aumento de 10%\nInsire 6 para aumento de 25%\nInsire 7 para aumento de 30%\nInsire 8 para aumento de 50%\nInsire 0 para sair"));
		
		switch (casos){
		
		case 1:{	
			n = 0.1;
			r = n * md;
			
			JOptionPane.showMessageDialog(null, "Você aumento seu salario em 1%"+ r);
		}
		case 2:{
			n = 0.3;
			r = n * md;
			
			JOptionPane.showMessageDialog(null, "Você aumento seu salario em 1%"+ r);
		}
		case 3:{
			n = 0.4;
			r = n * md;
			
			JOptionPane.showMessageDialog(null, "Você aumento seu salario em 1%"+ r);
		}
		case 4:{
			n = 0.8;
			r = n * md;
			
			JOptionPane.showMessageDialog(null, "Você aumento seu salario em 1%"+ r);
		}
		case 5:{
			n = 0.10;
			r = n * md;
			
			JOptionPane.showMessageDialog(null, "Você aumento seu salario em 1%"+ r);
		}
		case 6:{
			n = 0.25;
			r = n * md;
			
			JOptionPane.showMessageDialog(null, "Você aumento seu salario em 1%"+ r);
		}
		case 7:{
			n = 0.30;
			r = n * md;
			
			JOptionPane.showMessageDialog(null, "Você aumento seu salario em 1%"+ r);
		}
		case 8:{
			n = 0.50;
			r = n * md;
			
			JOptionPane.showMessageDialog(null, "Você aumento seu salario em 1%"+ r);
			
		}
		default:{
			
			JOptionPane.showMessageDialog(null, "valeu\n");
			
		}
		
		
		}	
	}
}
