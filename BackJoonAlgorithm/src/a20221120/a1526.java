package a20221120;

import java.io.*;



public class a1526 {
	
	public static boolean check(int num) {
		boolean flag = true;
		String target = String.valueOf(num);
		for(int i = 0; i < target.length(); i++) {
			int tmp = Integer.parseInt(target.substring(i,i+1));
			if(!(tmp == 4 || tmp == 7)) {
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i = 0; i <= num; i++) {
			if(check(i)) {
				result = Math.max(result, i);
			}
		}
		
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
