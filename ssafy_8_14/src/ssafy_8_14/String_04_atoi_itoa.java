package ssafy_8_14;

import java.util.Arrays;

public class String_04_atoi_itoa {

	public static void main(String[] args) {
//		String sNum = "1234";
//		String sNum = "         1234            ";
		String sNum = "-1234";
		
		
		
		int num = Integer.parseInt(sNum.trim());
		
		System.out.println(num);
		
		
		//숫자를 문자열로 바꾸려면
		String sNum2 = String.valueOf(num);
		
		System.out.println(sNum2);
		
		
		String sNum3 = num+"";
		System.out.println(sNum3);
		
		System.out.println(atoi(sNum3));
		
	}
	//원래라면 어떻게 동작하는지 어렵게 구현을 해보자
	
	
	//문자열을 정수로 바꾼다. (숫자로만 이루어진 문자열이 들어온다.)
	public static int atoi(String text) {
		int value = 0;
		
		//앞에서부터 차례로 읽으면서 문자를 숫자로 바꾸고 자릿수를 올려준다.
		int digit = 0;
		for (int i = 0; i < text.length(); i++) {
			char num = text.charAt(i); //i 번째 자리의 문자를 읽어오겠다.
			if (num >= '0' && num <= '9') {
				//이건 숫자야
				digit = num - '0';
			}else {
				//여기에 들어오면 .. 이건 숫자가 아닌 이상한 것이 끼여있다.
				//필요한 작업을 할 수 있다.
			}
			
			
			value = (value*10) + digit;
		}
		
		
		
		return value;
	}
	//고려하지 않은 부분 음수일경우는 등등
	
//	public static String itoa(int String) {
//		
//	}
	
	
	

}
