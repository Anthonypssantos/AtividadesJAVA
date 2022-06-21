package Atividade31;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = new int[3];
		
		for (int i=0;i<3;i++) {
			
			n[i] = Integer.parseInt(JOptionPane.showInputDialog("Coloque numeros"));
		
		}
		
		if (n[0] > n[1] && n[1] > n[2]) {
			
			for(int i=0; i<3;i++){
			
				JOptionPane.showMessageDialog(null, "Em ordem: "+ n[i]);
				
			}	
		}
		
		if (n[0] < n[1] && n[1] > n[2] || n[1] < n[2] && n[2] > n[1]) {
			
			JOptionPane.showMessageDialog(null, "ordem errada");
			
		}
	}
}
