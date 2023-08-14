package ssafy_8_14;

import java.util.Arrays;

public class String_03_문자열뒤집기 {

	public static void main(String[] args) {
		//뒤집을 문자열 하나 준비해보자.
		String text = "조용히관리하겠습니다";
		
		//문자열 뒤집기
		//1. 거꾸로 저장
		
		char[] str = new char[text.length()];
		
		for (int i = text.length() , idx = 0; i >= 0; i--, idx++) { //중간 조건식은 논리식을 붙여서만 가능
			str[idx] = text.charAt(i);
		}
		System.out.println(str);
		
		//2.swap 방식
		char[] str2 = text.toCharArray();
		int len = str2.length;
		
		for (int i = 0; i < len/2; i++) {
			char temp = str2[i];
			str2[i] = str2[len-1-i];
			str2[len-1-i] = temp;
		}
		System.out.println(Arrays.toString(str2));
		
		//3. StringBuilder / StringBuffer
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(text);
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
