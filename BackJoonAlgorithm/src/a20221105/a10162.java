package a20221105;


import java.io.*;


public class a10162 {
	
	static int T;
	final static int A = 300;
	final static int B = 60;
	final static int C = 10;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		if(T % 10 != 0) {
			System.out.print(-1);
		}
		else {
			System.out.print(T/A + " " + (T%A)/B + " " + (T%B)/C);
		}
		
		// TODO Auto-generated method stub

	}

}
