package desafios.desafio_03;

public class NovoAlfabeto1 {

	public static void main(String[] args) {
		
		char b = 0;
		
		char c = 0;
		
		for (int i = 97; i < 122; i++) {
			
			b = (char)i;
			
			c = (char) (i+1);			
			
			System.out.println(b+" -> "+c);
			
		}

	}

}
