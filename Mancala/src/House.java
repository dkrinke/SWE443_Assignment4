
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
	public void setStones(int count){// Updates the number of stones in the house
		if(count < 0){
			throw new IllegalArgumentException("Player can't have negative stones!");
		}
		this.stones = count;
	}
	public House getRightNeighbor(){// Returns the rightNeighbor of the house
		return this.rightNeighbor;
	}
	public void setRightNeighbor(House h){// Sets the rightNeighbor of the house
		rightNeighbor = h;
		if(h != null && h.getRightNeighbor() != this){
			h.setRightNeighbor(this);
		}
	}
	public void incrementStones(){ //Increment a House's stones when sowing occurs
		this.stoneCount++;
	}
	public void setMyTurn(boolean turn){ //Set the Player's turn
		this.myTurn = turn;
	}
	public boolean isMyTurn(){ //Determine who's turn it is
		return myTurn;
	}
	
	
	
	
}
