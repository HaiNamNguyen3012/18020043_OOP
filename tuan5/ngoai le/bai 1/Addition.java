public class Addition extends BinaryExpression {
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        if (left instanceof Numeral && right instanceof Numeral)
            return left + " + " + right;
        else
            return "(" + left + " + " + right + ")";

    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
