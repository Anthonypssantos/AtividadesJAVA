package Java3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] aux2 = new String[200];
		//Auxiliar
		String[] aux = new String[100];
		
		//Inteiros
		int nfl=0, casos=0, caso1=0, tam=0, p=0, remove=0;
		
		//Verdadeiro e Falso
		boolean c1=true, c2=true, c3=true;
		
		do{
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para cadastrar os livros\n2 para ver os livros cadastrados\n3 para retirar o livro\n4 para adicionar o livro retirado\n5 para sair"));	
			
		switch(casos){
		
		case 1:{
			
			tam = Integer.parseInt(JOptionPane.showInputDialog("Insira quantos livros desejas cadastrar\n"));
			p++;
			String[] liv = new String[tam];
			
			
			for (int i=0 ; i < tam ; i++){
				
				liv[i] = JOptionPane.showInputDialog("Nome do livro");
				aux[i] = liv[i];
				
			}
			
				
			break;	
			}
		
		case 2:{
			
			for (int i=0 ; i < tam ; i++){
				
				JOptionPane.showMessageDialog(null, "Livros cadastrados: " + aux[i] + "\n");
	
			}

			break;
			}
		
		case 3:{
			
			JOptionPane.showMessageDialog(null, "Você tem : " + tam + " livros cadastrados");
			
			for (int i=0; i < tam ; i++){
				
				JOptionPane.showMessageDialog(null, "Livro: "+ aux[i]);
				
				remove = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para remover este livro\nDigite 0 para não retirar este livro"));
				
				if (remove == 1){
				
				aux2[i] = aux[i]; 
				aux[i] = null;
				
				}
				
			}
			break;
		}
		
		case 4:{
			
			for (int i=0; i < tam ; i++){
				
				
				remove = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para adicionar o livro retirado"));
				
				if (remove == 1){
					
					aux[i] = aux2[i];
					
				}
			}
			
			break;
		}
		
		default:{
			c1=false;
			break;
			}
		
		}
		
		
		}while(c1==true);	
	}
}
