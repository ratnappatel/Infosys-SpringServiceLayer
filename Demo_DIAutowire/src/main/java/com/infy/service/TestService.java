package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infy.bean.TestBean;

@Component(value="testService")
// TestService testService=new TestService();
public class TestService {
	
	
	  @Autowired // Binding Peroperty based DI TestBean testBean;
	 private TestBean testBean;
	//Constructor Based Autowiring
	/*
	 * public TestService(@Autowired TestBean testBean) { testBean=testBean; }
	 */
	
	
	
	public void getSquare() {
		System.out.println("Test Service is Instantiated.....");
		testBean.squareIt(25);
	}
	/*
	 * public TestBean getTestBean() { return testBean; }
	 * 
	 * 
	 * 
	 * public void setTestBean(@Autowired TestBean testBean) { this.testBean =
	 * testBean; }
	 */
}
