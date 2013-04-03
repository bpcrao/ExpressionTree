/**
 * 
 */
package org.exptree.ds;

import org.exptree.visitor.ETVisitor;

/**
 * @author Purna
 * 
 */
public abstract class INode {

	public abstract void accept(ETVisitor visitor);

}
