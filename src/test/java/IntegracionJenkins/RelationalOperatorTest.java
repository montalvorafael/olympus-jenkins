package IntegracionJenkins;

import static org.junit.Assert.*;
import org.junit.Test;

public class RelationalOperatorTest {

  // isGreater tests
	@Test
	public void isGreaterTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isGreater(2, 3));
	}

	@Test
	public void isGreaterTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.isGreater(2, 1));
	}

	@Test
	public void isGreaterTest3() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isGreater(2, 2));
	}

  // isLess tests
	@Test
	public void isLessTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isLess(4, 4));
	}

	@Test
	public void isLessTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isLess(5, 1));
	}

	@Test
	public void isLessTest3() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.isLess(5, 6));
	}

  // goodWidth tests
	@Test
	public void googWidthTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.goodWidth(1, 2, 4));
	}

	@Test
	public void googWidthTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.goodWidth(3, 2, 4));
	}

	@Test
	public void googWidthTest3() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.goodWidth(5, 2, 4));
	}

  // goodHeight tests
	@Test
	public void goodHeightTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.goodHeight(1, 2, 4));
	}

	@Test
	public void goodHeightTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.goodHeight(3, 2, 4));
	}

	@Test
	public void goodHeightTest3() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.goodHeight(5, 2, 4));
	}

}
