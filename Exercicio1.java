package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor = 0;
		double valores = 0;
		int soma = 0;
		// for (int l=0; l<6; l++) {
		vetor = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para o tamanho do vetor:"));
		for (int i = 0; i < vetor; i++) {
			valores = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor inteiro"));
			if (valores < 0) {
				soma = soma + 1;

			}
		}
		JOptionPane.showMessageDialog(null, "A quantidade de números negativos que você digitou é " + soma);
	}
}
