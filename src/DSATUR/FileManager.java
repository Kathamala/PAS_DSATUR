package DSATUR;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	
	public static String writeToFile(int testCase, ArrayList<ArrayList<Integer>> matrix, ArrayList<Integer> colors, long time) throws IOException {
		String outputPath = "src\\result\\testCase" + testCase + "result.txt";
	    String str = "=============================TEST CASE " + testCase +"====================================\n\n";
	    
	    str += "Test Time: " + time + "ms \n\n";
	    
	    str += "Ammount of Vertexes: " + matrix.size() + "\n\n"; 
	    
	    str += "Ammount of Edges: " + getAmmountOfEdges(matrix) + "\n\n"; 
	    
	    str += "Input Matrix:\n\n" + matrixFormat(matrix) + "\n\n"; 
	    
	    str += "Coloring: " + colors + "\n\n"; 
	    
	    str += "Chromatic Number: " + Dsatur.getChromaticNumber(colors) + "\n\n"; 
	    
	    str += "=============================================================================";
	    
	    BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
	    writer.write(str);
	    writer.close();
	    
	    return str;
	}
	
	private static int getAmmountOfEdges(ArrayList<ArrayList<Integer>> matrix) {
		int edges = 0;
		
		for(int i=0; i<matrix.size(); i++) {
			for(int j=0; j<matrix.size(); j++) {
				if(matrix.get(i).get(j) == 1 && i > j) {
					edges++;
				}
			}
		}
		
		return edges;
	}
	
	private static String matrixFormat(ArrayList<ArrayList<Integer>> matrix) {
		String str = "";
		
		for(int i=0; i<matrix.size(); i++) {
			str += "\t";
			for(int j=0; j<matrix.size(); j++) {
				str += matrix.get(i).get(j) + " ";
			}
			str += "\n";
		}
		
		return str;
	}
}










