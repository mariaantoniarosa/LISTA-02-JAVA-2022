package Exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7) Um estudante do ensino médio gostaria de controlar melhor suas notas nas
		 * disciplinas exatas. Ele gostaria de poder enxergar suas notas dos 4 bimestres
		 * com exatamente duas casas decimais e em formato de matriz, como no exemplo a
		 * seguir:
		 * 
		 * Matemática Física Química 9.53 8.66 8.45 7.57 9.00 8.01 8.87 9.44 7.88 7.30
		 * 6.77 9.21
		 * 
		 * Além disso, o estudante gostaria de poder escolher algumas opções de
		 * visualização de acordo com o menu abaixo: Todas as notas de todas as
		 * disciplinas; Qual a maior nota e em qual disciplina foi; A média das notas de
		 * alguma disciplina (solicitar qual); As notas de um dos bimestres (solicitar
		 * qual); Encerrar. Faça um programa que permita cadastrar as notas de acordo
		 * com o exemplo (considerando a ordem das disciplinas) e forneça os dados
		 * supracitados. O menu deve ser exibido repetitivamente, até que o usuário
		 * deseje encerrar o programa.
		 */
		/*
		 * double[][] valores = new double[6][4]; for (int l = 0; l < 6; l++) { for (int
		 * c = 0; c < 4; c++) { valores[l][c] = Double.parseDouble((JOptionPane
		 * .showInputDialog("Informe o valor do " + (l + 1) + "º mês,  " + (c + 1) +
		 * "º Semana"))); soma = soma + valores[l][c]; }
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
					JOptionPane.showInputDialog(null, "Informe a sua " + (i + 1) + "º nota de matemática: ",
							"Disciplina: Matemática", (JOptionPane.INFORMATION_MESSAGE)));
			while ((notaMat[i] < 0) || (notaMat[i] > 10)) {
				notaMat[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Número Inválido, digite novamente. ",
						"Erro", (JOptionPane.INFORMATION_MESSAGE)));
			}
			notaQuim[i] = Double
					.parseDouble(JOptionPane.showInputDialog(null, "Informe a sua " + (i + 1) + " º nota de química: ",
							"Disciplina Quimica ", (JOptionPane.INFORMATION_MESSAGE)));
			while ((notaQuim[i] < 0) || (notaQuim[i] > 10)) {
				notaQuim[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
						"Número Inválido, digite novamente. ", "Erro", (JOptionPane.INFORMATION_MESSAGE)));
			}
			notaFis[i] = Double
					.parseDouble(JOptionPane.showInputDialog(null, "Informe a sua " + (i + 1) + "º nota de física: ",
							"Discliplina Física", (JOptionPane.INFORMATION_MESSAGE)));
			while ((notaFis[i] < 0) || (notaFis[i] > 10)) {
				notaFis[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Número Inválido, digite novamente. ",
						"Erro", (JOptionPane.INFORMATION_MESSAGE)));
			}
		}

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"O que gostaria de ver?" + "\n 1 - Notas em formato de matriz " + "\n 2 - Maior nota do boletim"
							+ "\n 3 - Media das notas de uma das disciplinas" + "\n 4 - Nota de um dos bimestres"));
			while ((opcao != 1) && (opcao != 2) && (opcao != 3) && (opcao != 4)) {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Opção inválida, por favor digite novamente",
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
						materia = "Matemática";

					}
					somadorQuim = somadorQuim + notaQuim[i];
					mediaQuim = somadorQuim / 4;
					if (notaQuim[i] > maior) {
						maior = notaQuim[i];
						materia = "Química";
					}
					somadorFis = somadorFis + notaFis[i];
					mediaFis = somadorFis / 4;
					if (notaFis[i] > maior) {
						maior = notaQuim[i];
						materia = "Física";
					}
				}

				JOptionPane.showMessageDialog(null, "A maior nota foi " + dc.format(maior) + "na disclipina " + materia,
						"Maior Nota", (JOptionPane.INFORMATION_MESSAGE));
				break;

			case 3:
				qualMateria = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Qual matéria gostaria de ver? " + "\n 1 - Matemática" + "\n 2 - Química" + "\n 3 - Física ",
						"Média de uma disciplina", (JOptionPane.INFORMATION_MESSAGE)));
				while ((qualMateria != 1) && (qualMateria != 2) && (qualMateria != 3)) {
					qualMateria = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Opção Inválida, por favor digite novamente", "Erro", (JOptionPane.INFORMATION_MESSAGE)));
				}

				if (qualMateria == 1) {
					JOptionPane.showMessageDialog(null, "Média Matemática: " + dc.format(mediaMat));

				} else if (qualMateria == 2) {
					JOptionPane.showMessageDialog(null, "Média Química: " + dc.format(mediaQuim));

				} else if (qualMateria == 3) {
					JOptionPane.showMessageDialog(null, "Média Física: " + dc.format(mediaFis));
				}

				break;

			case 4:
				qualBimestre = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Qual bimestre gostaria de ver? " + "\n 1 = 1º Bimestre" + "\n 2 = 2º Bimestre"
								+ "\n 3 = 3º Bimestre" + "\n 4 = 4º Bimestre",
						"Bimestre Matérias", (JOptionPane.INFORMATION_MESSAGE)));
				while ((qualBimestre != 1) && (qualBimestre != 2) && (qualBimestre != 3) && (qualBimestre != 4)) {
					qualBimestre = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Opção inválida, digite novamente.", "Erro", (JOptionPane.INFORMATION_MESSAGE)));
				}
				for (int i = 0; i <4; i++) {
					if (qualBimestre == (i+1)) {
						JOptionPane.showMessageDialog(null,
								"Matemática: " + dc.format(notaMat[i]) + "\n Química: " + dc.format(notaQuim[i])
										+ "\n Física: " + dc.format(notaFis[i]),
								(i + 1) + "º Bimestre", (JOptionPane.INFORMATION_MESSAGE));

					}
				}
			}
			Resp = JOptionPane.showInputDialog("Gostaria de continuar? Digite S para SIM ou N para NÃO");

		} while (Resp.equalsIgnoreCase("S"));

	}

}
