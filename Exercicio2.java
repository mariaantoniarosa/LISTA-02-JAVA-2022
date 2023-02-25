package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double notas = 0;
		double soma = 0;
		double m = 0;
		for (int i = 0; i < 4; i++) {
			notas = Double.parseDouble(JOptionPane.showInputDialog("Informe sua " + (i + 1) + "º nota "));
			soma = soma + notas;

		}
		m = soma / 4;
		if (m >= 9) {
			JOptionPane.showMessageDialog(null, "Parabéns, Conceito A", "Resultado", (JOptionPane.INFORMATION_MESSAGE));
		} else if ((m >= 8) && (m < 9)) {
			
			JOptionPane.showMessageDialog(null, "Parabéns, Conceito B", "Resultado", (JOptionPane.INFORMATION_MESSAGE));
		} else if ((m >= 7) && (m < 8)) {
			JOptionPane.showMessageDialog(null, "Você obteve conceito C", "Resultado",
					(JOptionPane.INFORMATION_MESSAGE));
		} else if (m < 7) {
			JOptionPane.showMessageDialog(null, "Você obteve Conceito D, estude mais!", "Resultado",
					(JOptionPane.INFORMATION_MESSAGE));
		}

	}
}
