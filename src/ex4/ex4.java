package ex4;

import java.util.*;

public class ex4 {
	static int[] entrada = new int[10];
	static int[] saida = new int[10];
	public static void inserirValores() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< entrada.length; i++) {
			int indice = i+1;
			System.out.println("Insira o "+indice+"º número");
			entrada[i] = sc.nextInt();
		}
		trocarVetor();
	}
	public static void trocarVetor() {
		for(int j = 0; j<entrada.length;j++) {
			if(j%2 == 0) {
				saida[j] = entrada[j]*5;
			}else if(j%2 !=0) {
				saida[j] = entrada[j]+5;
			}
		}
		imprimeEntrada();
	}
	
	public static void imprimeEntrada() {
		System.out.print("A entrada foi: entrada[");
		for(int a = 0; a<entrada.length; a++) {
			if(a != 9) {
				System.out.print(entrada[a] + ", ");
				}else {
					System.out.print(entrada[a]);
				}
		}
		System.out.print("]");
		imprimeSaida();
	}
	
	public static void imprimeSaida() {
		System.out.println("");
		System.out.print("A saída é: saida[");
		for (int b = 0; b<saida.length;b++) {
			if(b != 9) {
			System.out.print(saida[b] + ", ");
			}else {
				System.out.print(saida[b]);
			}
		}
		System.out.print("]");
	}
	
	public static void main(String[] args) {
		inserirValores();
	}
}
