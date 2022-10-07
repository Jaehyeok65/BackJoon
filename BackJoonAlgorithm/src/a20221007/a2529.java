package a20221007;

import java.util.*;
import java.io.*;




public class a2529 {
	static int N;
	static boolean visited[] = new boolean[10]; //1~9까지
	static Character[] map;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static ArrayList<String> list = new ArrayList<>();
	
	public static void dfs(String result, int depth) {
		if(depth == N+1) {
			list.add(result);
			return;
		}
		
		for(int i = 0; i <= 9; i++) {
			 if (depth == 0 || !visited[i] && compare(result.charAt(result.length() - 1) - '0', i, map[depth - 1])) {
				 visited[i] = true;
				 dfs(result + i, depth + 1);
				 visited[i] = false;
			 }
		}
	}
	

	
	public static boolean compare(int a, int b, char c) {
		if(c == '<') return a < b;
		else return a > b;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		map = new Character[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			map[i] = st.nextToken().charAt(0);
		}
		
		dfs("",0);
		
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
		System.out.println(list.get(0));
		
		
		
		// TODO Auto-generated method stub

	}

}
