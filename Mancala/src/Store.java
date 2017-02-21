
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
	public void setOpposite(Store op){
		this.opposite = op;
		if(op != null && op.opposite != this){
			op.setOpposite(this);
		}
	}
}
