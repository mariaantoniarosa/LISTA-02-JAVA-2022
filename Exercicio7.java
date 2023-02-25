package Exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7) Um estudante do ensino m�dio gostaria de controlar melhor suas notas nas
		 * disciplinas exatas. Ele gostaria de poder enxergar suas notas dos 4 bimestres
		 * com exatamente duas casas decimais e em formato de matriz, como no exemplo a
		 * seguir:
		 * 
		 * Matem�tica F�sica Qu�mica 9.53 8.66 8.45 7.57 9.00 8.01 8.87 9.44 7.88 7.30
		 * 6.77 9.21
		 * 
		 * Al�m disso, o estudante gostaria de poder escolher algumas op��es de
		 * visualiza��o de acordo com o menu abaixo: Todas as notas de todas as
		 * disciplinas; Qual a maior nota e em qual disciplina foi; A m�dia das notas de
		 * alguma disciplina (solicitar qual); As notas de um dos bimestres (solicitar
		 * qual); Encerrar. Fa�a um programa que permita cadastrar as notas de acordo
		 * com o exemplo (considerando a ordem das disciplinas) e forne�a os dados
		 * supracitados. O menu deve ser exibido repetitivamente, at� que o usu�rio
		 * deseje encerrar o programa.
		 */
		/*
		 * double[][] valores = new double[6][4]; for (int l = 0; l < 6; l++) { for (int
		 * c = 0; c < 4; c++) { valores[l][c] = Double.parseDouble((JOptionPane
		 * .showInputDialog("Informe o valor do " + (l + 1) + "� m�s,  " + (c + 1) +
		 * "� Semana"))); soma = soma + valores[l][c]; }
		 */
		DecimalFormat dc = new DecimalFormat("0.00");
		int opcao = 0;
		double maior = 0;
		double somadorMat = 0;
		double mediaMat = 0;
		double[] notaMat = new double[4];
		double[] notaQuim = new double[4];
		double[] notaFis = new double[4];
		double somadorQuim = 0;
		double mediaQuim = 0;
		double somadorFis = 0;
		double mediaFis = 0;
		String materia = "";
		int qualMateria = 0;
		int qualBimestre = 0;
		String Resp = "";
		String aux = "";
		for (int i = 0; i < 4; i++) {
			notaMat[i] = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Informe a sua " + (i + 1) + "� nota de matem�tica: ",
							"Disciplina: Matem�tica", (JOptionPane.INFORMATION_MESSAGE)));
			while ((notaMat[i] < 0) || (notaMat[i] > 10)) {
				notaMat[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "N�mero Inv�lido, digite novamente. ",
						"Erro", (JOptionPane.INFORMATION_MESSAGE)));
			}
			notaQuim[i] = Double
					.parseDouble(JOptionPane.showInputDialog(null, "Informe a sua " + (i + 1) + " � nota de qu�mica: ",
							"Disciplina Quimica ", (JOptionPane.INFORMATION_MESSAGE)));
			while ((notaQuim[i] < 0) || (notaQuim[i] > 10)) {
				notaQuim[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
						"N�mero Inv�lido, digite novamente. ", "Erro", (JOptionPane.INFORMATION_MESSAGE)));
			}
			notaFis[i] = Double
					.parseDouble(JOptionPane.showInputDialog(null, "Informe a sua " + (i + 1) + "� nota de f�sica: ",
							"Discliplina F�sica", (JOptionPane.INFORMATION_MESSAGE)));
			while ((notaFis[i] < 0) || (notaFis[i] > 10)) {
				notaFis[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "N�mero Inv�lido, digite novamente. ",
						"Erro", (JOptionPane.INFORMATION_MESSAGE)));
			}
		}

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"O que gostaria de ver?" + "\n 1 - Notas em formato de matriz " + "\n 2 - Maior nota do boletim"
							+ "\n 3 - Media das notas de uma das disciplinas" + "\n 4 - Nota de um dos bimestres"));
			while ((opcao != 1) && (opcao != 2) && (opcao != 3) && (opcao != 4)) {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Op��o inv�lida, por favor digite novamente",
						"Erro", (JOptionPane.INFORMATION_MESSAGE)));
			}

			switch (opcao) {
			case 1:

				aux = "Mat | Qui  | Fis \n";
				for (int i = 0; i < 4; i++) {

					aux = aux + notaMat[i] + "   " + notaQuim[i] + "   " + notaFis[i] + "\n";
					

				}

				JOptionPane.showMessageDialog(null, aux);

				break;

			case 2:

				for (int i = 0; i < 4; i++) {
					somadorMat = somadorMat + notaMat[i];
					mediaMat = somadorMat / 4;
					if (notaMat[i] > maior) {
						maior = notaMat[i];
						materia = "Matem�tica";

					}
					somadorQuim = somadorQuim + notaQuim[i];
					mediaQuim = somadorQuim / 4;
					if (notaQuim[i] > maior) {
						maior = notaQuim[i];
						materia = "Qu�mica";
					}
					somadorFis = somadorFis + notaFis[i];
					mediaFis = somadorFis / 4;
					if (notaFis[i] > maior) {
						maior = notaQuim[i];
						materia = "F�sica";
					}
				}

				JOptionPane.showMessageDialog(null, "A maior nota foi " + dc.format(maior) + "na disclipina " + materia,
						"Maior Nota", (JOptionPane.INFORMATION_MESSAGE));
				break;

			case 3:
				qualMateria = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Qual mat�ria gostaria de ver? " + "\n 1 - Matem�tica" + "\n 2 - Qu�mica" + "\n 3 - F�sica ",
						"M�dia de uma disciplina", (JOptionPane.INFORMATION_MESSAGE)));
				while ((qualMateria != 1) && (qualMateria != 2) && (qualMateria != 3)) {
					qualMateria = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Op��o Inv�lida, por favor digite novamente", "Erro", (JOptionPane.INFORMATION_MESSAGE)));
				}

				if (qualMateria == 1) {
					JOptionPane.showMessageDialog(null, "M�dia Matem�tica: " + dc.format(mediaMat));

				} else if (qualMateria == 2) {
					JOptionPane.showMessageDialog(null, "M�dia Qu�mica: " + dc.format(mediaQuim));

				} else if (qualMateria == 3) {
					JOptionPane.showMessageDialog(null, "M�dia F�sica: " + dc.format(mediaFis));
				}

				break;

			case 4:
				qualBimestre = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Qual bimestre gostaria de ver? " + "\n 1 = 1� Bimestre" + "\n 2 = 2� Bimestre"
								+ "\n 3 = 3� Bimestre" + "\n 4 = 4� Bimestre",
						"Bimestre Mat�rias", (JOptionPane.INFORMATION_MESSAGE)));
				while ((qualBimestre != 1) && (qualBimestre != 2) && (qualBimestre != 3) && (qualBimestre != 4)) {
					qualBimestre = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Op��o inv�lida, digite novamente.", "Erro", (JOptionPane.INFORMATION_MESSAGE)));
				}
				for (int i = 0; i <4; i++) {
					if (qualBimestre == (i+1)) {
						JOptionPane.showMessageDialog(null,
								"Matem�tica: " + dc.format(notaMat[i]) + "\n Qu�mica: " + dc.format(notaQuim[i])
										+ "\n F�sica: " + dc.format(notaFis[i]),
								(i + 1) + "� Bimestre", (JOptionPane.INFORMATION_MESSAGE));

					}
				}
			}
			Resp = JOptionPane.showInputDialog("Gostaria de continuar? Digite S para SIM ou N para N�O");

		} while (Resp.equalsIgnoreCase("S"));

	}

}
