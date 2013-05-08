package com.bigshi.mkyong.spring;

public class OutputHelper {

	IOutputGenerator outputGenerator;
	
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
	
	public void setOutputGenerator(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
	
}
