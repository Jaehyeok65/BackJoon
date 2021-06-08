package class2;


import java.util.*;
import java.io.*;

public class a11728 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		int n = Integer.parseInt(st1.nextToken());
		int m = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		while(st2.hasMoreTokens()) {
			list.add(Integer.parseInt(st2.nextToken()));
		}
		
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		
		while(st3.hasMoreTokens()) {
			list.add(Integer.parseInt(st3.nextToken()));
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)+" ");
		}
		System.out.print(sb.toString());
		
		
		
		
		// TODO Auto-generated method stub

	}

}
