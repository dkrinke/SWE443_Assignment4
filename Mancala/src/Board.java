import java.util.ArrayList;

public class Board {

	private ArrayList<House> playerOne;
	private ArrayList<House> playerTwo;
	private boolean whoseTurn; //Player One is True, Player Two is False
	
	public Board(){							// Initialize board
		playerOne = new ArrayList<House>();	// Player One's side of the board
		playerTwo = new ArrayList<House>(); // Player Two's side of the board
		Store previousA = null;				// The previously created Store for player one
		Store previousB = null;				// The previously created Store for player two
		for(int x = 0; x < 6; x++){			// For all six store on each side of the board
			Store a = new Store(3,true);	// Create one of player one's stores
			Store b = new Store(3,false);	// Create one of player two's stores
			a.setOpposite(b);				// Set them opposite to each other
			if(playerOne.size() != 0){		// If this isn't the first player one store created
				previousA.setRightNeighbor(a); // The newly created store is to the right of the previously created one
				}
			if(playerTwo.size() != 0){		// If this isn't the first player two store created
				b.setRightNeighbor(previousB); // The previously created store is to the right of the newly created one
				}
			playerOne.add(a);				// Add player one's store to the end playerOne
			playerTwo.add(0,b);				// Add player two's store to the start of playerTwo
			previousA = a;					// Update previousA
			previousB = b;					// Update previousB
		}
		House oneKalah = new House(0,true);	// Create player one's House
		House twoKalah = new House(0,false); // Create player two's House
		previousA.setRightNeighbor(oneKalah); // The player one's House is to the right of  previousA
		oneKalah.setRightNeighbor(previousB); // previousB is to the right of player one's House
		playerTwo.get(playerTwo.size()-1).setRightNeighbor(twoKalah); // set player two's house to be to the right of the last store in playerTwo
		twoKalah.setRightNeighbor(playerOne.get(0)); // set the first store in playerOne to be to the right of player two's house
		playerOne.add(oneKalah); // Add player one's house to playerOne
		playerTwo.add(twoKalah); // Add player two's house to playerTwo
		whoseTurn = true; // Set the turn to player one
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
		if(player)return playerOne;
		else return playerTwo;
	}
}//dsafdaf
