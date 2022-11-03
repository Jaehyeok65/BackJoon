package a20221103;


import java.util.*;
import java.io.*;


public class a25305 {
	static int N;
	static int k;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.print(list.get(k-1));
		
		
		
		// TODO Auto-generated method stub

	}

}
