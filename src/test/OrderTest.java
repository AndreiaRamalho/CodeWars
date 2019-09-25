package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;
import codeWars.Order;

public class OrderTest {

	@Test
	public void test1() {
		assertThat(Order.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
	}

	@Test
	public void test1_1() {
		assertThat(Order.orderOtherSolution("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
	}

	@Test
	public void test1_2() {
		assertThat(Order.orderOtherSolution2("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
	}

	@Test
	public void test1_3() {
		assertThat(Order.orderOtherSolution3("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
	}

	@Test
	public void test2() {
		assertThat(Order.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
	}

	@Test
	public void test2_1() {
		assertThat(Order.orderOtherSolution("4of Fo1r pe6ople g3ood th5e the2"),
				equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
	}

	@Test
	public void test2_2() {
		assertThat(Order.orderOtherSolution2("4of Fo1r pe6ople g3ood th5e the2"),
				equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
	}

	@Test
	public void test2_3() {
		assertThat(Order.orderOtherSolution3("4of Fo1r pe6ople g3ood th5e the2"),
				equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
	}

	@Test
	public void test3() {
		assertThat("Empty input should return empty string", Order.order(""), equalTo(""));
	}

	@Test
	public void test3_1() {
		assertThat("Empty input should return empty string", Order.orderOtherSolution(""), equalTo(""));
	}

	@Test
	public void test3_2() {
		assertThat("Empty input should return empty string", Order.orderOtherSolution2(""), equalTo(""));
	}

	@Test
	public void test3_3() {
		assertThat("Empty input should return empty string", Order.orderOtherSolution3(""), equalTo(""));
	}

}
