package com.sudip.mircoservices.ccuexcservice.adapterdesign;

public class School {

	public static void main(String[] args) {
		
		Pen pen = new PilotPenAdapter();
		AssignementWork assign = new AssignementWork();
		assign.setPen(pen);
		assign.writeAssignemnt("Sudip is writing his assignemnt");
		
	}

}
