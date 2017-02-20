import java.util.ArrayList;

/**
 * Created by daniel on 2/20/17.
 */
interface stack {
    boolean push(Ring size);
    boolean pop();
    Ring top();
    int count();
}

public class Pole implements stack {

    private int id = -1;
    private ArrayList<Integer> nextToList;
    private ArrayList<Ring> stack;

    public Pole(int id) {
        this.setId(id);
        this.nextToList = new ArrayList<Integer>();
        this.stack = new ArrayList<Ring>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> isNextTo() {
        return this.nextToList;
    }

    public void setIsNextTo(int id) {
        nextToList.add(id);
    }

    public boolean addRing(Ring ring) {
        return this.push(ring);
    }

    public void removeFromTop() {
        this.pop();
    }

    public boolean push(Ring size) {
        return stack.add(size);
    }

    public boolean pop() {
        return stack.remove(this.top());
    }

    public Ring top() {
        return this.stack.get(this.count()-1);
    }

    public int count() {
        return this.stack.size();
    }
}