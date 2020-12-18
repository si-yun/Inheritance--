package study;
class cal1{
	int v1,v2;
	cal1(int v1,int v2){
		this.v1 = v1 ;
		this.v2 = v2 ;
		System.out.println("cal1!");
	}
	public int sum() {
		return this.v1+v2;
	}
}
class cal4 extends cal1{

	cal4(int v1, int v2) {
		super(v1, v2);   //super는 부모클래스의 생성자
		System.out.println("cal4!");
	}
	public int minus() {
		return this.v1-v2;
	}
}
class cal5{
	//si test
}
class cal6{
	//si test
}
public class InheritanceApp1 {
	public static void main(String[] args) {
		cal1 c1 = new cal1(2,1);
		cal4 c4 = new cal4(2,1);
		System.out.println(c4.sum());
		System.out.println(c4.minus());
		System.out.println(c4.minus());
		System.out.println(c4.minus());
		System.out.println(c4.minus());
		System.out.println(c4.minus());
		System.out.println(c4.minus());
		System.out.println(c4.minus());
		System.out.println(c4.minus());
		System.out.println(c4.minus());
		//branches test
		System.out.println(c4.minus());
		System.out.println(c4.minus());
		System.out.println(c4.minus());
		System.out.println(c4.minus());
	}
	//test
	//test11

}

