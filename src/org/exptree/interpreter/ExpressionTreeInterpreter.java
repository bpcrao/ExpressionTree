/**
 * 
 */
package org.exptree.interpreter;

import java.util.List;

import org.exptree.ds.ExpressionTree;

/**
 * @author Purna
 * 
 */
public class ExpressionTreeInterpreter {
	public List<Expression> parseTree;

	public void build() {
		for (Expression expr : parseTree) {
			expr.build();
		}
	}

	public ExpressionTree interpret(Context ctx, String expression) {
		return new ExpressionTree(parseTree.get(0).build());

	}
}
