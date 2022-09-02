package a20220902;


import java.util.*;
import java.io.*;


public class a1269 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int count = n + m; //집합의 원소의 개수의 합
		
		HashSet<Integer> hash1 = new HashSet<>();
		HashSet<Integer> hash2 = new HashSet<>();
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		while(st1.hasMoreTokens()) {
			hash1.add(Integer.parseInt(st1.nextToken()));
		}
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		while(st2.hasMoreTokens()) {
			int num = Integer.parseInt(st2.nextToken());
			
			if(hash1.contains(num)) { //hash1에 포함되어있는 (중첩된 값) 값을 hash2에 넣음
				hash2.add(num);
			}
		}
		
		int count1 = hash2.size() * 2;
		
		int result = count - count1;
		
		System.out.println(result);
		
		
				// TODO Auto-generated method stub

	}

}
