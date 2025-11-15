package com.tnsif.finalkeyworddemo;
//demo for final keyword
//variable
//method
//class
public class Finaldemo {
    final static int a;  // u cant change value
	
	static {
		a=9;
	}
	void display() { // cant override
		System.out.println("welcome to java");
	}

}
