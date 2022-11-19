package a20221119;

import java.io.*;



public class sw11445 {
	
	static int T;
	
	public static String solve(String p, String q) {
		String tmp[]= q.split(p);
		if(tmp.length != 2) {
			return "Y";
		}
		else {
			if(tmp[1].equals("a")) {
				return "N";
			}
			else {
				return "Y";
			}
		}
	}
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int t = 1; t <= T; t++) {
			
			String p = br.readLine();
			String q = br.readLine();
			
			String result = solve(p,q);
			sb.append("#"+t+" "+result+"\n");
		}
		
		System.out.print(sb.toString());
		
		
		// TODO Auto-generated method stub

	}

}
