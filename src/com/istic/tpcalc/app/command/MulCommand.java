/**
 * Design pattern command for Mul.
 * @author noxionx
 *
 */
package com.istic.tpcalc.app.command;

public class MulCommand implements ICommand
{
	private int parameter;
	private int parameter2;

	public MulCommand(int parameter, int parameter2){
		this.parameter = parameter;
		this.parameter2 = parameter2;
	}
	
	public int execute() {
		return parameter*parameter2;	
	}
	
}

