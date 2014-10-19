package net.anthavio.example;

/*
 * #%L
 * anthavio-ci-example
 * %%
 * Copyright (C) 2013 - 2014 Anthavio
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * 
 * @author martin.vanek
 *
 */
public class ExampleTest {

	@Test
	public void testHello() {
		Example example = new Example("Igor");
		String hello = example.hello("Dolly");
		Assertions.assertThat(hello).isEqualTo("Hello Dolly says Igor");
	}
}
