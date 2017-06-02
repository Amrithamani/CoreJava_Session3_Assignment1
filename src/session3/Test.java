package session3;

public class Test {

	// static block
	static {
		print(10);
	}

	// runtime error No such method

	static void print(int x) {
		System.out.println(x);
		System.exit(0);
	}

}
