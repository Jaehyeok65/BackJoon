package a20211017;


import java.util.*;
import java.io.*;


public class a1339 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String arr[] = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		int count[] = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			int pows = (int)Math.pow(10, arr[i].length() - 1 );
			for(int j = 0; j < arr[i].length(); j++) {
				count[arr[i].charAt(j)-65] += pows;
				pows /= 10;
			}
		}
		
		Arrays.sort(count);
		
		int sum = 0;
		int index = 9;
		
		for(int i = count.length-1; i > 0; i--) {
			if(count[i] == 0) {
				break;
			}
			
			sum += count[i]*index--;		
		}
		
		System.out.print(sum);
	
		
		
		
		// TODO Auto-generated method stub

	}

}
