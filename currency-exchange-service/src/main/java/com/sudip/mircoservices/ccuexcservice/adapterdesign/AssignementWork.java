package com.sudip.mircoservices.ccuexcservice.adapterdesign;

public class AssignementWork {
	
	Pen pen;
	
	public void writeAssignemnt(String str) {
		pen.write(str);;
	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}
}
