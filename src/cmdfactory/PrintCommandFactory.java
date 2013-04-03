/**
 * 
 */
package cmdfactory;

import org.exptree.command.ETCommand;
import org.exptree.command.PrintCommand;

/**
 * @author Purna
 * 
 */
public class PrintCommandFactory extends CommandFactoryIntf {
	static PrintCommand pc;

	/**
	 * @return
	 */
	public static ETCommand createCommand() {
		// TODO Auto-generated method stub
		return pc;
	}

}
