package de.ws1617.pccl.search;

import java.util.ArrayList;
import java.util.HashSet;


import de.ws1617.pccl.fsa.Edge;
import de.ws1617.pccl.grammar.Terminal;

public class Graph {

	//adjacency list
	private ArrayList<HashSet<Edge>> adj;
	
	private boolean[] finalStates;
	
	/**
	 * Initialize the adjacency and final state array.
	 * 
	 * @param v - the number of vertices in the graph.
	 */
	public Graph(int v) {
		
		//set the capacity
		adj = new ArrayList<HashSet<Edge>>(v);
		
		//set the size
		for(int i = 0; i < v; i++){
			
			adj.add(new HashSet<Edge>());
			
		}
		
		
		finalStates = new boolean[v];
		for(int i = 0; i < finalStates.length; i++){
			
			//reverse procedure of the exercise, but it works the same
			finalStates[i] = true;
			
		}
	}

	/**
	 * Add the edge to the ArrayList.
	 * @param from - current node of the ArrayList
	 * @param edge - new node which will be added to the current node
	 */
	public void addEdge(int from, Edge edge) {
		
		adj.get(from).add(edge);
		
	}

	public HashSet<Edge> getAdjacent(int from) {

		return adj.get(from);
	}

	/**
	 * Returns all edges that point from a certain state to adjacent states and can be reached when consuming the given {@link Terminal}.
	 * 
	 * @param from -  the current state.
	 * @param toConsume -  the next terminal to consume.
	 * @return - a set of edges adjacent to the from state reachable via the terminal toConsume.
	 */
	public HashSet<Edge> getAdjacent(int from, Terminal toConsume) {
	
		HashSet<Edge> result = new HashSet<>();
		
		for(Edge e : adj.get(from)){
			

			if(e.getToConsume().equals(toConsume)){
				
				result.add(e);
			}
			
		}
		return result;
	}

	/**
	 * Make a certain state at the given index a final state.
	 * @param index -  is the corresponding state we want to set to final
	 */
	public void setFinalState(int index) {
		
		finalStates[index] = false;
	}

	/**
	 * Checks whether the state at the given index is a final state.
	 * @param index -  is the corresponding state we want to check
	 * @return - returns true/false depending on whether the 
	 * 			corresponding state is final or not
	 */
	public boolean isFinalState(int index) {
		
		return finalStates[index];
	}
}