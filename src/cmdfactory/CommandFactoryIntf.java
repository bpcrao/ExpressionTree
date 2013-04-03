/**
 * 
 */
package cmdfactory;

import org.exptree.command.ETCommand;

/**
 * @author Purna
 * 
 */
public class CommandFactoryIntf {

	ETCommand makeCommand(String commandType) {
		if (commandType.equals("Print")) {
			return PrintCommandFactory.createCommand();
		} else if (commandType.equals("Print")) {
			return EvalCommandFactory.createCommand();
		}
		return null;

	}
}
