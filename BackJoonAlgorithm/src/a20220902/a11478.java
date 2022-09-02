package a20220902;


import java.util.*;
import java.io.*;


public class a11478 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		HashSet<String> hash = new HashSet<>();
		
		hash.add("a");
		hash.add("a");
		
		int size = s.length();
		
		int num = 1; //초기 루프를 돌 때의 부분문자열의 길이는 1
		
		while(num <= size) {
			int i = 0; //초기 인덱스는 0으로 선언
			
			while(i + num <= size) {
				String tmp = s.substring(i,i+num);
				hash.add(tmp);
				i++;
			}
			num++; //한바퀴를 돌면 부분문자열의 개수를 1증가시켜줌
		}
		
		System.out.print(hash.size());
		
		
		
		// TODO Auto-generated method stub

	}

}
