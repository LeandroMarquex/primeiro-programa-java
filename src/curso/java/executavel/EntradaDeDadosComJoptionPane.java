package curso.java.executavel;

import javax.swing.JOptionPane;

public class EntradaDeDadosComJoptionPane {
	
	public static void main(String args[]) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		
		JOptionPane.showConfirmDialog(null, "Divis�o para pessoas deu "  + divisao + " carros e sobrou " + resto + " carros ");
	}

}
