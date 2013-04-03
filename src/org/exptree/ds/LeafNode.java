/**
 * 
 */
package org.exptree.ds;

import org.exptree.visitor.ETVisitor;

/**
 * @author Purna
 * 
 */
public class LeafNode extends INode {

	private int data;


	/**
	 * @param operand
	 */
	public LeafNode(int operand) {
		this.data = operand;
	}


	/* (non-Javadoc)
	 * @see org.exptree.ds.INode#accept(org.exptree.visitor.ETVisitor)
	 */
	@Override
	public void accept(ETVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
