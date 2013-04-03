/**
 * 
 */
package org.exptree.client;

import org.exptree.ds.CompositeAddNode;
import org.exptree.ds.CompositeMultiplyNode;
import org.exptree.ds.CompositeNegativeNode;
import org.exptree.ds.INode;
import org.exptree.ds.LeafNode;

/**
 * @author Purna
 * 
 */
public class DriverComposite {

	/**
	 * 
	 */
	public DriverComposite() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		INode node = new LeafNode(5);
		INode node3 = new LeafNode(3);
		INode node2 = new LeafNode(4);
		INode negative5 = new CompositeNegativeNode(node);
		INode Node3add4 = new CompositeAddNode(node3, node2);
		INode compositeMulNode = new CompositeMultiplyNode(negative5, Node3add4);

	}

}
