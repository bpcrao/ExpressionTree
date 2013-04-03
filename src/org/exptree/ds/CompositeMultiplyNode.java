/**
 * 
 */
package org.exptree.ds;

import org.exptree.ds.INode;

/**
 * @author Purna
 * 
 */
public class CompositeMultiplyNode extends CompositeNode {


	/**
	 * @param negative5
	 * @param node3add4
	 */
	public CompositeMultiplyNode(INode nodeA, INode nodeB) {
		this.left = nodeA;
		this.right = nodeB;
	}

}
