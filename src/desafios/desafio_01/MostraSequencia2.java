package desafios.desafio_01;

public class MostraSequencia2 {

	public static void main(String[] args) {
		
		int valor = 2;
		int cont = 1;
		for (int i = 1; i <= 20; i++) {
			System.out.println(valor);
			valor = valor + cont;
			
			cont = cont + 2;
		}

	}

}
