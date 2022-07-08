package DSATUR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Dsatur {
	
	static ArrayList<Integer> degreeArray = new ArrayList<Integer>();
	static ArrayList<Integer> vertexOrderedByDegree = new ArrayList<Integer>();
	static ArrayList<Integer> vertexColors = new ArrayList<Integer>();
	static ArrayList<Integer> vertexSaturations = new ArrayList<Integer>(); 
	static ArrayList<ArrayList<Integer>> m = new ArrayList<ArrayList<Integer>>();
	
	public static ArrayList<Integer> graphColoring(ArrayList<ArrayList<Integer>> matrix) 
	{
		if(matrix.size() == 0) return new ArrayList<Integer>(Arrays.asList());
		
		// setup
		setup();
		m = matrix;
		m.stream().forEach((i) -> {degreeArray.add(0); vertexColors.add(0); vertexSaturations.add(0);});

		// Passo 1: Ordene os vértices do grafo em ordem decrescente de graus; 
		updateDegrees();
		updateVertexOrderedByDegree();
		
		// Passo 2: Atribua ao vértice de maior grau a cor 1; 
		vertexColors.set(vertexOrderedByDegree.get(0), 1);

		// Passo 5: Se todos os vértices estiverem coloridos, pare. Caso contrário, retorne à 
		// etapa 3.
		
		while(vertexNotColored()) { 
			updateVertexSaturations();
			
			// Passo 3: Selecione o vértice não colorido com maior grau de saturação. 
			// Se houver vértices com mesmo grau de saturação, opte por qualquer um de grau 
			// máximo pertencente ao sub-grafo ainda não colorido; 
			int v = getNonColoredVertexWithHighestSatur();
			
			// Passo 4: Atribua ao vértice selecionado a cor de menor índice disponível; 
			int minColor = getMinimumAvailableColor(v);
			vertexColors.set(v, minColor);
		}
		
		System.out.println("Colors: " + vertexColors);
		return vertexColors;
	}
	
	private static void setup() {
		degreeArray.clear();
		vertexOrderedByDegree.clear();
		vertexColors.clear();
		vertexSaturations.clear();
	}
	
	private static int getMinimumAvailableColor(int vertex) {
		
		ArrayList<Integer> adjacentColors = new ArrayList<Integer>();
		
		for(int i=0; i<m.size(); i++) {
			if(m.get(vertex).get(i) == 1 && vertexColors.get(i) != 0) {
				adjacentColors.add(vertexColors.get(i));
			}
		}
		
		Collections.sort(adjacentColors);	
		
		int finalColor = 1;
		
		for(int i=0; i<adjacentColors.size(); i++) {
			if(finalColor == adjacentColors.get(i)) {
				finalColor++;
			}
		}
		
		return finalColor;
	}
	
	private static int getNonColoredVertexWithHighestSatur() {	
		ArrayList<Integer> highestVertexes = new ArrayList<Integer>(); 
		
		int maxValue = -1;
		
		for(int i=0; i<vertexSaturations.size(); i++) {
			if(vertexColors.get(i) == 0) {
				if(vertexSaturations.get(i) > maxValue) {
					highestVertexes.clear();
					maxValue = vertexSaturations.get(i);
					highestVertexes.add(i);
				} 
				else if(vertexSaturations.get(i) == maxValue) {
					highestVertexes.add(i);
				}	
			}
		}	

		// Desempate:
		int maxIndex = -1;
		int maxDegree = -1;
		
		for(int i=0; i<highestVertexes.size(); i++) {
			int degree = degreeArray.get(highestVertexes.get(i));
			if(degree > maxDegree) {
				maxDegree = degree;
				maxIndex = highestVertexes.get(i);
			}
		}
		
		return maxIndex;
	}
	
	private static void updateVertexSaturations() {
		ArrayList<Integer> adjacentColors = new ArrayList<Integer>();
		
		for(int i=0; i<m.size(); i++) {
			adjacentColors.clear();
			for(int j=0; j<m.size(); j++) {
				if(m.get(i).get(j) == 1) {
					if(!adjacentColors.contains(vertexColors.get(j)) && vertexColors.get(j) != 0) {
						adjacentColors.add(vertexColors.get(j));
					}
				}
			}
			
			vertexSaturations.set(i, adjacentColors.size());
		}
	}
	
	private static boolean vertexNotColored() {
		for (Integer i : vertexColors) {
			if(i == 0) return true;
		}
		
		return false;
	}
	
	private static void updateVertexOrderedByDegree() {
		@SuppressWarnings("unchecked")
		ArrayList<Integer> da = (ArrayList<Integer>) degreeArray.clone();
		
		for(int i=0;i<da.size(); i++) {
			int index = getIndexWithHighestValue(da);
			vertexOrderedByDegree.add(index);
			da.set(index, -1);
		}
	}
	
	private static void updateDegrees() {
		for(int i=0; i<m.size(); i++) {
			degreeArray.set(i, 0);
			for(int j=0; j<m.size(); j++) {
				if(m.get(i).get(j) == 1) {
					degreeArray.set(i, degreeArray.get(i)+1);
				}
			}
		}
	}
	
	private static int getIndexWithHighestValue(ArrayList<Integer> m) {
		int maxValue = -1;
		int maxIndex = -1;
		
		for(int i=0; i<m.size(); i++) {
			if(m.get(i) > maxValue) {
				maxValue = m.get(i);
				maxIndex = i;
			}
		}
		
		return maxIndex;
	}
}
