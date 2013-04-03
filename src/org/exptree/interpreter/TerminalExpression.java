/**
 * 
 */
package org.exptree.interpreter;

import org.exptree.ds.INode;
import org.exptree.ds.LeafNode;

/**
 * @author Purna
 *
 */
public class TerminalExpression extends Expression {

	private LeafNode leafNode;

	/* (non-Javadoc)
	 * @see org.exptree.interpreter.Expression#interpret(org.exptree.interpreter.Context)
	 */
	@Override
	public void interpret(Context ctx) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.exptree.interpreter.Expression#build()
	 */
	@Override
	public INode build() {
		leafNode = new LeafNode(0);
		return leafNode;
	}

}
