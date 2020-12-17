package study;
class cal{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
}
class cal3 extends cal{
	public int min(int v1, int v2) {
		return v1-v2;
	}
}
public class InheritanceApp {

	public static void main(String[] args) {
		cal c = new cal();
		System.out.println(c.sum(2, 1));
	
		cal3 c3 = new cal3();
		System.out.println(c3.sum(2,1));
		System.out.println(c3.min(2,1));
	}

}

class cal2{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public int min(int v1, int v2) {
		return v1-v2;
	}
}