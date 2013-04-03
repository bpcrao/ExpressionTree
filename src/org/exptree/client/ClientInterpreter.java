/**
 * 
 */
package org.exptree.client;

import org.exptree.interpreter.Context;
import org.exptree.interpreter.Expression;
import org.exptree.interpreter.NonTerminalExpression;

/**
 * @author Purna
 * 
 */
public class ClientInterpreter {

	static Context ctx;
	private static Expression exp;

	public static void main(String[] args) {
		ctx = new Context();
		exp = new NonTerminalExpression();
	}
}
