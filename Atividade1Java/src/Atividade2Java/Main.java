import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome, cep, nb;
		int nc, idade;
		
		JOptionPane.showMessageDialog(null, "Cadastre seus dados");
		nome = JOptionPane.showInputDialog("Informe seu nome");
		cep = JOptionPane.showInputDialog("Informe seu cep");
		nb = JOptionPane.showInputDialog("Informe o nome de seu bairro");
		nc = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de sua casa"));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nCep: " + cep + "\nBairro: " + nb + "\nNumero da casa:  " + nc + "\nIdade: " + idade);
		
		
		
	}

}
