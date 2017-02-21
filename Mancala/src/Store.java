
public class Store extends House{
	private Store opposite;
	public Store(){
		super(); 
	}
	public Store(int initStones){
		super(initStones);
	}
	public Store(int initStones, boolean turn){
		super(initStones,turn);
	}
	public Store getOpposite(){
		return this.opposite();
	}
	public void setOpposite(Store op){
		this.opposite = op;
		if(op.opposite != this){
			op.setOpposite(this);
		}
	}
}
