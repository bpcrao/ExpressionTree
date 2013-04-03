/**
 * 
 */
package org.exptree.visitor;

import org.exptree.ds.CompositeNode;
import org.exptree.ds.LeafNode;

/**
 * @author Purna
 * 
 */
public class PrintVisitor extends ETVisitor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.exptree.visitor.ETVisitor#visit(org.exptree.ds.LeafNode)
	 */
	@Override
	public void visit(LeafNode node) {
		System.out.println(node.toString());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.exptree.visitor.ETVisitor#visit(org.exptree.ds.CompositeNode)
	 */
	@Override
	public void visit(CompositeNode node) {
		System.out.println(node.toString());

	}

	// /* (non-Javadoc)
	// * @see
	// org.exptree.visitor.ETVisitor#visit(org.exptree.ds.CompositeNegativeNode)
	// */
	// @Override
	// public void visit(CompositeNegativeNode node) {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// /* (non-Javadoc)
	// * @see
	// org.exptree.visitor.ETVisitor#visit(org.exptree.ds.CompositeMultiplyNode)
	// */
	// @Override
	// public void visit(CompositeMultiplyNode node) {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// /* (non-Javadoc)
	// * @see
	// org.exptree.visitor.ETVisitor#visit(org.exptree.ds.CompositeAddNode)
	// */
	// @Override
	// public void visit(CompositeAddNode node) {
	// // TODO Auto-generated method stub
	//
	// }

}
