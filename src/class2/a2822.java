package class2;
import java.util.*;
import java.io.*;

public class a2822 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[8];
		int arr1[] = new int[8];
		int result[] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			int k  = Integer.parseInt(br.readLine());
			arr[i] = k;
			arr1[i] = k;
		}
		Arrays.sort(arr);
		int cnt = 0;
		int score = 0;
		for(int i = 3; i < 8; i++) {
			score += arr[i];
			for(int j = 0; j < 8; j++) {
				if(arr[i] == arr1[j]) {
					result[cnt++] = j+1;
				}
			}
		}
		Arrays.sort(result);
		System.out.println(score);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
