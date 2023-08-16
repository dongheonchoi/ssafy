package ssafy_08_16;

public class Stack_01_구현 {
	
	public static int[] stack = new int[5]; 
	public static int top = -1; 
	
	

	public static void main(String[] args) {
		
		
		
		
		
	}
	
	
	public static int pop() {
		if (isEmpty()) {
			System.out.println("배열이 비었습니다.");
			return -1;
		}
		return stack[top--];
	
	}
	
	public static int peek() {
		if (isEmpty()) {
			System.out.println("배열이 비었습니다.");
			return -1;
		}
		return stack[top--];
		
	}
	
	
	
	public static void push(int value) {
		//배열로 만든 스택이므로 작업한개가 추가 된다.
		if (isFull()) {
			System.out.println("배열이 full입니다.");
			
			return;
		}
			stack[++top] = value;
	}
	
	
	
	
	
	
	public static boolean isFull() {
		
		
		
		return top == stack.length-1;
	}
	
	
	
	
	//공백상태 체크
	public static boolean isEmpty() {
//  	if(top == -1) return true;
//		else return false;
		
		
	  	if(top == -1) return true;
		
	  	return false;	
		
		
		
	}
	

}
