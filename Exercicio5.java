package Exercicios;
//5) Fa�a um programa que solicite alguns dados dos usu�rios que frequentam um clube. 

//O programa deve solicitar a idade, se a pessoa � fumante ou n�o (1- SIM, 2- N�O), seu
//sal�rio l�quido e h� quanto tempo frequenta o clube (em meses).
//O usu�rio dever� digitar �encerrar� quando n�o tiver mais pessoas para registrar. 
//Como dados de sa�da, o programa deve exibir:
//A m�dia das idades das pessoas;
//A m�dia salarial das pessoas;
//Quantos s�o fumantes e quantos n�o s�o fumantes;
//A porcentagem de pessoas que frequentam o clube h� mais de 03 meses. 

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
				.showInputDialog("H� algu�m para registrar? Digite S para Sim ou outro caractere para n�o");
		while (repetir.equalsIgnoreCase("S")) {

			idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
			media = media + idade;
			cigarro = Integer.parseInt(JOptionPane.showInputDialog("Voc� fuma? 1 - SIM  | 2 - N�O"));
			while ((cigarro != 1) && (cigarro != 2)) {
				JOptionPane.showMessageDialog(null, "Valor Inv�lido", "Erro", (JOptionPane.INFORMATION_MESSAGE));
				cigarro = Integer.parseInt(JOptionPane.showInputDialog("Voc� fuma? 1 - SIM  | 2 - N�O"));
			}
			if (cigarro == 1) {
				fumantes = fumantes + 1;
			} else if (cigarro == 2) {
				naofumantes = naofumantes + 1;
			}

			salario = Double.parseDouble(JOptionPane.showInputDialog("Qual � o seu sal�rio?"));
			Msalario = Msalario + salario;
			frequenciaMeses = Integer
					.parseInt(JOptionPane.showInputDialog("H� quantos meses voc� frequenta o clube? "));
			if (frequenciaMeses >= 3) {
				frequencia = frequencia + 1;
			}
			repetir = JOptionPane
					.showInputDialog("H� algu�m para registrar? Digite S para Sim ou outro caractere para n�o");
			cont = cont + 1;
		}
		
		media = media / cont;
		Msalario = Msalario / cont;
		Totfreq = ((frequencia * 100) / cont);
		JOptionPane.showMessageDialog(null,
				"A media da idade �: " + media + "\n A media salarial �: " + Msalario + "\n Total de fumantes: "
						+ fumantes + "\n Total de n�o fumantes: " + naofumantes + "\n Percentual de Frequ�ncia: "
						+ Totfreq);

	}
}
