package ssafy_8_14;

public class String_05_패턴매칭 {

	public static void main(String[] args) {
		String t = "this iss a book";
		String p = "iss";
	
		System.out.println(bruteForceFor(t, p));
	
	}
	
	public static int bruteForceWhile(String t, String p) {
		int N = t.length();
		int M = p.length();
		
		int i = 0;
		int j = 0;
		
		while (j < M && i < N) {
			if (t.charAt(i) != p.charAt(j)) {
				i -= j;
				j= -1;
			}
			i++;
			j++;
		}
		if (j == M) {
			return i-M;
		}
		
		return -1;
	}
	
	
	
	public static int bruteForceFor(String t, String p) {
		int N = t.length(); //본문의 길이
		int M = p.length(); //패턴의 길이
		
		for (int i = 0; i < N-M+1; i++) {
			boolean flag = true;
			for (int j = 0; j < M; j++) {
				if(p.charAt(j) == t.charAt(i+j)) {
					flag = false;
					break;
					
				}
				if (flag) {
					return i;
				}
				
			}//패턴 매칭 수행하는 for문
		}// 패턴 검사의 시작점 위치
		
		
		
		return -1; //못 찾았을 경우 (없을 경우)
	}
}
