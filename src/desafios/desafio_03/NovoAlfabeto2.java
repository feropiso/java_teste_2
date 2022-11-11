package desafios.desafio_03;

public class NovoAlfabeto2 {

	public static void main(String[] args) {
		
		int a = 0;
		char b = 0;		
		char c = 0;		
		int contador = 2;
		
		
		for (int i = 97; i <= 122; i++) {
			
			if (contador > 3)
				contador = 1;
			
			b = (char)i;
			
			if (i > 120) {
				
				c = (char) (97 + a);
				a++;
			}
			else {
				c = (char) (i + contador);
			}
						
			System.out.println(b+" -> "+c);	
							
			contador ++;
			
		}

	}

}
