package a20221108;

import java.util.*;
import java.io.*;


public class a20291 {
	static int N; //입력 개수

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		
		
		while(N-- > 0) {
			String s = br.readLine();
			String key = s.substring(s.indexOf(".")+1);
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		
		List<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list);
		
		for(String s : list) {
			System.out.println(s + " " + map.get(s));
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
