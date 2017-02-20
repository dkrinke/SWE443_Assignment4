
public class House {
	private int stones;
	private House rightNeighbor;
	private boolean myTurn;
	
	public House(){	// Default House has no stones and no rightNeighbor
		this.stones = 0;
		rightNeighbor = null;
	}
	public int getStones(){ // Returns the number of stones in the house
		return this.stones;
	}
	public void setStones(){// Updates the number of stones in the house
		
	}
	public House getRightNeighbor(){// Returns the rightNeighbor of the house
		return this.rightNeighbor;
	}
	public void setRightNeighbor(){// Sets the rightNeighbor of the house
		
	}

	public int incrementStones(){ //Increment a House's stones when sowing occurs
		return this.stoneCount++;
	}
	
	
	public void setMyTurn(boolean turn){ //Set the Player's turn
		this.myTurn = turn;
	}
	public boolean isMyTurn(){ //Determine who's turn it is
		return myTurn;
	}
	
	
	
	
}
