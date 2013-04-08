package math_expression;

public class MathExpression {

	private static final String EMPTY_OR_NULL_EXPRESSION_MESSAGE = "The mathematical expression should not be empty or null";

	public double calculate(final String aExpression) {
		validateExpression(aExpression);
		return 0;
	}

	private void validateExpression(final String aExpression) {
		validateNull(aExpression);
		validateInvalidSymbol(aExpression);
	}

	private void validateInvalidSymbol(final String aExpression) {
		if (!aExpression.replaceAll("\\d", "").replaceAll("\\(", "")
				.replaceAll("\\)", "").replaceAll("/", "")
				.replaceAll("\\*", "").replaceAll("-", "")
				.replaceAll("\\+", "").isEmpty()) {
			throw new InvalidMathematicalException(
					"The mathatical expression contains invalid symbols");
		}
	}

	private void validateNull(final String aExpression) {
		if (aExpression == null || aExpression.isEmpty()) {
			throw new InvalidMathematicalException(
					EMPTY_OR_NULL_EXPRESSION_MESSAGE);
		}
	}

}
