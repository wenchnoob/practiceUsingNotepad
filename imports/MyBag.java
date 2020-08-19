import java.util.HashMap;

public class MyBag<Item> {
	private HashMap<Item, Integer> map;

	public MyBag() {
		map = new HashMap<>();	
	}

	public String toString() {
		return "You hava a bag";
	}

}