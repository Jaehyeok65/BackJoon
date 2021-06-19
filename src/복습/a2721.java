package 복습;



import java.util.*;
import java.io.*;


public class a2721 {
	


	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)+"\n");
		}
		System.out.print(sb.toString());
		
		
		// TODO Auto-generated method stub

	}

}
