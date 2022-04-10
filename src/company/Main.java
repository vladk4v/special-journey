package company;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
		Set<Integer> anotherOne = new TreeSet<>();

		for (int i : intList) {
			if ((i > 0) && (i % 2 == 0)) {
				anotherOne.add(i);
			}
		}

		for (int i : anotherOne) {
			System.out.println(i);
		}
	}
}
