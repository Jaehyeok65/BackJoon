package bronze1;


import java.util.*;


public class a9625 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String result = "A";
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < result.length(); j++) {
				if(result.charAt(j) == 'A') {
					result = result.replace("A", "B");
				}
				else if(result.charAt(j) == 'B') {
					result = result.replace("B", "BA");
				}
			}
			System.out.println(result);
			
		}
		
		int A = 0;
		int B = 0;
		for(int i = 0; i < result.length(); i++) {
			if(result.charAt(i) == 'A') {
				A++;
			}
			else if(result.charAt(i) == 'B') {
				B++;
			}
		}
		System.out.print(A+" "+B);
		
		
		// TODO Auto-generated method stub

	}

}
