package ssafy_8_14;

import java.util.Arrays;

public class String_02_문자열생성 {

	public static void main(String[] args) {
		//문자열 생성하는 방법
		String str1 = "abc"; //기초자료형 만들듯이 가능
		String str2 = new String("abc"); 
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2); //주소 비교
		System.out.println(str1.equals(str2)); 
		
		String str3 = "abc";
		String str4 = str2;
		String str5 = str3;
		
		
		System.out.println(str1 == str3);
		System.out.println(str2 == str4);
	
		System.out.println(str3 == str5);
		
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str4));
		System.out.println(str3.equals(str5));
		
		
		
//		"abc" -> 문자 배열
		System.out.println(str3.charAt(1));
		char[] c = str3.toCharArray(); //문자열 배열 반환
		
		System.out.println(Arrays.toString(c));
		
		
		
		
		
		
		
		
		
		
		
	}

}
