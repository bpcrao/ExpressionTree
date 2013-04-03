/**
 * 
 */
package org.exptree.interpreter;

import org.exptree.ds.INode;

/**
 * @author Purna
 * 
 */
public abstract class Expression {

	public abstract void interpret(Context ctx);

	/**
	 * 
	 */
	public abstract INode build();
}
