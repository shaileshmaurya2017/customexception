package com.customexception;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("In main");
		
		try {
			
			throw new MyException("myexception occured");
		}
		catch(MyException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
