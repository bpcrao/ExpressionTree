/**
 * 
 */
package org.exptree.state;

/**
 * @author Purna
 * 
 */
public class ETContext {

	ETState state = new UnintializedState();

	public void format(String input) {
		state.format(this, input);
	}

	public void maketree() {
		state.maketree(this);
	}

	public void print() {
		state.print(this);
	}

	public void eval() {
		state.eval(this);
	}

	/**
	 * @param state
	 */
	public void changeState(ETState state) {
		this.state=state;
		
	}
}
