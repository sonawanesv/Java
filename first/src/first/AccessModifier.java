package first;

public class AccessModifier {
	int ab;
	int ca;
	void displayab() {
		System.out.println("ab");
	}
	void displayca() {
		System.out.println("ca");
	}

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		am.displayab();
		am.displayca();

	}

}
