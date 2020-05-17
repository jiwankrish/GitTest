package page;

import java.util.Random;

public class BasePage {
	public int randomIntGenerator() {
		Random rand = new Random();
		return rand.nextInt();
	}
}
