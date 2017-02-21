
public class Store extends House{
	private Store opposite;
	public Store(){
		super(); 
		this.setOpposite(null);
	}
	public Store(int initStones){
		super(initStones);
		this.setOpposite(null);
	}
	public Store(int initStones, boolean turn){
		super(initStones,turn);
		this.setOpposite(null);
	}
	public Store getOpposite(){
		return this.opposite();
	}
	
//	public int takeOppositePebbles(){
//		
//	}


	public void setOpposite(Store op){
		this.opposite = op;
		if(op != null && op.opposite != this){
			op.setOpposite(this);
		}
		else
			throw new IllegalArgumentException("Cannot set Opposite to null or self!");

	}
	
	public void ReDistributeCounterclockwise(){
		if(this.opposite == null){
			throw new NoSuchFieldException("Store does not have a right neighbor");
		}
		int stonesInHand = stones;
		stones = 0;
		while(stonesInHand != 0){
			stonesInHand--;
			House ptr = this.opposite;
			ptr.stones++;
			ptr = ptr.opposite;
		}
	}
}
