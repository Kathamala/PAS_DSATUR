package DSATUR;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) throws IOException {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		int option = -1;
		Scanner sc = new Scanner(System.in);
		
		//Interface:
		while(option != 0) {
			System.out.println("Informe o caso de teste que você deseja executar (0 para sair): ");
			option = sc.nextInt();
			
			if(option == 2) {
				matrix.add(new ArrayList<Integer>(Arrays.asList(0)));
			}
			else if(option == 3) {
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0)));
			}
			else if(option == 4) {
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
			}
			else if(option == 5) {
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 1, 1)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 1)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0)));
			}
			else if(option == 6) {
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 1, 1, 1)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1, 1)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 1, 1)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 1)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 0)));
			}
			else if(option == 7) {
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 1, 0, 1)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0)));
			}
			else if(option == 8) {
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 0, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1, 0, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 1, 0, 1, 0, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 1, 0, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 1, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 1, 0, 1, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 1, 0, 1, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 1, 0, 1)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 1, 0)));
			}
			else if(option == 9) {
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1, 1)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1, 1)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1, 1)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 1)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 0)));
			}
			else if(option == 10) {
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 1, 1, 1, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 1, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 0, 1, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 0, 0, 0, 1)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 0)));
				matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0)));
			}
			
			if(option > 0 && option < 11) {
				ArrayList<Integer> result = Dsatur.graphColoring(matrix);
				System.out.println(FileManager.writeToFile(option, matrix, result));
				matrix.clear();
			}
		}
		
		sc.close();
	}
}







