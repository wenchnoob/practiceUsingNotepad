public class tf {

	public static void main(String[] args) {
		System.out.println(new tf().find(Integer.parseInt(args[0])));
	}	

	public int find(int n) {
		int sum = 0;
		int t = 3;
		int f = 5;

		while(f < n) {
			if (t < n) {
				sum += t;
				t += 3;
				continue;
			}

			if ( f % 3 == 0) {
				f+= 5;
				continue;
			}
			sum += f;
			f += 5;
		}

		return sum;
	}
}