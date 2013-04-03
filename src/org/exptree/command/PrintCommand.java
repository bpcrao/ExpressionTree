/**
 * 
 */
package org.exptree.command;

import org.exptree.ds.CompositeNode;
import org.exptree.ds.ExpressionTree;
import org.exptree.iterators.ETIterator;
import org.exptree.visitor.ETVisitor;
import org.exptree.visitor.PrintVisitor;

/**
 * @author Purna
 * 
 */
public class PrintCommand implements ETCommand {
	ExpressionTree et = new ExpressionTree(null);
	private ETIterator iterator;
	private ETVisitor visitor;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.exptree.command.ETCommand#execute()
	 */
	@Override
	public boolean execute() {
		iterator = et.getIterator();
		while (iterator.hasNext()) {
			CompositeNode node = (CompositeNode) iterator.next();
			visitor = new PrintVisitor();
			node.accept(visitor);
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.exptree.command.ETCommand#unexecute()
	 */
	@Override
	public boolean unexecute() {
		// TODO Auto-generated method stub
		return false;
	}

}
