package home;

import static java.lang.Math.sqrt;

public class Calculus {
    public Calculus() {
    }

    public Integer sum (Integer a, Integer b) {
        return a+b;
    }

    public Integer subtract( Integer a, Integer b){
        return a-b;
    }

    public Integer multiply (Integer a, Integer b) {
        return a*b;
    }

    public Integer divide (Integer a, Integer b) {
        return a/b;
    }

    public double divideFloat (Integer a, Integer b) {
        return Float.valueOf(a)/Float.valueOf(b);
    }

    public Integer modulo (Integer a, Integer b) {
        return a%b;
    }

    public double root(int x) {
        return sqrt(x);
    }
}
