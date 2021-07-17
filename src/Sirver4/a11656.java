package Sirver4;


import java.util.*;


public class a11656 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String s = sc.next();
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < s.length(); i++) {
			list.add(s.substring(i));
		}
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)+"\n");
		}
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
