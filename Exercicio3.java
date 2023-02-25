package Exercicios;

import javax.swing.JOptionPane;

//Escreva um programa que leia um número inteiro e apresente um menu para
//o usuário escolher:
//1. Verificar se o número é múltiplo de algum outro número (pedir ao
//usuário esse número);
//2. Verificar se o número é par;
//3. Verificar se o número está entre 0 e 1000;
//4. Sair
//Após as entradas de dados, deve ser mostrado ao usuário o resultado da
//respectiva opção escolhida, e novamente o menu. Para a opção “4- Sair”, utilize
//System.exit(0);
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
		int multiplo = 0;
		int result = 0;
		String repetir = "";
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));

		do {
			int menu = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção que gostaria"
					+ "\n 1 - Verificar se o número é múltiplo" + "\n 2 - Verificar se o número é par"
					+ "\n 3 - Verificar se está entre 01 e 1000" + "\n 4 - Sair "));
			while ((menu != 1) && (menu !=2) && (menu != 3 ) && (menu!=4)) {
				menu = Integer.parseInt(JOptionPane.showInputDialog("Opção Inválida, por favor digite novamente." ));
			}
			switch (menu) {
			case 1:
				multiplo = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
				result = numero % multiplo;
				if (result == 0) {
					JOptionPane.showMessageDialog(null, "O número é multiplo", "Opção 1",
							(JOptionPane.INFORMATION_MESSAGE));
				} else {
					JOptionPane.showMessageDialog(null, "O número não é multiplo", "Opção 1",
							(JOptionPane.INFORMATION_MESSAGE));
				}
				break;

			case 2:
				if ((numero % 2) == 0) {
					JOptionPane.showMessageDialog(null, "O número é par", "Opção 2", (JOptionPane.INFORMATION_MESSAGE));
				} else {
					JOptionPane.showMessageDialog(null, "O número não é par", "Opção 2",
							(JOptionPane.INFORMATION_MESSAGE));
				}
				break;

			case 3:
				if ((numero >= 1) && (numero <= 1000)) {
					JOptionPane.showMessageDialog(null, "O número está entre 01 e 1000", "Opção 3",
							(JOptionPane.INFORMATION_MESSAGE));
				} else {
					JOptionPane.showMessageDialog(null, "O número não está entre 01 e 1000.", "Opção 3",
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
