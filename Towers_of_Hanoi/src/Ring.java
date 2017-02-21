/**
 * Created by daniel on 2/20/17.
 */
public class Ring {

    private int size = -1;		//The larger the number, the bigger the ring.
    private String color = "";
    private Ring onTopOf = null;
    private Pole onPole = null;

    public Ring(int size, String color){
        this.setSize(size);
        this.setColor(color);
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public boolean setSize(int size) {
        boolean valueChanged = false;
        if(size >= 0){
            this.size = size;
            valueChanged = true;
        }
        return valueChanged;
    }

    public boolean setColor(String color) {
        boolean valueChanged = false;
        if(color != null){
            this.color = color;
            valueChanged = true;
        }
        return valueChanged;
    }

    public boolean moveTo(Pole pole) {
        if(pole.addRing(this)) return true;
        return false;
    }

    public boolean onTopOf(Ring ring) {
        if(ring.getSize() < this.getSize()) {
            this.setOnTopOf(ring);
            return true;
        }
        return false;
    }
	public Ring getOnTopOf() {
		return onTopOf;
	}
	public void setOnTopOf(Ring onTopOf) {
		this.onTopOf = onTopOf;
	}

	public Pole getOnPole() {
		return onPole;
	}

	public void setOnPole(Pole onPole) {
		this.onPole = onPole;
	}
}