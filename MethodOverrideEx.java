package DataBaseConnector;
class O {
	static int m1() {
		System.out.println("m1-O");
		return 10;
	}
}
class R extends O{
	static int m1() {
		System.out.println("m1-R");
		return 42;
	}
}

public class MethodOverrideEx {

	public static void main(String[] args) {
		O r = new R();
		r.m1();

	}

}
