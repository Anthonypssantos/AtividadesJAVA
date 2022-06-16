package Java4;

import javax.swing.JOptionPane;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double r=0, reias;
		
		reias = Double.parseDouble(JOptionPane.showInputDialog("Insira sua quantia do mês")); 
		
		r = (reias * 0.70);
	
		JOptionPane.showMessageDialog(null, "Seua renda: "+ r);
	
	
	
	}

}
