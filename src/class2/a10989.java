package class2;


import java.util.*;
import java.io.*;

public class a10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int result[] = new int[n];
		for(int i = 0; i <result.length; i++) {
			result[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(result);
		
		for(int i = 0; i < result.length; i++) {
			sb.append(result[i]).append("\n");
		}
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
