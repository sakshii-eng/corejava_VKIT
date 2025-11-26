package com.tnsif.exceptionhandlingprogram;
//without matching catch block
public class Test3 {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(ArrayIndexOutOfBoundsException e) {   //can't run bcz we mentioned array
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("hello world");
		}
		System.out.println("java code");
	}

}
