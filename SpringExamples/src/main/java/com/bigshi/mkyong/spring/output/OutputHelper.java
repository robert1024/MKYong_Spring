package com.bigshi.mkyong.spring.output;

/**
 * @author robert1024
 * Setter injection & Constructor injection.
 */
public class OutputHelper {
	IOutputGenerator outputGenerator;
	
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
	
	
	//setter
	public void setOutputGenerator(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}

	public OutputHelper(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
	
}
