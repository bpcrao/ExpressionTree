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
public abstract class ETVisitor {

	public abstract void visit(LeafNode node);

	public abstract void visit(CompositeNode node);

//	public abstract void visit(CompositeNegativeNode node);
//
//	public abstract void visit(CompositeMultiplyNode node);
//
//	public abstract void visit(CompositeAddNode node);
}
