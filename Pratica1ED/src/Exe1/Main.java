package Exe1;

import java.util.Scanner;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		 Random random = new Random();
		 
		 Scanner entrada = new Scanner (System.in);
		    
		 int[] vet = new int[10];
	        int shared, controler = -1;
	        System.out.println("Insira o número que deseja buscar");
	        shared = entrada.nextInt();

	        for (int i = 0; i < vet.length; i++) {
	            vet[i] = random.nextInt(30);
	            System.out.print( vet[i] + " " );
	        }
	        for (int i = 0; i < vet.length; i++) {
	            if (shared == vet[i]) {
	                controler = i + 1;
	                System.out.println("\n Número encontrado na posição " + controler + ".");
	            }
	        }
	        if (controler == -1) System.out.println("\n Número não encontrado!");

	    }
	}
		