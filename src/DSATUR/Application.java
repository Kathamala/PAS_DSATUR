package DSATUR;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Application {
	
	public static void main(String[] args) throws IOException {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0)));
		
		Dsatur.graphColoring(matrix);
		
		matrix.clear();
		
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 1, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0)));
		
		Dsatur.graphColoring(matrix);
	}
}
