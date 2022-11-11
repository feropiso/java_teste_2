package unidade4;

import javax.swing.JOptionPane;

public class CadastraAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "";
		String matricula = "";
		
		nome = JOptionPane.showInputDialog (null, "Informe o nome do aluno:", "Cadastro estudantil",
	             JOptionPane.INFORMATION_MESSAGE);
		
		while (nome.length() <= 2) 			
			nome = JOptionPane.showInputDialog (null, "Informe o nome do aluno novamente:", "Campo inválido",
		             JOptionPane.INFORMATION_MESSAGE);
		
		matricula = JOptionPane.showInputDialog (null, "Informe a matricula do aluno:", "Cadastro estudantil",
	             JOptionPane.INFORMATION_MESSAGE);
		
		while (matricula.length() != 7) 			
			matricula = JOptionPane.showInputDialog (null, "Informe a matricula do aluno novamente:", "Campo inválido",
		             JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Aluno: "+nome+"\nMatrícula: "+matricula, "Cadastro estudantil",
	             JOptionPane.INFORMATION_MESSAGE);

	}

}
