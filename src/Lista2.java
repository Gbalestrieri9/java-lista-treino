
import java.util.Scanner;

class Lista2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Dois numeros:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int maior = somaValor(a,b);


		System.out.println(maior);
	}
	
	private static int somaValor(int a, int b) {
		int resultado = Math.max(b, Math.max(b, a));
		return resultado;
	}
}


