/**
 * 
 */
package org.exptree.state;

/**
 * @author Purna
 * 
 */
public interface ETState {

	public void format(ETContext ctx, String input);

	public void maketree(ETContext ctx);

	public void print(ETContext ctx);

	public void eval(ETContext ctx);
}
