package de.ws1617.pccl.search;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.ws1617.pccl.fsa.Edge;
import de.ws1617.pccl.grammar.Terminal;

public class Graph {

	private ArrayList<HashSet<Edge>> adj;
	
	private boolean[] finalStates;
	
	/**
	 * Initialize the adjacency and final state array.
	 * 
	 * @param v
	 *            the number of vertices in the graph.
	 */
	public Graph(int v) {
		
		ArrayList<HashSet> adj = new ArrayList<HashSet>();
		boolean[] finalStates = new boolean[v];
		
	}

	/**
	 * Add the edge to the ArrayList.
	 * @param from - current node of the ArrayList
	 * @param edge - new node which will be added to the current node
	 */
	public void addEdge(int from, Edge edge) {
		
		HashSet<Edge> hs = adj.get(from);
		hs.add(edge);
		
	}

	public HashSet<Edge> getAdjacent(int from) {

		return adj.get(from);
	}

	/**
	 * Returns all edges that point from a certain state to adjacent states and can be reached when consuming the given {@link Terminal}.
	 * 
	 * @param from the current state.
	 * @param toConsume the next terminal to consume.
	 * @return a set of edges adjacent to the from state reachable via the terminal toConsume.
	 */
	public HashSet<Edge> getAdjacent(int from, Terminal toConsume) {
	
		HashSet<Edge> result = new HashSet<>();
		
		for(Edge e : adj.get(from)){
			
			if(e.getToConsume().getValue().equals(toConsume)){
				result.add(e);
			}
			
		}
		return result;
	}

	/**
	 * Make a certain state at the given index a final state.
	 * @param index 
	 */
	public void setFinalState(int index) {
		// TODO implement me !
	}

	/**
	 * Checks whether the state at the given index is a final state.
	 * @param index
	 * @return
	 */
	public boolean isFinalState(int index) {
		// TODO implement me !
		return false;
	}
}