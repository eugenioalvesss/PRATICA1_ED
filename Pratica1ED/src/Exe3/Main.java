package Exe3;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int vet [] = new int [10];
		
		Random randomico = new Random();
		
		System.out.print("Vetor desordernado: ");
		for(int i = 0; i < vet.length;i++) {
			vet [i] = randomico.nextInt(100);
			System.out.printf("%d ", vet[i]);
		}
		
		int aux;
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 9; j++) {
				if(vet[j] > vet[j+1] ) {
					aux = vet[j];
					vet[j] = vet [j+1];
					vet[j+1] = aux;
				}
			}
			
		System.out.print("\n\nVetor organizado:");
		for(int i = 0; i < vet.length; i++) {
			System.out.printf("%d ",vet [i]);
		}
		System.out.println("\nDigite o número que deseja encontrar:");
		int num = entrada.nextInt();	
		
        int inicio=0, meio=0, fim=vet.length - 1;
        while(inicio <= fim) {
        	meio = (fim+inicio) / 2; 
        	
        	if(vet[meio] == num) {
		        System.out.printf("Encontrou o número %d na posição %d \n", num, meio);
		        break;
        	}
        	
        	if(vet[meio] < num) { 
        	
        		inicio = meio + 1;
        	}else {
        	
		        fim = meio - 1;
        	}
       
		    if(inicio > fim) {
		      System.out.println("Não encontrou o número " + num);
		    }
        }
        entrada.close();
        System.out.println("fim!!!");
	}
}

}