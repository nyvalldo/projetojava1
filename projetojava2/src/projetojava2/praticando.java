package projetojava2;

public class praticando {

	public static void main(String[] args) {
		double nota1=7.0, nota2=2.0, nota3=8.0;
		double soma = nota1 + nota2 + nota3;
		double media = soma / 3;
		
		if(media >= 7.0) {
			System.out.println("Aprovado = " + media + " foi a sua media");
		} else {
			System.out.println("Reprovado = " + media + " foi a sua media");
		}
	}
}
