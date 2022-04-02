package accessModifier;

public final class FinalNonAccessModifier {

	public static final void calculation() {
		System.out.println(85 * 63);
	}

	public final void addition() {
		System.out.println(85 + 63);
	}

	public static void main(String[] args) {

		int a = 520;
		final int b = 850;
		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
		a = 600;
		System.out.println("new Value of a = " + a);
		// b = 900; //we cann't assign new value to final b
		// System.out.println("Value of b = "+b);
		FinalNonAccessModifier finalNonAccessModifier = new FinalNonAccessModifier();
		finalNonAccessModifier.addition();
		calculation();

	}

}
