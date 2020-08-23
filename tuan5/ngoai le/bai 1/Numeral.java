public class Numeral extends Expression {
    private double value;
    public Numeral() {
        this.value = 1;
    }

    public Numeral(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString((int) value);
    }

    @Override
    public double evaluate() {
        return value;
    }
}
