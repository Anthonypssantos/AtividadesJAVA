package AtividadeJava3;

import javax.swing.JOptionPane;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a, n;
		int  p;
		
		p = Float.parseFloat(JOptionPane.showInputDialog("Insire o quanto que seus funcionarios ganham\n"));
		n = Integer.parseInt(JOptionPane.showInputDialog("Insire a quantidade de funcionarios que tens em sua empresa\n"))
				
		a = p / n;
		
		JOptionPane.showMessageDialog(null, "A media dos seus funcionarios: "+ a);
	
	}
}
