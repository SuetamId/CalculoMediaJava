package primeiroprogramajava;

import javax.swing.JOptionPane;

public class PrimeiraClassaJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {
		/* meu primeiro projeto java */

		String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4");

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

		/* Media para aprovação é 70 */

		if (media >= 50) {

			if (media >= 70) {

				JOptionPane.showMessageDialog(null, "O aluno esta aprovado com a média de : " + media);
			} else {

				JOptionPane.showMessageDialog(null, "O aluno esta de recuperação com media de:  " + media);
			}
		} else {

			JOptionPane.showMessageDialog(null, "O aluno esta reprovado com media de:  " + media);
		}
	}
}
