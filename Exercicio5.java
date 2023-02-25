package Exercicios;
//5) Faça um programa que solicite alguns dados dos usuários que frequentam um clube. 

//O programa deve solicitar a idade, se a pessoa é fumante ou não (1- SIM, 2- NÃO), seu
//salário líquido e há quanto tempo frequenta o clube (em meses).
//O usuário deverá digitar “encerrar” quando não tiver mais pessoas para registrar. 
//Como dados de saída, o programa deve exibir:
//A média das idades das pessoas;
//A média salarial das pessoas;
//Quantos são fumantes e quantos não são fumantes;
//A porcentagem de pessoas que frequentam o clube há mais de 03 meses. 

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 0;
		int cigarro = 0;
		int fumantes = 0;
		double salario = 0;
		int frequenciaMeses = 0;
		String repetir = "";
		int naofumantes = 0;
		int cont = 0;
		double media = 0;
		double Msalario = 0;
		int frequencia = 0;
		int Totfreq = 0;
		repetir = JOptionPane
				.showInputDialog("Há alguém para registrar? Digite S para Sim ou outro caractere para não");
		while (repetir.equalsIgnoreCase("S")) {

			idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
			media = media + idade;
			cigarro = Integer.parseInt(JOptionPane.showInputDialog("Você fuma? 1 - SIM  | 2 - NÃO"));
			while ((cigarro != 1) && (cigarro != 2)) {
				JOptionPane.showMessageDialog(null, "Valor Inválido", "Erro", (JOptionPane.INFORMATION_MESSAGE));
				cigarro = Integer.parseInt(JOptionPane.showInputDialog("Você fuma? 1 - SIM  | 2 - NÃO"));
			}
			if (cigarro == 1) {
				fumantes = fumantes + 1;
			} else if (cigarro == 2) {
				naofumantes = naofumantes + 1;
			}

			salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu salário?"));
			Msalario = Msalario + salario;
			frequenciaMeses = Integer
					.parseInt(JOptionPane.showInputDialog("Há quantos meses você frequenta o clube? "));
			if (frequenciaMeses >= 3) {
				frequencia = frequencia + 1;
			}
			repetir = JOptionPane
					.showInputDialog("Há alguém para registrar? Digite S para Sim ou outro caractere para não");
			cont = cont + 1;
		}
		
		media = media / cont;
		Msalario = Msalario / cont;
		Totfreq = ((frequencia * 100) / cont);
		JOptionPane.showMessageDialog(null,
				"A media da idade é: " + media + "\n A media salarial é: " + Msalario + "\n Total de fumantes: "
						+ fumantes + "\n Total de não fumantes: " + naofumantes + "\n Percentual de Frequência: "
						+ Totfreq);

	}
}
