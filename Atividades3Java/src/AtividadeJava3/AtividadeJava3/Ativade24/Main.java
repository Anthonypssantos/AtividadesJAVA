package Ativade24;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam=1;
		
		tam = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros desejas comparar?"));
		
		int[] n = new int[tam];
		
		for (int i=0; i < tam; i++) {
			
			n[i] = Integer.parseInt(JOptionPane.showInputDialog("Coloque um numero"));
			
		}
		
		for (int i=0; i < tam; i++) {
			
			System.out.println("Numero: "+ n[i] +" Numero negativo: -"+ n[i]+ "\n");
			
		}
		
		
	}
}
