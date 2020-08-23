public class ExpressionTest {
    public static void main(String[] args) {
        Expression expression1 = new Numeral(10);
        Expression expression2 = new Numeral(1);
        Expression expression3 = new Numeral(2);
        Expression expression4 = new Numeral(3);

        Expression e1 = new Square(expression1);
        Expression e2 = new Subtraction(e1, expression2);
        Expression e3 = new Multiplication(expression3, expression4);
        Expression e4 = new Addition(e2, e3);
        Expression e5 = new Square(e4);
        Expression ex = new Addition(e1, new Division(new Numeral(2), new Numeral(0)));

        System.out.println(ex.toString());
        System.out.println(ex.evaluate());
    }
}
