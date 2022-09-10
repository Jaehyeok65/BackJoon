package a20220910;



import java.util.*;
import java.io.*;

public class a13305 {
	
	static long km[];
	static long price[];
	static int n;
	static long result = 0; //현재까지 쓴 최소 비용
	static long min;
	
	
	static void solve() {
		min = price[0];
		
		for(int i = 0; i < n-1; i++) {
			
			if(price[i] < min) {
				min = price[i];
			}
			
			result += (min * km[i]);
		}
	}
	
	
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		km = new long[n-1];
		price = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n-1; i++) {
			km[i] = Long.parseLong(st.nextToken());
		}
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			price[i] = Long.parseLong(st1.nextToken());
		}
		
		solve();
		
		System.out.print(result);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
