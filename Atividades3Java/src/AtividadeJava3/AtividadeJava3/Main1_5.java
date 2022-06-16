package atividadejava;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] f = new int[10];
		int[] v = new int[10];
		int[] r = new int[10];
		
		int i=0, maior=0, menor=0, rec1=0, r1=0, p=0, h=0, j=0;
		
		//for
		for (i=0;i<10;i++){
			
			v[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira numeros aleatorios ou em ordem!"));
			
			rec1 = v[i];
			
			if (rec1 >= v[4]) {
				
				p++;
				maior = v[i];
				
			}
			
			if (rec1 <= v[4] && rec1 >= 0) {
				
				h++;
				menor = v[i];
				
			}
		}
		
		
		
		for( i=0; i < v.length ;i++ ) {
			
			v[i] = v.length -i;
		
			System.out.println("Decrescente: "+v[i]);
			
			f[i] = v[i];
			
		}
		
		JOptionPane.showMessageDialog(null, "Existem "+p+"numeros acima de"+ v[4]+"\nExistem "+h+"numeros a baixo de"+ v[4]);
		
	}
}