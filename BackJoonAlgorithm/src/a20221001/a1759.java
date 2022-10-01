package a20221001;

import java.util.*;
import java.io.*;




public class a1759 {
	
	static int C;
	static int L;
	static char input[]; //소문자 아스키코드 97 ~ 122
	static StringBuilder sb = new StringBuilder();
	
	
	
	
	public static void dfs(int cur, int dep, String result) { //현재 인덱스와 깊이를 받음
		if(dep == L) { //깊이가 L과 같다면 == 문자가 4개라는 뜻
			if(check(result)) {
				sb.append(result+"\n");
			}
			return;
		}
		
		for(int i = cur; i < C; i++) { //입력받은 문자열의 배열만큼 루프를 돔
			dfs(i+1,dep+1, result+input[i]);
		}
		
	}
	
	
	public static boolean check(String result) {
		int mo = 0;
		int ja = 0;
		
		
		for(int i = 0; i < result.length(); i++) {
			char tmp = result.charAt(i);
			if(tmp == 'a' || tmp == 'e' || tmp == 'i' || tmp == 'o' || tmp == 'u') {
				mo++;
			}
			else {
				ja++;
			}
		}
		
		if(mo >= 1 && ja >= 2) {
			return true;
		}
		else {
			return false;
		}
	}
	


	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		input = new char[C];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < C; i++) {
			input[i] = st.nextToken().charAt(0);
		}
		
		Arrays.sort(input);
		
		dfs(0,0,"");
		
		System.out.print(sb.toString());
		
		
		
		// TODO Auto-generated method stub

	}

}
