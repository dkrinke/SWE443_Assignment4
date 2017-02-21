import java.util.ArrayList;

public class Board {

	private ArrayList<House> playerOne;
	private ArrayList<House> playerTwo;
	private boolean whoseTurn; //Player One is True, Player Two is False
	
	public Board(){							// Initialize board
		setPlayerOne(new ArrayList<House>());	// Player One's side of the board
		setPlayerTwo(new ArrayList<House>()); // Player Two's side of the board
		Store previousA = null;				// The previously created Store for player one
		Store previousB = null;				// The previously created Store for player two
		for(int x = 0; x < 6; x++){			// For all six store on each side of the board
			Store a = new Store(3,true);	// Create one of player one's stores
			Store b = new Store(3,false);	// Create one of player two's stores
			a.setOpposite(b);				// Set them opposite to each other
			if(getPlayerOne().size() != 0){		// If this isn't the first player one store created
				previousA.setRightNeighbor(a); // The newly created store is to the right of the previously created one
				}
			if(getPlayerTwo().size() != 0){		// If this isn't the first player two store created
				b.setRightNeighbor(previousB); // The previously created store is to the right of the newly created one
				}
			getPlayerOne().add(a);				// Add player one's store to the end playerOne
			getPlayerTwo().add(0,b);				// Add player two's store to the start of playerTwo
			previousA = a;					// Update previousA
			previousB = b;					// Update previousB
		}
		House oneKalah = new House(0,true);	// Create player one's House
		House twoKalah = new House(0,false); // Create player two's House
		previousA.setRightNeighbor(oneKalah); // The player one's House is to the right of  previousA
		oneKalah.setRightNeighbor(previousB); // previousB is to the right of player one's House
		getPlayerTwo().get(getPlayerTwo().size()-1).setRightNeighbor(twoKalah); // set player two's house to be to the right of the last store in playerTwo
		twoKalah.setRightNeighbor(getPlayerOne().get(0)); // set the first store in playerOne to be to the right of player two's house
		getPlayerOne().add(oneKalah); // Add player one's house to playerOne
		getPlayerTwo().add(twoKalah); // Add player two's house to playerTwo
		whoseTurn = true; // Set the turn to player one
	}
	public void test(){
		((Store) getPlayerOne().get(0)).ReDistributeCounterclockwise();
		
		System.out.println("pit 0: " + getPlayerOne().get(0).getStones());
		System.out.println("pit 1: " + getPlayerOne().get(1).getStones());
	}
	
	public void startGame(){
		//Start the game
	}
	public int getScore(boolean player){//INCOMPLETE
		return 0;
	}
	public int getStonesInStore(int index,boolean player){//INCOMPLETE
		return 0;
	}
	public ArrayList<House> getPlayerPits(boolean player){
		if(player)return getPlayerOne();
		else return getPlayerTwo();
	}
	public ArrayList<House> getPlayerOne() {
		return playerOne;
	}
	public void setPlayerOne(ArrayList<House> playerOne) {
		this.playerOne = playerOne;
	}
	public ArrayList<House> getPlayerTwo() {
		return playerTwo;
	}
	public void setPlayerTwo(ArrayList<House> playerTwo) {
		this.playerTwo = playerTwo;
	}
	
	public void takeOppositePebbles(Store s){
		int i;
		i = s.getOpposite().getStones();
		s.getOpposite().setStones(0);
		House tmp;
		if(this.whoseTurn){
			tmp = playerOne.get(playerOne.size()-1);
			
		} else {
			tmp= playerTwo.get(playerTwo.size()-1);
		}
	tmp.setStones(tmp.getStones()+i);
	}
}