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
