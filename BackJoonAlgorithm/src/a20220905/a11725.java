package a20220905;


import java.util.*;
import java.io.*;


public class a11725 {
	
	static int n;
	static boolean visited[];
	static ArrayList<Integer>[] list;
	static int[] arr;
	
	
	public static void dfs(int n){
        if(visited[n]){
            return;
        }
        visited[n] =true;
        for (int v: list[n]) {
            if(!visited[v]){
                arr[v] = n;
                dfs(v);
            }
        }

    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		list = new ArrayList[n+1];
		arr = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			list[i] = new ArrayList<Integer>();
		}
		visited = new boolean[n+1];

		
		
		for(int i = 1; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int fn = Integer.parseInt(st.nextToken());
			int ln = Integer.parseInt(st.nextToken());
			
			list[fn].add(ln);
			list[ln].add(fn);
			
		}
		
		for(int i = 1; i <= n; i++) {
			if(!visited[i]) {
				dfs(i);
			}
		}
		
		for(int i = 2; i <= n; i++) {
			System.out.println(arr[i]);
		}
		
		
		// TODO Auto-generated method stub

	}

}
