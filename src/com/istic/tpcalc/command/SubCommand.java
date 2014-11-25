package com.istic.tpcalc.command;

public class SubCommand implements ICommand
{
	private int parameter;
	private int parameter2;
	public SubCommand(int parameter, int parameter2){
		this.parameter = parameter;
		this.parameter2 = parameter2;
	}

	
	public int execute() {
		return parameter-parameter2;
	}
	
}

