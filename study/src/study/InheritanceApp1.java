package study;
class cal1{
	int v1,v2;
	cal1(int v1,int v2){
		this.v1 = v1 ;
		this.v2 = v2 ;
		System.out.println("cal1!");
	}
	public int sum() {
		System.out.println("sum");
		return this.v1+v2;
	}
	public int minus() {
		System.out.println("miuns");
		return this.v1-v2;
	}
	public int mul() {
		System.out.println("mul");
		return this.v1*v2;
	}
	public int div() {
		System.out.println("div");
		return this.v1/v2;
	}
}
//class cal4 extends cal1{
//
//	cal4(int v1, int v2) {
//		super(v1, v2);   //super�뒗 遺�紐⑦겢�옒�뒪�쓽 �깮�꽦�옄
//		System.out.println("cal4!");
//	}
//	public int minus() {
//		return this.v1-v2;
//	}
//}
public class InheritanceApp1 {
	public static void main(String[] args) {
		cal1 c1 = new cal1(2,1);
		//test
		//test zz
	}

}
