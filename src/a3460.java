import java.util.*;


public class a3460 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int t = sc.nextInt();
		ArrayList<String> s = new ArrayList<String>();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			String binary = Integer.toBinaryString(n);
			char[] c = new char[binary.length()];
			for(int j = 0; j < binary.length(); j++) {
				c[binary.length()-1-j] = binary.charAt(j);
				}
			for(int k = 0; k < binary.length(); k++) {
				if(c[k] == '1') {
					System.out.print(k+" ");
				}
			}
			}
		}
		// TODO Auto-generated method stub

	}


