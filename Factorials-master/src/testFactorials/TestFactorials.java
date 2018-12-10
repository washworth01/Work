package testFactorials;

import static org.junit.Assert.*;
import org.junit.Test;

import factorials.Factorials;

public class TestFactorials {
	
	@Test
    public void FactorialsTrue1() {
		assertEquals("Should return true since !4=24", Factorials.returnFactorial(24), "!4");

    }

	@Test
    public void FactorialsFalse1() {
		assertEquals("Should return false since 80 is not a factorial", Factorials.returnFactorial(80), "NONE");

    }
	
	@Test
    public void FactorialsTrue2() {
		assertEquals("Should return true since !2=2", Factorials.returnFactorial(2), "!2");

    }
	
	@Test
    public void FactorialsFalse2() {
		assertEquals("Should return false since 166 is not a factorial", Factorials.returnFactorial(166), "NONE");

    }
	
	@Test
    public void FactorialsTrue3() {
		assertEquals("Should return true since !6=720", Factorials.returnFactorial(720), "!6");

    }
	
	@Test
    public void FactorialsFalse3() {
		assertEquals("Should return false since 0 is not a factorial", Factorials.returnFactorial(0), "NONE");

    }
	
	@Test
    public void FactorialsTrue4() {
		assertEquals("Should return true since !12=479001600", Factorials.returnFactorial(479001600), "!12");

    }
	
	@Test
    public void FactorialsChallenge1() {
		assertEquals("Should return true since !10=3628800", Factorials.returnFactorial(3628800), "!10");

    }
	@Test
    public void FactorialsChallenge2() {
		assertEquals("Should return true since !3=6", Factorials.returnFactorial(6), "!3");

    }
	@Test
    public void FactorialsChallenge3() {
		assertEquals("Should return false since 0 is not a factorial", Factorials.returnFactorial(18), "NONE");

    }
	@Test
    public void FactorialsChallenge4() {
		assertEquals("Should return false since -1337 is negative", Factorials.returnFactorial(-1337), "NONE");

    }
	@Test
    public void FactorialsChallenge5() {
		assertEquals("Should return true since !1=1", Factorials.returnFactorial(1), "!1");

    }
}
