package class2;


import java.util.*;


public class a1181 {
	
	



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < n; i++) {
			String s1 = sc.next();
			list.add(s1);
		}
		
		Collections.sort(list, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() > s2.length()) {
					return 1;
				}
				else if(s2.length() > s1.length()) {
					return -1;
				} 
				else {
					return s1.compareTo(s2);
				}
			}	
		});
		String temp = "";
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(temp)) {
				continue;
			}
			else {
				System.out.println(list.get(i));
				temp = list.get(i);
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
