package a20220829;


import java.util.*;
import java.io.*;


public class a14425 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashSet<String> hash = new HashSet<>();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			hash.add(br.readLine());
		}
		
		for(int i = 0; i < m; i++) {
			String s = br.readLine();
			if(hash.contains(s)) {
				count++;
			}
		}
		System.out.print(count);
		// TODO Auto-generated method stub

	}

}
