package blackjackTest;

import static org.junit.Assert.*;

import org.junit.Test;

import blackjack.BlackJack;

public class BlackjackTest
{
	@Test
	public void returnHighestNumber()
	{
		assertEquals("The second number is not returned",BlackJack.closestTo21(23, 14), 14);
		
	}
	
	@Test
	public void bustEqualsZero()
	{
		assertEquals("The number retruned was not zero", BlackJack.closestTo21(24, 22), 0);
	}
}



