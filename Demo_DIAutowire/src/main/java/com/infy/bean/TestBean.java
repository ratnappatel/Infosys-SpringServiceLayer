package com.infy.bean;

import org.springframework.stereotype.Component;

@Component(value = "testBean") // ID-Card
// TestBean testBean=new TestBean();
public class TestBean {
	public TestBean() {
		System.out.println("Test Bean is Instantiated.....");
	}
	
	public void squareIt(int no)
	{
		int square=no*no;
		System.out.println("The Square of Given No : "+square);
	}

}
