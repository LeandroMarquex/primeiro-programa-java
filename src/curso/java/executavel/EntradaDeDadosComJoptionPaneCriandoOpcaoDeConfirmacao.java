package curso.java.executavel;

import javax.swing.JOptionPane;

public class EntradaDeDadosComJoptionPaneCriandoOpcaoDeConfirmacao {

	public static void main(String args[]) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);

		double resto = carroNumero % pessoaNumero;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão");

		if (resposta == 0) {
			JOptionPane.showConfirmDialog(null, "Divisão para pessoas deu " + divisao);
		} else {
			System.out.println("não quiz ver o RESTO da divisão");
		}

		if (resposta == 0) {
			JOptionPane.showConfirmDialog(null, "O resta da divisão é " + resto);

		} else {
			System.out.println("não quiz ver o RESTO da divisão");

		}

	}

}
