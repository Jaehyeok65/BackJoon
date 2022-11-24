package a20221124;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class a1193 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
 
		int count = 1, prev = 0;
 
		while (true) {
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if (X <= prev + count) {	
				
				if (count % 2 == 1) {	
					System.out.print((count - (X - prev - 1)) + "/" + (X - prev));
					break;
				} 
				
				else {
					System.out.print((X - prev) + "/" + (count - (X - prev - 1)));
					break;
				}
 
			} else {
				prev += count;
				count++;
			}
		}
	}
}