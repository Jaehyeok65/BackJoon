package class3;


import java.util.*;


public class a17219 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,String> hash = new HashMap<>();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			hash.put(sc.next(), sc.next());
		}
		
		for(int i = 0; i < m; i++) {
			System.out.println(hash.get(sc.next()));
		}
		// TODO Auto-generated method stub

	}

}
