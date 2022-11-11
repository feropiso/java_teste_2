package desafios.desafio_04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import unidade2.MediaNota;

public class CadastroAluno {

	public static void main(String[] args) throws IOException {
		
		final int TAM = 5;
		
		String alunos [] = new String [TAM];
		int frequencia [] = new int [TAM];;		
		boolean situacao [] = new boolean [TAM];
				
		for (int i = 1; i <= TAM; i++) {
			alunos[i-1] = JOptionPane.showInputDialog(null, 
					"Informe o nome do "+i+"° aluno:", "Cadastro de Alunos",
		             JOptionPane.INFORMATION_MESSAGE);
			
			//Método do exercício da unidade 2.
			double media = MediaNota.calculaMedia();
			
			frequencia[i-1] = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"Informe a frequencia do "+i+"° aluno:", "Cadastro de Alunos",
		             JOptionPane.INFORMATION_MESSAGE));
			
			if (media >= 5 && frequencia[i-1] >= 75)
				situacao[i-1] = true;				
							
			else 
				situacao[i-1] = false;							
				
		}
		
		FileWriter 	arq = new FileWriter("aprovados.txt");
		FileWriter 	arq2 = new FileWriter("reprovados.txt");
		
		PrintWriter gravaarq = new PrintWriter(arq);	
		PrintWriter gravaarq2 = new PrintWriter(arq2);
		
		for (int i = 0; i < TAM; i++) {
			if(situacao [i])
				gravaarq.print(alunos[i]+"\t\t Aprovado\n");
			
			else
				gravaarq2.print(alunos[i]+"\t\t Reprovado\n");
		}
			
		arq.close();
		gravaarq.close();
		arq2.close();
		gravaarq2.close();

	}

}
