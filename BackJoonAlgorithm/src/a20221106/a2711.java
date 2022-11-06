package a20221106;


import java.util.*;
import java.io.*;

public class a2711 {
	static int T;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			String target = st.nextToken();
			
			sb.append(target.substring(0,num-1).concat(target.substring(num))+"\n");
			
		}
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
