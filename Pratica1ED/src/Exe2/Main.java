package Exe2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[][] matriz = new int[3][4];
		int maxInt = 0;
		int minInt = 100;
		Random random = new Random();
		for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(0, 100);
                System.out.printf("%d\t",matriz[i][j]);
                if(minInt>matriz[i][j])minInt=matriz[i][j];
                if(maxInt<matriz[i][j])maxInt=matriz[i][j];
            }
            System.out.print("\n");

	}

}
}