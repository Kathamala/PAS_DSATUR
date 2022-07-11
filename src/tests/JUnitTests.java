package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import DSATUR.Dsatur;

public class JUnitTests {

	@Test
	public void nullGraph() {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList());
		
		assertEquals(result, Dsatur.graphColoring(matrix));
	} 
	
	
	@Test
	public void trivialGraph() {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		matrix.add(new ArrayList<Integer>(Arrays.asList(0)));
		
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1));
		
		assertEquals(result, Dsatur.graphColoring(matrix));
	}
	
	@Test
	public void emptyGraph() {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0)));
		
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1));
		
		assertEquals(result, Dsatur.graphColoring(matrix));
	}
	
	@Test
	public void emptyGraphII() {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
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
		
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
		
		assertEquals(result, Dsatur.graphColoring(matrix));
	}
	
	@Test
	public void completeGraph() {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0)));
		
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		
		assertEquals(result, Dsatur.graphColoring(matrix));
	}
	
	@Test
	public void completeGraphII() {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 1, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 0)));
		
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		
		assertEquals(result, Dsatur.graphColoring(matrix));
	}
	
	@Test
	public void linearGraph() {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 1, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0)));
		
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 1, 2));
		
		assertEquals(result, Dsatur.graphColoring(matrix));
	}
	
	@Test
	public void linearGraphII() {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
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
		
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 1, 2, 1, 2, 1, 2, 1));
		
		assertEquals(result, Dsatur.graphColoring(matrix));
	}
	
	@Test
	public void exampleGraphI() {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 0)));
		
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(4, 1, 4, 2, 3));
		
		assertEquals(result, Dsatur.graphColoring(matrix));
	}
	
	@Test
	public void exampleGraphII() {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 1, 1, 1, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 1, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 0, 1, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 0, 0, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0)));
		
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 4, 1));
		
		assertEquals(result, Dsatur.graphColoring(matrix));
	}
	
	@Test
	public void randomTest1() {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 0, 1, 1, 1, 1, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 0, 0, 0, 1, 0, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 1, 1, 0, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 0, 0, 0, 1, 0, 0, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 1, 1, 0, 1, 1, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1, 0, 1, 0, 0, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 0, 0, 1, 0, 0, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 1, 0, 0, 0, 0, 0, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 1, 0, 1, 1, 0, 0)));
		
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 1, 2, 3, 2, 4, 3, 3));
		
		assertEquals(result, Dsatur.graphColoring(matrix));
	}
	
	public void randomTest2() {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0)));
		matrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1)));
		
		matrix = DSATUR.Application.convertMatrix(matrix);
		
		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(6, 3, 2, 2, 1, 2, 5, 4, 3, 1, 1, 7, 5, 2, 7, 4, 3, 6, 7, 7, 5, 6, 5, 6, 3, 4, 6, 4, 7, 5));
		
		assertEquals(result, Dsatur.graphColoring(matrix));
	}
}









