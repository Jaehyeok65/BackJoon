package a20221123;


import java.io.*;

public class a3004 {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int total = 1; //현재까지 잘려진 조각
		int current = 1;
		for(int i = 0; i < N; i++) {
			if(i % 2 == 1) {
				current++;
			}
			
			total += current;
		}
		
		System.out.print(total);
		// TODO Auto-generated method stub

	}

}
