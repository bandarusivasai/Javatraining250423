package DataBaseConnector;
class A{
	A(){
		System.out.println("A-Con");
	}
	static {
		System.out.println("SB-A");
	}
	int m1() {
		System.out.println("m1-A");
		return 10;
	}
	static int m2() {
		System.out.println("m2-A");
		return 20;
	}
	{
		System.out.println("IB-A");
	}
	static int i = m2();
	int j = m1();
}

class B extends A {
	{
		System.out.println("IB-B");
	}
	int m3() {
		System.out.println("m3-B");
		return 30;
	}
	static {
		System.out.println("SB-B");
	}
	int k = m3();
	B() {
		System.out.println("B-Con");
	}
	static int l = m4();
	static int m4() {
		System.out.println("m4-b");
		return 40;
	}
}
public class Test {

	public static void main(String[] args) {
	  B b1 = new B();
	  B b2 = new B();
	}

}
