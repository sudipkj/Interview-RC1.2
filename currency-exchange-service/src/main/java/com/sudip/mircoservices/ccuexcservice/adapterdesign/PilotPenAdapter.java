package com.sudip.mircoservices.ccuexcservice.adapterdesign;

public class PilotPenAdapter implements Pen{

	PilotPen pen = new PilotPen();
	@Override
	public void write(String assingment) {
		pen.printAssignment(assingment);
		
	}

}
