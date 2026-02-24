package CorePractice;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] number = { 10, 5, 20, 8, 20, 15 };

		int findSecondLarg = Arrays.stream(number).boxed().distinct().sorted((a, b) -> b - a).skip(1).findFirst()
				.orElseThrow(() -> new RuntimeException("Dose not found larg value"));

		System.out.println("Second largest number :- " + findSecondLarg);
	}
}