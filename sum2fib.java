
import java.util.ArrayList;
import java.util.List;

public class sum2fib {

	private static List<Integer> fibs = new ArrayList<>();
	
	public static void main(String[] args) {
		List<Integer> evenFibs = new ArrayList<>();

		gen2Fibs(evenFibs, 4000000);
		System.out.println(sum(evenFibs));
	}

	public static int sum(List<Integer> l) {
		int sum = 0;
		for (Integer i: l) sum += i;
		return sum;
	}

	public static void gen2Fibs(List<Integer> l, int max) {
		int i = 0;
		int curFib = fib(i);
		while (curFib < max) {
			if (curFib % 2 == 0) l.add(curFib);
			curFib = fib(++i);
		}

	}

	public static int fib(int ith) {
		try {
			return fibs.get(ith - 1);
		} catch (java.lang.IndexOutOfBoundsException e) {
			if (ith == 0) return 0;
			if (ith == 1 ) {
				fibs.add(1);
				return 1;
			}
			

			int fib = fib(ith - 1) + fib(ith - 2);
			fibs.add(fib);
			return fib;
		}
	}	
}