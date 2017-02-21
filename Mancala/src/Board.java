import java.util.ArrayList;

public class Board {

	private ArrayList<House> playerOne;
	private ArrayList<House> playerTwo;
	private boolean whoseTurn;
	
	public Board(){
		playerOne = new ArrayList<House>();
		playerTwo = new ArrayList<House>();
		Store previousA = null;
		Store previousB = null;
		for(int x = 0; x < 6; x++){
			Store a = new Store(3,true);
			Store b = new Store(3,false);
			a.setOpposite(b);
			if(playerOne.size() != 0){
				previousA.setRightNeighbor(a);
				}
			if(playerTwo.size() != 0){
				b.setRightNeighbor(previousB);
				}
			playerOne.add(a);
			playerTwo.add(0,b);
			previousA = a;
			previousB = b;
		}
		House oneKalah = new House(0,true);
		House twoKalah = new House(0,false);
		previousA.setRightNeighbor(oneKalah);
		oneKalah.setRightNeighbor(previousB);
		playerTwo.get(playerTwo.size()-1).setRightNeighbor(twoKalah);
		whoseTurn = true;
	}
	
	public void selectStore(){
		
	}
	
	public void startGame(){
		//Create the Board
	}
	
	

}
