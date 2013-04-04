/**
 * 
 */
package org.exptree.state;

/**
 * @author Purna
 *
 */
public class InitializedState implements ETState {

	/* (non-Javadoc)
	 * @see org.exptree.state.ETState#format(org.exptree.state.ETContext, java.lang.String)
	 */
	@Override
	public void format(ETContext ctx, String input) {
		ctx.changeState(new UnintializedState());
		
	}

	/* (non-Javadoc)
	 * @see org.exptree.state.ETState#maketree(org.exptree.state.ETContext)
	 */
	@Override
	public void maketree(ETContext ctx) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.exptree.state.ETState#print(org.exptree.state.ETContext)
	 */
	@Override
	public void print(ETContext ctx) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.exptree.state.ETState#eval(org.exptree.state.ETContext)
	 */
	@Override
	public void eval(ETContext ctx) {
		// TODO Auto-generated method stub
		
	}

}
