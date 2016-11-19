package de.ws1617.pccl.search;

/**
 * @author mihai
 * 
 * Hypothesis keeps track of the position in the input and the current states.
 */
public class Hypothesis {

	private int state;
	private int inputIndex;

	//Initialize parameters.
	public Hypothesis(int state, int inputIndex) {

		this.state = state;
		this.inputIndex = inputIndex;
	}

	//Create getter and setter methods for both parameters.
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getInputIndex() {
		return inputIndex;
	}

	public void setInputIndex(int inputIndex) {
		this.inputIndex = inputIndex;
	}

}
