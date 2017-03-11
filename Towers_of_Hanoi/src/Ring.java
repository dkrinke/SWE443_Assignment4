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
        return this.color;
    }

    public int getSize() {
        return this.size;
    }

    public boolean setSize(int size) {
        if(size < 0)
            throw new IllegalArgumentException("size cannot be less than 0");

        boolean valueChanged = false;
        if(size >= 0){
            this.size = size;
            valueChanged = true;
        }
        return valueChanged;
    }

    public boolean setColor(String color) {
        if(color == null)
            throw new IllegalArgumentException("color cannot be null");

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
		return this.onTopOf;
	}
	public void setOnTopOf(Ring onTopOf) {
        if(onTopOf == null)
            throw new IllegalArgumentException("onTopOf cannot be null");
		this.onTopOf = onTopOf;
	}

	public Pole getOnPole() {
		return this.onPole;
	}

	public void setOnPole(Pole onPole) {
        if(onPole == null)
            throw new IllegalArgumentException("onPole cannot be null");
		this.onPole = onPole;
	}
}