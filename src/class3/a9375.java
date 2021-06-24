package class3;

import java.util.*;



public class a9375 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int Test = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		while(Test --> 0) {
			
			int n = sc.nextInt();
			HashMap<String,Integer> hash = new HashMap<>();
			for(int i = 0; i < n; i++) {
				String value = sc.next();
				String key = sc.next();
				if(hash.containsKey(key)) {
					hash.put(key, hash.get(key)+1);
				}
				else {
					hash.put(key, 1);
				}
			}
			
			int result = 1;
			
			for(int value : hash.values()) {
				result *= (value+1);
			}
			sb.append(result-1+"\n");
			
		}
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
