import hidden.Hidden;
public class Client{
	public static void main(String[] args) {
		MyBag<String> bag = new MyBag<>();
		System.out.println(bag);

		System.out.println(new Hidden());
	}
}