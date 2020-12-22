package study;


public class array {

	public static void main(String[] agrs) {
		
		String[] classGroup = {"0번째","1번째","2번째","3번째"};
		
		System.out.println(classGroup[0]);//0번째
		System.out.println(classGroup[1]);//1번째
		System.out.println(classGroup[2]);//2번째
		System.out.println(classGroup[3]);//3번째
		
		
		String[] classGroup1 = new String[4];
		classGroup1[0] = "0번";
		System.out.println(classGroup1.length);//4
		classGroup1[1] = "1번";
		System.out.println(classGroup1.length);//4
		classGroup1[2] = "2번";
		System.out.println(classGroup1.length);//4
		classGroup1[3] = "3번";
		System.out.println(classGroup1.length);//4
		
		for(int i = 0; i<classGroup.length;i++) {
			String classmember = classGroup1[i];
			String classmembers = classGroup[i];
			System.out.println(classmember +"완료");
			System.out.println(classmembers+"완료");
		}
		
		for(String e : classGroup) {
			System.out.println(e+"완료");
		}
		for(String e :classGroup1) {
			System.out.println(e+"완료");
		}
		
		System.out.println(classGroup1[4]+"입니다"); //이러면 오류
		System.out.println(classGroup[2]+"입니다");
	}
}
