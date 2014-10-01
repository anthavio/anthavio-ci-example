package net.anthavio.example;

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
