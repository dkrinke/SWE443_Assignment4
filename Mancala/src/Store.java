
public class Store extends House{
	private Store opposite;
	
	public Store(){
		super(); 
		this.setOpposite(null);
		this.setStones(3);
	}
	public Store(boolean turn){
		super(3,turn);
		this.setOpposite(null);
	}
	public Store(int initStones, boolean turn){
		super(initStones,turn);
		this.setOpposite(null);
	}
	public Store getOpposite(){
		return this.opposite;
	}
	
	public int takeOppositePebbles(){
		return this.getStones();
	}

	public void setOpposite(Store op){
		this.opposite = op;
		if(op != null && op.getOpposite() != this){
			op.setOpposite(this);
		}
		else
			throw new IllegalArgumentException("Cannot set Opposite to null or self!");

	}
	public void ReDistributeCounterclockwise(){
		
		int stonesInHand = this.getStones();
		this.setStones(0);
		House ptr = this.getRightNeighbor();
		
		while(stonesInHand != 0){
			if(ptr.getRightNeighbor() == null){
				throw new NullPointerException("Store does not have a right neighbor");
			}
			stonesInHand--;
			ptr.incrementStones();
			ptr = ptr.getRightNeighbor();
			
		}
	}
	
	
}
