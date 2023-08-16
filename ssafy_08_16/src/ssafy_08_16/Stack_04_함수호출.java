package ssafy_08_16;

public class Stack_04_함수호출 {

	public static void main(String[] args) {
		
		System.out.println("메인 함수 실행");
		func1();
		System.out.println("메인 함수 종료");
		
	}
	
	
	public static void func1() {
		int a = 10;
		int[] nums = {1,2,3};
		System.out.println("함수1 실행");
		func2(a , nums);
		System.out.println("함수1 종료");
		System.out.println(a);
		System.out.println(nums[1]);

	}
	public static void func2(int a, int[] nums) {
		a = 20;
		nums[1] = 10;
		System.out.println("함수2 실행");
		System.out.println("함수2 종료");
		
	}
	

}
