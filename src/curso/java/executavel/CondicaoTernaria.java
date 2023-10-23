package curso.java.executavel;

public class CondicaoTernaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1 = 100;
		int nota2 = 100;
		int nota3 = 50;
		int nota4 = 50;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Aluno aprovado com MÉDIA " + media);
		} else if (media >= 48 && media <= 69) {
			System.out.println("Aluno em RECUPERAÇÃO " + media);
		} else {
			System.out.println("Aluno REPROVADO " + media);
		}
		
		/*Operadores ternários são para micro validadores*/
		String saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69 ? "Aluno em recuperação" : "Reprovado");
		System.out.println(saidaResultado);
	}

}
