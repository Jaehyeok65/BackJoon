package class2;


import java.util.*;


public class a1316 {
	
	public static boolean wordcheck(String s) {
		
		boolean check[] = new boolean[26];
		
		int prev = 0;
		for(int i = 0; i < s.length(); i++) {
			int now = s.charAt(i);
			
			if(now != prev) {
				
				if(check[now-'a'] == false) {
					check[now-'a'] = true;
					prev = now;
				}
				else {
					return false;
				}
			}
			else {
				continue;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 //변수를 저장한 뒤 다시 나오면 false
		int n = sc.nextInt();
		int count = 0;
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			if(wordcheck(s)) {
				count++;
			}
		}
		System.out.print(count);

		// TODO Auto-generated method stub

	}

}
