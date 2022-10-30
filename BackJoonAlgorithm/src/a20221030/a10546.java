package a20221030;

import java.util.*;
import java.io.*;


public class a10546 {
	
	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		N = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine(); //마라톤에 참가한 사람의 이름을 입력받음 동명이인이 있을 수 있음
			if(map.containsKey(s)) { //동명이인이라면 증가시킴
				map.put(s, map.get(s) + 1);
			}
			else {
				map.put(s, 1);
			}
		}
		
		for(int i = 0; i < N-1; i++) {
			String s = br.readLine(); //완주한 사람의 이름을 입력받음
			if(map.containsKey(s) && map.get(s) == 1) { //map에 있고 동명이인이 없다면 map에서 제거함 
				map.remove(s);
			}
			else if(map.containsKey(s) && map.get(s) > 1) { //동명이인이 있다면
				map.put(s, map.get(s) - 1);
			}
		}
		
		for(String key : map.keySet()) {
			System.out.print(key);
		}
		
		// TODO Auto-generated method stub

	}

}
