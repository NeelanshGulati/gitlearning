package letsDoIt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class gogogo {

	public static void main(String[] args) throws IOException {

		String[] arr = { "1", "-2", "99", "a", "0a", "-1", "-1" };

		TreeSet<Integer> numbers = new TreeSet<>();
		ArrayList<String> nonNumbers = new ArrayList<>();

		for (String s : arr) {
			try {
				numbers.add(Integer.parseInt(s));
			} catch (NumberFormatException e) {
				nonNumbers.add(s);
			}
		}

		System.out.println("Numbers in asc order : ");
		for (int i : numbers) {
			System.out.print(i + ",");
		}
		System.out.println();

		System.out.println("Non numbers: are 3 ");
		for (String s : nonNumbers) {
			System.out.print(s + ",");
		}

	}

}