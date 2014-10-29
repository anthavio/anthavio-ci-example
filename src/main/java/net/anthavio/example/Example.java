/**
 * This file is part of anthavio-ci-example.
 *
 * anthavio-ci-example is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * anthavio-ci-example is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with anthavio-ci-example.  If not, see <http://www.gnu.org/licenses/>.
 */
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
