package Atividade2Java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double m1=1.70, m2=1.80, m3=1.50, m4=1.75, m5=1.90, f1=1.50, f2=1.40, f3=1.70, f4=1.60, f5=1.70, mr, fr, rm, rf;
	
	rm = (m1 + m2 + m3 + m4 + m5);
	rf = (f1 + f2 + f3 + f4 + f5);
	
	mr = (rm / 5);
	fr = (rf / 5);
	
	System.out.println("Media da altura dos Homens: "+ mr + "\nMedia da altura das mulheres: "+ fr + "\nExistem 5 mulheres"+ "\nMenor tamanho do grupo: "+ f2 + "\nMaior tamanho do grupo: "+ m5);
	
	}

}
