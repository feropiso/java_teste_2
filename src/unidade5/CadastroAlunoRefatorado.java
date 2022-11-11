package unidade5;

import javax.swing.JOptionPane;
import unidade2.MediaNota;

public class CadastroAlunoRefatorado {

	public static void main(String[] args) {
		
		final int TAM = 5;
		
		int aprovados = 0;
		int reprovados = 0;
		
		String alunos [] = new String [TAM];
		boolean situacao [] = new boolean [TAM];
		
		for (int i = 1; i <= TAM; i++) {
			alunos[i-1] = JOptionPane.showInputDialog(null, 
					"Informe o nome do "+i+"° aluno:", "Cadastro de Alunos",
		             JOptionPane.INFORMATION_MESSAGE);
			
			double media = MediaNota.calculaMedia();
			
			if (media <= 5) {
				situacao[i-1] = false;
				aprovados++;
			}
				
			else {
				situacao[i-1] = true;
				reprovados++;
			}			
				
		}
		
		System.out.println("Situação dos alunos:");
		
		for (int i = 0; i < TAM; i++) {
			if(situacao [i])
				System.out.println(alunos[i]+"\t\t Aprovado");
			
			else
				System.out.println(alunos[i]+"\t\t Reprovado");
		}
			
		System.out.println("O número de aprovados: "+aprovados+" E reprovados: "+reprovados);
			

	}

}
