/**
 * 
 */
package org.exptree.interpreter;

import java.util.List;

import org.exptree.ds.CompositeNode;
import org.exptree.ds.INode;

/**
 * @author Purna
 * 
 */
public class NonTerminalExpression extends Expression {

	Expression left;
	Expression right;
	private CompositeNode cNode;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.exptree.interpreter.Expression#interpret(org.exptree.interpreter.
	 * Context)
	 */
	@Override
	public void interpret(Context ctx) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.exptree.interpreter.Expression#build()
	 */
	@Override
	public INode build() {
		 cNode= new CompositeNode(left.build(),right.build());		
		return cNode;
	}
}
