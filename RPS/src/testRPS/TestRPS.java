package testRPS;

import static org.junit.Assert.*;

import org.junit.Test;

import rps.RPS;

public class TestRPS 
{
	@Test
	public void playerVictoryCheck1()
	{
		assertEquals("Fail, Rock should beat Scissors", RPS.checkResults(1, 3), 1);
	}
	
	@Test
	public void playerVictoryCheck2()
	{
		assertEquals("Fail, Rock should beat Scissors", RPS.checkResults(2, 1), 1);
	}
	
	@Test
	public void playerVictoryCheck3()
	{
		assertEquals("Fail, Rock should beat Scissors", RPS.checkResults(3, 2), 1);
	}
	
	@Test
	public void computerVictoryCheck()
	{
		assertEquals("Fail, Paper should beat Rock", RPS.checkResults(1,2), 2);
	}
	
	@Test
	public void tieCheck1()
	{
		assertEquals("Fail, Rock should tie with Rock", RPS.checkResults(1,1), 0);
	}
	
	@Test
	public void tieCheck2()
	{
		assertEquals("Fail, Rock should tie with Rock", RPS.checkResults(2,2), 0);
	}
	
	@Test
	public void tieCheck3()
	{
		assertEquals("Fail, Rock should tie with Rock", RPS.checkResults(3,3), 0);
	}
}


