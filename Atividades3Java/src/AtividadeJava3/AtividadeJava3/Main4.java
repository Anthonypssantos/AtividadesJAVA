package Java4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String senh1, senh2, nome1, nome2;
		
		JOptionPane.showMessageDialog(null, "Faça Cadastro");
		
		nome1 = JOptionPane.showinputDialog(null, "Crie seu nome de usuario\n");
		senh1 = JOptionPane.showinputDialog(null, "Crie sua senha\n");
		
		JOptionPane.showMessageDialog(null, "Faça login");
		
		nome2 = JOptionPane.showinputDialog(null, "Insire seu nome de usuario\n");
		senh2 = JOptionPane.showinputDialog(null, "Insire uma senha\n");
		
		if (nome1 == nome2 && senh1 == senh2) {
			
			JOptionPane.showMessageDialog(null, "Você logu na padaria.bat"+ nome2);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Programa encerrado\n");
			
		}
	}
}
