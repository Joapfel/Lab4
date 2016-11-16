package de.ws1617.pccl.search;

public class Hypothesis {

	private int state;
	private int inputIndex;

	public Hypothesis(int state, int inputIndex) {

		this.state = state;
		this.inputIndex = inputIndex;
	}

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
