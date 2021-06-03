package checked;

public class Exm1 {
	static void div() throws ArithmeticException {
		System.out.println(10 / 0);
	}

	public static void main(String[] args) {
		try {
			div();
		} catch (ArithmeticException e) {
			System.out.println("invalid denominator");
		}
	}
}
