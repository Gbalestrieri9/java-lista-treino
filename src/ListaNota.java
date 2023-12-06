import java.util.Scanner;

public class ListaNota{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		

		System.out.println("digite sua 1ª nota");
		a = sc.nextInt();

		System.out.println("digite sua 2ª nota");
		b = sc.nextInt();

		System.out.println("digite sua 3ª nota");
		c = sc.nextInt();

		System.out.println("digite sua 4ª nota");
		d = sc.nextInt();
		
		int mediaDoAluno = calcularMedia(a,b,c,d);
		String alunoMedia = situacaoMedia(calcularMedia(a,b,c,d));
		
		System.out.println("A media do aluno é: " + mediaDoAluno + "\n" + alunoMedia);

	}

	private static int calcularMedia (int a,int b,int c,int d) {
		int resultado = (a + b + c + d)/4;
		return resultado;
	}
	
	private static String situacaoMedia(int media) {
		String situacaoMedia = "";
		if (media == 10) {
			situacaoMedia = "Aprovado com Distinção";
		} else if (media >= 7) {
			situacaoMedia = "Aprovado";
		} else if (media < 7 & media >= 5) {
			situacaoMedia = "Recuperação";
		} else if (media < 5) {
			situacaoMedia = "Reprovado";
		}
		return situacaoMedia;
	}


}

