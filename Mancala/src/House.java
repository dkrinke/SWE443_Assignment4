
public class House {
	private int stones;
	private House rightNeighbor;
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

	private int stoneCount;
	private boolean myTurn;
	private String name;
	
	
	
	public void setStoneCount(int count){
		if(count < 0){
			throw new IllegalArgumentException("Player cannout have negative stones!");
		}
		this.stoneCount = count;
	}
	public int getStoneCount(){
		return this.stoneCount;
	}
	public int incrementStoneCount(){
		this.stoneCount++;
	}
	
	
	public void setMyTurn(boolean turn){
		if(turn==null){
			throw new IllegalArgumentException("Player's turn cannot be null!");
		}
		this.myTurn = turn;
	}
	public boolean isMyTurn(){
		return myTurn;
	}
	
	
	
	public String getName(){
		return this.name;
	}
	public void setName(){
		this.name;
	}
}
