package curso.java.executavel;

public class EstruturaDeRepeticaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		
		while (numero <= 60) { // Verifica e depois executa
			System.out.println("O numero atual é : " + numero);
			numero++;
		}
		
		int numero2 = 0;
		do { // primeiro executa e depois verifica
			System.out.println(" O numero atual é " + numero2);
			numero2++;
		} while (numero2 <= 60);

	}

}
