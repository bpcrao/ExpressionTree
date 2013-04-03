/**
 * 
 */
package cmdfactory;

import org.exptree.command.ETCommand;
import org.exptree.command.EvalCommand;

/**
 * @author Purna
 *
 */
public class EvalCommandFactory extends CommandFactoryIntf  {

	EvalCommand eCommand;
	/**
	 * @return
	 */
	public static ETCommand createCommand() {
		// TODO Auto-generated method stub
		return new EvalCommand();
	}

}
