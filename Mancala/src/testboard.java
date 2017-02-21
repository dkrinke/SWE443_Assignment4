import static org.junit.Assert.*;

import org.junit.Test;

public class testboard {

	@Test
	public void ReDistributeCounterclockwise() {						//testing ReDistribute
		Board startgame = new Board();
		((Store) startgame.getPlayerOne().get(0)).ReDistributeCounterclockwise();
		assertTrue(startgame.getPlayerOne().get(0).getStones()==0);
		assertTrue(startgame.getPlayerOne().get(1).getStones()==4);
		assertTrue(startgame.getPlayerOne().get(2).getStones()==4);
		assertTrue(startgame.getPlayerOne().get(3).getStones()==4);
	}
	
	@Test
	public void TakeOpp() {														//testing take opposite pebble
		Board startgame = new Board();
		startgame.getPlayerOne().get(4).setStones(0);
		((Store) startgame.getPlayerOne().get(1)).ReDistributeCounterclockwise();
		startgame.takeOppositePebbles((Store) startgame.getPlayerOne().get(4));
		assertTrue(startgame.getPlayerOne().get(4).getStones()==1);				//player 1 position 4 opposite is player 2 position 1 -> should have 1 since one landed on it		
		assertTrue(startgame.getPlayerTwo().get(1).getStones()==0);				//player 2 == 0 since all its pebble is stolen
		assertTrue(startgame.getPlayerOne().get(6).getStones()==3);				//player 1 house should contain all the pebble it stoles.
	}

}