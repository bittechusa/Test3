package com.bit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Execution {
	
	//Abc , 123
	//new ChromeDriver();
	
	
	public static void main(String[] args) {
		SmokeTest x = new SmokeTest("Abc", "123");
		SmokeTest x1 = new SmokeTest("XYZ", "456");
		
		System.out.println(x1.userName);
		System.out.println(x1.pass);
		System.out.println(x.userName);
		System.out.println(x.pass);
		
		SmokeTest x2 = new SmokeTest(new ChromeDriver());
		x2.dr.findElement(By.id(""));
		
		x.dr.findElement(By.id("")); //thgis line will give error as value of dr is null
		
		CartPage c = new CartPage();
		
		//some built in constructor 
		FirefoxDriver dr = new FirefoxDriver();//it will open a blank browser 
		//FirefoxProfile dr2 = new FirefoxProfile(profileDir)  //it will allow the the user to insert profile/extensions when selenium open the browser 
		
		
	}

	
	void ps() {
		//SmokeTest s = new SmokeTest();
		SmokeTest d;
		
		
	}

}
