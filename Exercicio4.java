package Exercicios;

import javax.swing.JOptionPane;

//Sabe-se que o lat�o � constitu�do de 70% de cobre e 30% de zinco. Fa�a um programa
//que permita ao usu�rio informar uma quantidade de lat�o em quilos e forne�a 
//o total de cobre e zinco necess�rios para fabricar essa quantidade.
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double quantZinco = 0;
		double quantCobre = 0;
		double QuantKg = 0;
		QuantKg = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de lat�o em quilos: "));
		quantZinco = QuantKg * 0.30;
		quantCobre = QuantKg * 0.70;
		JOptionPane.showMessageDialog(
				null, "A quantidade total de zinco encontrado foi de " + quantZinco
						+ "Kg e a quantidade de cobre foi de " + quantCobre + "Kg.",
				"Valor Encontrado", (JOptionPane.INFORMATION_MESSAGE));

	}

}
