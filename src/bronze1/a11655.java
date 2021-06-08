package bronze1;


import java.util.*;


public class a11655 {
	
	public static String Rot13(String s) {
		String rot = "";
		char c[] = s.toCharArray();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				if((char)(s.charAt(i)+13) > 'Z')
				{
					c[i] = (char)(s.charAt(i) - 13);
				}
				else {
					c[i] = (char)(s.charAt(i) + 13);
				}
			}
			else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				if((char)(s.charAt(i)+13) > 'z') {
					c[i] = (char)(s.charAt(i) - 13);
				}
				else {
				c[i] = (char)(s.charAt(i)+ 13);
				}
			}
			rot += c[i];
			
		}
		return rot;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		System.out.print(Rot13(s));
		
		// TODO Auto-generated method stub

	}

}
