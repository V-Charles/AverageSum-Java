package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to add?");
		int n = sc.nextInt();
		double[] nomeVetor = new double[n];
		
		System.out.println("Enter the numbers:");
		for(int i=0; i<n; i++) {
			nomeVetor[i] = sc.nextDouble();
		}
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum += nomeVetor[i];
		}
		double media = sum/n;
		
		System.out.printf("Average height: %.2f%n", media);
		
		sc.close();
	}
}
