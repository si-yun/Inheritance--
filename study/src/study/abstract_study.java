package study;
abstract class A{
	public abstract int b();
	//본체가 있는 메소드는 abstract 키워드를 가질수 없다 
	//public abstract int c(){ Sysyrm.out.println("hello");}
	//추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
	public void d(){
		System.out.println("world");
	}
}

class B extends A{
	public int b() {
		return 1;
	}
}

public abstract class abstract_study {

	public static void main(String[] args) {
		B obj = new B();
	}

}
