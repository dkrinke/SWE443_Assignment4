
public class House {

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
