package day3;

public class overloadingPolymerphism {
	
	void addition(int a, int b) {
		System.out.println("Result:"+(a+b));
	}
	void addition (int a, double b, int c) {
		System.out.println("Result:"+(a+b+c));
	}
	void addition(int a, double b) {
		System.out.println("Result:"+(a+b));
	}
	void addition(int a, int b, int c) {
		System.out.println("Result:"+(a+b+c));
	}
	

	public static void main(String[] args) {
		overloadingPolymerphism om = new overloadingPolymerphism();
		om.addition(2, 3);
		om.addition(2, 3.0, 1);
		om.addition(2, 5.0);
		om.addition(2, 3, 2);
		

	}

}
