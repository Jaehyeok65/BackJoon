package a20221017;

import java.util.*;
import java.io.*;



public class a2002 {
	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		HashMap<String,Integer> map = new HashMap<>();
		int order[] = new int[N+1];
		int count = 0; //현재까지 추월한 차의 개수
		
		for(int i = 1; i <= N; i++) {
			map.put(br.readLine(), i); //차량이름을 키로 하고, 값을 순서로하는 맵 
		}
		
		//순서대로 1 2 3 4
		
		
		for(int i = 1; i <= N; i++) {
			order[i] = map.get(br.readLine());
		}
		
		for(int i = 1; i < N; i++) {
			for(int j = i+1; j <= N; j++) {
				if(order[i] > order[j]) {
					count++;
					break;
				}
			}
		}
		System.out.print(count);
		
		
		

		
		
		
		// TODO Auto-generated method stub

	}

}
