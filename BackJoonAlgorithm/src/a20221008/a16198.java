package a20221008;

import java.util.*;
import java.io.*;



public class a16198 {
	
	static ArrayList<Integer> list = new ArrayList<>();
	static int N;
	static int max = Integer.MIN_VALUE;
	
	public static void dfs(int result, int depth) {
		if(depth == N-2) { //첫번째와 마지막은 선택하지 않으므로
			max = Math.max(max, result);
			return;
		}
		
		for(int i = 1; i < list.size()-1; i++) { //처음과 마지막은 선택하면 안되므로
			int tmp = list.get(i);
			int sum = list.get(i-1) * list.get(i+1);
			list.remove(i);
			dfs(result + sum, depth+1);
			list.add(i,tmp);
		}
		
		
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}//입력 완료
		
		dfs(0,0);
		System.out.print(max);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
