/**
 * 
 */
package org.exptree.ds;

import org.exptree.visitor.ETVisitor;

/**
 * @author Purna
 * 
 */
public class CompositeNode extends INode {

	public INode left;
	public INode right;
	public ETVisitor visitor;

	/**
	 * 
	 */
	public CompositeNode() {

	}

	/**
	 * @param left
	 * @param right
	 */
	public CompositeNode(INode left, INode right) {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.exptree.ds.INode#accept(org.exptree.visitor.ETVisitor)
	 */
	@Override
	public void accept(ETVisitor visitor) {
		this.visitor=visitor;
		visitor.visit(this);
	}

}
