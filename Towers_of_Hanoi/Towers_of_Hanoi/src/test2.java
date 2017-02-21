import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	@Test
	public void test() {
		Pole pole1 = new Pole(1);
		Pole pole2 = new Pole(2);
		//Pole pole3 = new Pole(3);		Not actually needed
		
		Ring green = new Ring(1, "green");
		Ring yellow = new Ring(2, "yellow");
		Ring red = new Ring(3, "red");
		Ring blue = new Ring(4, "blue");
		
		pole1.addRing(blue); pole1.addRing(red);
		pole1.addRing(yellow); pole1.addRing(green);
		
		green.moveTo(pole2);
		assertFalse(yellow.moveTo(pole2));
	}

}
