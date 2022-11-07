package a20221107;

import java.util.*;
import java.io.*;



public class a1758 {
	static int N;
	static long result = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		ArrayList<Long> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			long num = Long.parseLong(br.readLine());
			list.add(num);
		}
		//팁을 최대로 받기 위해서는 음수를 최대로 만들면 된다. == 즉 팁을 적게 주는 사람을 뒤로 보내면됨
		
		Collections.sort(list, Collections.reverseOrder());
		
		for(int i = 0; i < N; i++) {
			if((list.get(i) - i) < 0) break;
			result += (list.get(i)-i);
		}
		System.out.print(result);
		
		
		
		// TODO Auto-generated method stub

	}

}
