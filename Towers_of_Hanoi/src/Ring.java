/**
 * Created by daniel on 2/20/17.
 */
public class Ring {

    private int size = -1;
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
        if(pole.addRing(this)) {
            this.onPole = pole;
            return true;
        }
        return false;
    }

    public boolean onTopOf(Ring ring) {
        if(ring.getSize() < this.getSize()) {
            this.onTopOf = ring;
            return true;
        }
        return false;
    }
}