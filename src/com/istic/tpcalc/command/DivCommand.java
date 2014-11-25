package com.istic.tpcalc.command;


public class DivCommand implements ICommand
{
	private int parameter;
	private int parameter2;
	public DivCommand(int parameter, int parameter2){
		this.parameter = parameter;
		this.parameter2 = parameter2;
	}

	
	public int execute() throws Exception {
		if(parameter2==0){
			throw new Exception("Division par 0 impossible");
		}
		return parameter/parameter2;
	}
	
}

