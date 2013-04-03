/**
 * 
 */
package org.exptree.ds;

import org.exptree.ds.INode;

/**
 * @author Purna
 * 
 */
public class CompositeAddNode extends CompositeNode {

	/**
	 * @param nodeA
	 * @param nodeB
	 */
	public CompositeAddNode(INode nodeA, INode nodeB) {
		this.left = nodeA;
		this.right = nodeB;
	}

}
