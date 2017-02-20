/**
 * Created by daniel on 2/20/17.
 */
public class Ring {

    private int size = -1;
    private String color = "";

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

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
