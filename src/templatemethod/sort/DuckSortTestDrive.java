package templatemethod.sort;

import java.util.Arrays;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		Duck[] ducks = { new Duck("Daffy", 8), new Duck("Dewey", 2), new Duck("Howard", 2), new Duck("Louie", 2),
				new Duck("Donald", 2), new Duck("Huey", 2) };

		System.out.println("Before Sorting: ");
		display(ducks);
		System.out.println();
		System.out.println("After Sorting: ");
		Arrays.sort(ducks);
		display(ducks);

	}

	public static void display(Duck[] ducks) {
		for (Duck d : ducks)
			System.out.println(d);
	}

}
