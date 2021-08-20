package a20210820;



import java.util.*;


public class a1543 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String c = sc.nextLine();
		int count = 0;
		for(int i = 0; i <= s.length() - c.length(); i++) {
			if(c.equals(s.substring(i,i+c.length()))) {
				count++;
				i = i + c.length() - 1;
			}
		}
		System.out.print(count);
		// TODO Auto-generated method stub

	}

}
