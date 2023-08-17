package ssafy_08_17;

public class Stack_08_재귀호출 {

	public static void main(String[] args) {
		
	}
	
	
	//재귀함수는  두부분으로 작성하는 경우가 많다.
	public static void func2(int num) {
//		1. 기본파트 : 재귀함수를 종효하는 조건을 작성하는 부분
		if(num == 0) {
			return;
			
		}else {
			System.out.println(num + " 함수 호출");
			func2(num);
			System.out.println(num + " 함수 리턴 ");
		}
	}
	
	
}
