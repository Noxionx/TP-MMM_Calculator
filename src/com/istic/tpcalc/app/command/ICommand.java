 /**
 * Interface for design pattern command.
 * @author noxionx
 *
 */
package com.istic.tpcalc.app.command;


public  interface ICommand 
{

	/**
	 * Do the command code.
	 * @return Result
	 * @throws Exception
	 */
	public int execute() throws Exception;
	
	
}

