/**
 * 
 */
package org.exptree.ds;

import org.exptree.iterators.ETIterator;
import org.exptree.iterators.LevelOrderIterator;

/**
 * @author Purna
 *
 */
public class ExpressionTree implements IExpressionTree {

	INode rootNode;
	ETIterator etIterator;
	/**
	 * @param build
	 */
	public ExpressionTree(INode build) {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.exptree.ds.IExpressionTree#left()
	 */
	@Override
	public IExpressionTree left() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.exptree.ds.IExpressionTree#right()
	 */
	@Override
	public IExpressionTree right() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return
	 */
	public ETIterator getIterator() {
		// TODO Auto-generated method stub
		return new LevelOrderIterator();
	}

}
