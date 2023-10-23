package curso.java.executavel;

public class OperacaoLogicaAninhada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1 = 100;
		int nota2 = 100;
		int nota3 = 100;
		int nota4 = 70;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		// Operações lógicas aninhadas: são operações de dentro de operações

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno esta aprovado DIRETO PARABENS " + media);

				} else {
					System.out.println("Aluno esta aprovado DIRETO " + media);
				}
			} else {
				System.out.println("Aluno em RECUPERAÇÃO " + media);
			}

		} else {

			System.out.println("Aluno REPROVADO  DIRETO " + media);

		}

	}

}
