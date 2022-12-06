package a20221206;


import java.util.*;
import java.io.*;

public class a11931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			list.add(num);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			System.out.println(list.get(i));
		}
		// TODO Auto-generated method stub

	}

}