package Exercicios;

import javax.swing.JOptionPane;

//Sabe-se que o latão é constituído de 70% de cobre e 30% de zinco. Faça um programa
//que permita ao usuário informar uma quantidade de latão em quilos e forneça 
//o total de cobre e zinco necessários para fabricar essa quantidade.
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double quantZinco = 0;
		double quantCobre = 0;
		double QuantKg = 0;
		QuantKg = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de latão em quilos: "));
		quantZinco = QuantKg * 0.30;
		quantCobre = QuantKg * 0.70;
		JOptionPane.showMessageDialog(
				null, "A quantidade total de zinco encontrado foi de " + quantZinco
						+ "Kg e a quantidade de cobre foi de " + quantCobre + "Kg.",
				"Valor Encontrado", (JOptionPane.INFORMATION_MESSAGE));

	}

}
