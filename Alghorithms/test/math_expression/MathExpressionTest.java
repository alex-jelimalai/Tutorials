package math_expression;

import org.junit.BeforeClass;
import org.junit.Test;

public class MathExpressionTest {
	
	private static MathExpression mathExpression;

	@BeforeClass
	public static void setUpClass(){
		mathExpression = new MathExpression();
	}
	
	
	@Test(expected = InvalidMathemeticalException.class)
	public void nullTest(){
		mathExpression.calculate(null);
	}
	
	@Test(expected = InvalidMathemeticalException.class)
	public void emptySymbol(){
		mathExpression.calculate("");
	}
	
	@Test(expected = InvalidMathemeticalException.class)
	public void invalidSymbol(){
		mathExpression.calculate("sd");
	}
	
}
