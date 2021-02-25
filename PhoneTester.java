package com.javaoop.phone;

public class PhoneTester {

	public static void main(String[] args) {
		IPhone iphone8 = new IPhone("8", , "bang", "random text goes here");
		
		
		iphone8.displayInfo();
		System.out.println(iphone8.unlock());
		System.out.println(iphone8.ring());

	}

}