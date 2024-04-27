package com.abc1.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class A {

	
	

	@Autowired
	public B b;
	
	public void m1()
	{
		System.out.println(" test for m1");
	   // b.m2();
	}
}
