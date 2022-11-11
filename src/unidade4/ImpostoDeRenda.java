package unidade4;

import javax.swing.JOptionPane;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		
		double imposto, renda_mensal, salario_liquido;
		int numero_dependentes = 0;
		int numero_contribuintes = 1;
		String cpf = "";
		String nome = "";
		
		while(numero_contribuintes <= 10){
			
			nome = JOptionPane.showInputDialog("Digite o seu Nome");
			cpf = JOptionPane.showInputDialog("Digite o seu Cpf");
			numero_dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes"));
			renda_mensal = Double.parseDouble(JOptionPane.showInputDialog("Digite o sua renda mensal"));
			 
			salario_liquido = renda_mensal - (numero_dependentes*189.59) - 0.11*renda_mensal;
			
			if (salario_liquido <= 1903.98) {
				imposto = 0;
				JOptionPane.showMessageDialog(null, "O contribuinte "+nome+" é isento!");
			}
			
			else if ((salario_liquido > 1903.99) && (salario_liquido <= 2826.65)){
				imposto = 0.075*salario_liquido - 142.80;
				JOptionPane.showMessageDialog(null, "O IRPF do contribuinte "+nome+" é de R$"+imposto);
			}
			
			else if ((salario_liquido > 2826.66) && (salario_liquido <= 3751.05)){
				imposto = 0.15*salario_liquido - 354.80;
				JOptionPane.showMessageDialog(null, "O IRPF do contribuinte "+nome+" é de R$"+imposto);
			}
			
			else if ((salario_liquido > 3751.06) && (salario_liquido <= 4664.68)){
				imposto = 0.225*salario_liquido - 636.13;
				JOptionPane.showMessageDialog(null, "O IRPF do contribuinte "+nome+" é de R$"+imposto);
			}
			
			else {
				imposto = 0.275*salario_liquido - 869.36;
				JOptionPane.showMessageDialog(null, "O IRPF do contribuinte "+nome+" é de R$"+imposto);
			}			
		}

	}

}
