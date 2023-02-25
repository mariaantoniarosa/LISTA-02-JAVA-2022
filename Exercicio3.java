package Exercicios;

import javax.swing.JOptionPane;

//Escreva um programa que leia um n�mero inteiro e apresente um menu para
//o usu�rio escolher:
//1. Verificar se o n�mero � m�ltiplo de algum outro n�mero (pedir ao
//usu�rio esse n�mero);
//2. Verificar se o n�mero � par;
//3. Verificar se o n�mero est� entre 0 e 1000;
//4. Sair
//Ap�s as entradas de dados, deve ser mostrado ao usu�rio o resultado da
//respectiva op��o escolhida, e novamente o menu. Para a op��o �4- Sair�, utilize
//System.exit(0);
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
		int multiplo = 0;
		int result = 0;
		String repetir = "";
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro: "));

		do {
			int menu = Integer.parseInt(JOptionPane.showInputDialog("Informe a op��o que gostaria"
					+ "\n 1 - Verificar se o n�mero � m�ltiplo" + "\n 2 - Verificar se o n�mero � par"
					+ "\n 3 - Verificar se est� entre 01 e 1000" + "\n 4 - Sair "));
			while ((menu != 1) && (menu !=2) && (menu != 3 ) && (menu!=4)) {
				menu = Integer.parseInt(JOptionPane.showInputDialog("Op��o Inv�lida, por favor digite novamente." ));
			}
			switch (menu) {
			case 1:
				multiplo = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero: "));
				result = numero % multiplo;
				if (result == 0) {
					JOptionPane.showMessageDialog(null, "O n�mero � multiplo", "Op��o 1",
							(JOptionPane.INFORMATION_MESSAGE));
				} else {
					JOptionPane.showMessageDialog(null, "O n�mero n�o � multiplo", "Op��o 1",
							(JOptionPane.INFORMATION_MESSAGE));
				}
				break;

			case 2:
				if ((numero % 2) == 0) {
					JOptionPane.showMessageDialog(null, "O n�mero � par", "Op��o 2", (JOptionPane.INFORMATION_MESSAGE));
				} else {
					JOptionPane.showMessageDialog(null, "O n�mero n�o � par", "Op��o 2",
							(JOptionPane.INFORMATION_MESSAGE));
				}
				break;

			case 3:
				if ((numero >= 1) && (numero <= 1000)) {
					JOptionPane.showMessageDialog(null, "O n�mero est� entre 01 e 1000", "Op��o 3",
							(JOptionPane.INFORMATION_MESSAGE));
				} else {
					JOptionPane.showMessageDialog(null, "O n�mero n�o est� entre 01 e 1000.", "Op��o 3",
							(JOptionPane.INFORMATION_MESSAGE));
				}
				break;

			case 4:
				System.exit(4);
				break;

			}
			repetir = JOptionPane.showInputDialog("Digite S para continuar e outro caractere para encerrar: ");
			// botar o while
		} while (repetir.equalsIgnoreCase("S"));

	}
}
