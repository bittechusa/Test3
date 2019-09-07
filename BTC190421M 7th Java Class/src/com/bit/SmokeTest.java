package com.bit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {
	
	/*
	 * Constructor is a special type of method which is used to construct an object 
	 * When we create an object of any class, Constructor gets executed
	 * Constructor name must be the class name 
	 * Constructor access modifier can be same or different 
	 * Constructor doesn't have any return type 
	 * default Constructor gets voided when we declare any constructor 
	 * Constructor changed value gets saved only to that reference 
	 * 
	 * How can we call any constructor to another class? 
	 * we can only call a constructor in to another class when we inherit
	 * By object creation it's not possible 
	 * constructor has to be called inside another Constructor 
	 */
	
	String userName;
	String pass;
	int a = 10;
	String b = "Book";
	
	ChromeDriver dr; 
	
	SmokeTest(String u, String p){
		userName = u;
		pass = p;
	}

	SmokeTest(ChromeDriver dr1) {
		dr = dr1;
	}
	
	void xp() {
		
	}
	
	
}
