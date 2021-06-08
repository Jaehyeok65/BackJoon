import java.util.*;


public class a3028 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean cup[] = new boolean[3];
		boolean temp = true;
		int cupindex[] = {1,2,3};
		for(int i = 0; i < cup.length; i++) {
			cup[i] = false;
		}
		cup[0] = true;
		String s = sc.nextLine();
		char c[] = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
			if(c[i] == 'A') {
				temp = cup[0];
				cup[0] = cup[1];
				cup[1] = temp;
				
			}
			if(c[i] == 'B') {
				temp = cup[1];
				cup[1] = cup[2];
				cup[2] = temp;
			
			}
			if(c[i] == 'C') {
				temp = cup[0];
				cup[0] = cup[2];
				cup[2] = temp;
			}
		}
		for(int i = 0; i < cup.length; i++) {
			if(cup[i] == true) {
				System.out.print(cupindex[i]);
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
