package a20220901;


import java.util.*;
import java.io.*;


public class a7785 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<String> hash = new HashSet<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s1 = st.nextToken();
			String s2 = st.nextToken();
			
			if(s2.equals("enter")) {
				hash.add(s1);
			}
			else if(s2.equals("leave")) {
				hash.remove(s1);
			}
		}
		ArrayList<String> list = new ArrayList<>(hash);
		
		list.sort((s1,s2) -> s2.compareTo(s1));
		
		for(String s : list) {
			System.out.println(s);
		}
		
		// TODO Auto-generated method stub

	}

}
