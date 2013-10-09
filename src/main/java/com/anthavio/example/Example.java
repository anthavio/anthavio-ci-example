package com.anthavio.example;

/**
 * 
 * @author martin.vanek
 *
 */
public class Example {

	private String name;

	public Example(String name) {
		this.name = name;
	}

	public String hello(String who) {
		return "Hello " + who + " says " + name;
	}
}
