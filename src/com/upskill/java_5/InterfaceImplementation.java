package com.upskill.java_5;

public class InterfaceImplementation implements Interface{



	@Override
	public void iDoor() {
		System.out.println("4 Door");
	}

	@Override
	public int iWheel() {
		return 4;
	}

	@Override
	public String iEngine() {
		return "2 litr";
	}

	@Override
	public void iSeat() {
		System.out.println("4 seat");
		
	}

}
