package com.anthavio.example;

import static org.fest.assertions.api.Assertions.*;
import org.testng.annotations.Test;

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
		assertThat(hello).isEqualTo("Hello Dolly says Igor");
	}
}
