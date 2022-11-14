package a20221114;

import java.io.*;



public class sw13218 {
	
	static int T;
	
	
	public static int solve(int num) {
		
		return num / 3;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			
			int num = Integer.parseInt(br.readLine());
			
			sb.append("#"+t+" "+solve(num)+"\n");
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
