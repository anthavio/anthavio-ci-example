package net.anthavio.example;

import net.anthavio.aspect.Logged;

/**
 * 
 * @author martin.vanek
 *
 */
public class Example {

	private String name;

	/**
	 * @param name Who is going to greet
	 */
	public Example(String name) {
		this.name = name;
	}

	/**
	 * @param who someone to greet
	 * @return Greeting
	 */
	@Logged
	public String hello(String who) {
		return "Hello " + who + " says " + name;
	}
}
