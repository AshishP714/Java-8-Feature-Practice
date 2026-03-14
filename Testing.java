package CorePractice;

@FunctionalInterface
public interface Testing {

	void success(boolean result);
	
	String toString();
}

class Test {

	public static void main(String[] args) {

		Testing t = (result) -> {
			for (int i = 1; i <= 5; i++) {
				System.out.print(i + " ");
			}
		};
		t.success(false);

		System.out.println("\n" + t.toString());
	}
}