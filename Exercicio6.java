package Exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menor = 0;
		double MPares = 0;
		double TodosMeses = 0;
		double media = 0;
		int cont = 0;
		double MediaPares = 0;
		double SegundoSemestre = 0;
		int maior = 0;
		double vlrMaior = 0;
		double vlrMenor = 0;
		// DecimalFormat df = new DecimalFormat ("0.00");
		// JOptionPane.showMessageDialog(null, "A soma total do semestre � R$ " +
		// df.format(soma));
		DecimalFormat km = new DecimalFormat("0.00");
		double[] Totmes = new double[12];
		// for (int i= 0; i<vetor; i++) {
		for (int i = 0; i < 12; i++) {
			Totmes[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor total do " + (i + 1) + "� m�s"));

			TodosMeses = TodosMeses + Totmes[i];
			if ((i % 2) == 0) {
				MediaPares = MediaPares + Totmes[i];
			}
			if (i > 5) {
				SegundoSemestre = SegundoSemestre + Totmes[i];

			}
			cont = cont + 1;

			if (Totmes[i] > vlrMaior) {
				vlrMaior = Totmes[i];
				maior = i;
			}

			/*
			 * i == 0 pois quando o usu�rio digitar na primeira vez a 1� posi��o do vetor a
			 * variavel menor ir� receber o n�mero digitado, assim, nas pr�ximas jogadas ele
			 * ir� substituir o n�mero digitado caso for menor que o numero anterior.
			 */
			/*
			 * mesma coisa no totmes, ele vai verificar se totmes � menor do que vlrMenor,
			 * pois na primeira vez executando, vlrmenor � 0. E nas proximas jogadas ele vai
			 * comparando conforme recebe os valores, ele vai pegando o i e colocando na
			 * variavel menor.
			 */
			if ((Totmes[i] < vlrMenor) || (i == 0)) {
				vlrMenor = Totmes[i];
				menor = i;
			}

		}
		SegundoSemestre = SegundoSemestre / 6;
		MPares = MediaPares / 6;
		media = TodosMeses / cont;
		JOptionPane.showMessageDialog(null,
				"A maior venda foi no " + (maior + 1) + "� m�s" + "\n A menor venda foi no "+
				(menor + 1) + "� m�s" + "\n A m�dia das vendas do ano todo � de R$" + km.format(media)
						+ "\n M�dia dos meses pares: R$" + km.format(MPares) + "\n M�dia das vendas do 2� Semestre: R$"
						+ km.format(SegundoSemestre));
	}

}
