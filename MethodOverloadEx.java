package DataBaseConnector;
class Add{
	void add(int i, int j) {
		System.out.println(i+j);
	}
	void add(int i, int j, int k) {
		System.out.println(i+j+k);
	}
}
public class MethodOverloadEx {

	public static void main(String[] args) {
		Add a = new Add();
		a.add(10, 20);
		a.add(10, 20, 30);

	}

}
