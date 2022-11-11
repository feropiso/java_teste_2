package unidade5;

import javax.swing.JOptionPane;

public class CadastroAluno {

	public static void main(String[] args) {
		
		final int TAM = 5;
		
		String alunos [] = new String [TAM];
		
		for (int i = 1; i <= TAM; i++)
			alunos[i-1] = JOptionPane.showInputDialog(null, 
					"Informe o nome do "+i+"° aluno:", "Cadastro de Alunos",
		             JOptionPane.INFORMATION_MESSAGE);
		
		System.out.println("Os alunos são:");
		
		for (int i = 0; i < TAM; i++) 		
			System.out.println(alunos[i]);
		

	}

}
