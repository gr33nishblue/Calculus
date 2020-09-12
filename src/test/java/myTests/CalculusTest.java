package myTests;

import home.Calculus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculusTest {

    public static Integer a = 1;
    public static Integer b = -1;
    public static Integer c = 10;
    public static Integer d = -10;
    public static Integer e = -9;
    public static Integer f = 11;

    @Test
    public void sumTest1() {
        Calculus calculus = new Calculus();
        assertEquals(calculus.sum(a, 0), a);// 1+0=1
    }

    @Test
    public void sumTest2() {
        Calculus calculus = new Calculus();
        assertEquals(calculus.sum(b, 0), b);// -1+0=-1
    }

    @Test
    public void sumTest3() {
        Calculus calculus = new Calculus();
        assertEquals(calculus.sum(a, b), a+b);// 1+(-1)=0
    }

    @Test
    public void sumTest4() {
        Calculus calculus = new Calculus();
        assertEquals(calculus.sum(a, c), a+c);// 1+10=11
    }

    @Test
    public void sumTest5() {
        Calculus calculus = new Calculus();
        assertEquals(calculus.sum(b, d), b+d);// -1+(-10)=-11
    }

    @Test
    public void sumTest6() {
        Calculus calculus = new Calculus();
        assertEquals(calculus.sum(c, e), c+e);// 10+(-9)=-1
    }

    @Test
    public void sumTest7() {
        Calculus calculus = new Calculus();
        assertEquals(calculus.sum(d, f), d+f);// -10+11=1
    }

    @Test
    public void subtractTest1() {
        Calculus calculus = new Calculus();
        assertEquals(calculus.subtract(12, 17), -5);
    }

    @Test
    public void subtractTest2() {
        Calculus calculus = new Calculus();
        assertEquals(calculus.subtract(a, b), a-b);
    }

    @Test
    public void multiplyTest1() {
        Calculus calculus = new Calculus();
        assertEquals(calculus.multiply(12, 17), 204);
    }

    @Test
    public void multiplyTest2() {
        Calculus calculus = new Calculus();
        assertEquals(calculus.multiply(a, b), a*b);
    }

    @Test
    public void divideTest() {
        Calculus calculus = new Calculus();
        double variable = 2.5;
        assertEquals(variable,calculus.divideFloat(5, 2));
    }

    @Test
    public void moduloTest() {
        Calculus calculus = new Calculus();
        assertEquals(1,calculus.modulo(5, 2));
    }

    @Test
    public void squareRootTest() {
        Calculus calculus = new Calculus();
        assertEquals(4,calculus.root(25));
    }
}
