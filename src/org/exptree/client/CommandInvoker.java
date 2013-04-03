/**
 * 
 */
package org.exptree.client;

import org.exptree.command.ETCommand;
import org.exptree.command.PrintCommand;

/**
 * @author Purna
 *
 */
public class CommandInvoker {

	private static ETCommand printCommand;

	public static void main(String[] args) {
		printCommand = new PrintCommand();
		printCommand.execute();
	}
}
