package a20210926;


import java.util.*;
import java.io.*;

public class a1744 {
	static int N;
	static long result;
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int minusindex = 0;
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] <= 0) {
				minusindex++;
			}
		}
		
		Arrays.sort(arr); //정렬 후
		
		
		if(minusindex % 2 == 1) {
			result += arr[minusindex-1];
		}
		
		if((N-minusindex) % 2 == 1) {
			result += arr[minusindex];
		}
		for(int i = 1; i < minusindex; i+=2) {   //음수인 경우 
			result += (arr[i] * arr[i-1]);
		}
		
		for(int i = N-1; i > minusindex; i-=2) {  //양수인 경우
			if(arr[i] > 1 && arr[i-1] > 1) {
				result += (arr[i] * arr[i-1]);
			}
			else {
				result += (arr[i] + arr[i-1]);
			}
		}
		
		
		
		System.out.print(result);
		
		
		
		// TODO Auto-generated method stub

	}

}
