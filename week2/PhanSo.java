public class Fraction {

    private int numerator ;
    private int denominator ;

    // constructor
    public Fraction(){}
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        if(denominator == 0){
            denominator = 1;
        }
        if(denominator != 0){
            this.denominator = denominator;
            if(denominator < 0){
                this.denominator = -denominator;
                this.numerator = -numerator;
            }
        }
    }

    // setter / getter
    public int getNumerator(){
        return numerator;
    }
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setDenominator(int denominator){
        if(denominator != 0){
            this.denominator = denominator;
        }
    }

    // find gcd
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    // reduce function
    public Fraction reduce(){

        if(this.numerator < 0 )
            this.numerator = -this.numerator;
        if(this.denominator < 0 )
            this.denominator = -this.denominator;

        int gcd_ = gcd(this.numerator,this.denominator);

        this.numerator = this.numerator / gcd_;
        this.denominator = this.denominator / gcd_;
        return this;
    }

    // add function
    public Fraction add(Fraction other){
        int numerator_ = this.numerator * other.getDenominator() + this.denominator * other.getNumerator();
        int denominator_ = this.denominator * other.getDenominator();

        int gcd_ = gcd(numerator_,denominator_);

        this.numerator = numerator_ / gcd_;
        this.denominator = denominator_ / gcd_;

        return this;
    }

    // subtract function
    public Fraction subtract(Fraction other){

        int numerator_ = this.numerator * other.getDenominator() - this.denominator * other.getNumerator();
        int denominator_ = this.denominator * other.getDenominator();

        int gcd_ = gcd(numerator_,denominator_);

        this.numerator = numerator_ / gcd_;
        this.denominator = denominator_ / gcd_;

        return this;
    }

    //  multiply function
    public Fraction multiply(Fraction other){
        int numerator_ = this.numerator * other.getNumerator();
        int denominator_ = this.denominator * other.getDenominator();

        int gcd_ = gcd(numerator_,denominator_);

        this.numerator = numerator_ / gcd_;
        this.denominator = denominator_ / gcd_;

        return this;
    }

    // divide function
    public  Fraction divide(Fraction other){
        int numerator_ = this.numerator * other.getDenominator();
        int denominator_ = this.denominator * other.getNumerator();

        int gcd_ = gcd(numerator_,denominator_);

        this.numerator = numerator_ / gcd_;
        this.denominator = denominator_ / gcd_;

        return this;
    }

    // equals function
    public boolean equals(Object obj){
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            int numerator1_ = this.numerator * other.getDenominator();
            int numerator2_ = other.getNumerator() * this.denominator;

            if(numerator1_ == numerator2_)
                return true;
        }
        return false;
    }
    public static void main(String[] args){

    }
}
