package bronze2;


import java.util.*;


public class a2864 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		String mina = "";
		String minb = "";
		String maxa = "";
		String maxb = "";
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == '6') {
				mina = mina + "5";
				System.out.print(mina+" ");
			}
			else {
				mina = mina + a.charAt(i);
				System.out.print(mina+" ");
			}
			if(a.charAt(i) == '5') {
				maxa = maxa + "6";
			}
			else {
				maxa = maxa + a.charAt(i);
			}
			
		}
		
		for(int i = 0; i < b.length(); i++) {
			if(b.charAt(i) == '6') {
				minb = minb + "5";
			}
			else {
				minb = minb + b.charAt(i);
			}
			if(b.charAt(i) == '5') {
				maxb = maxb + "6";
			}
			else {
				maxb = maxb + b.charAt(i);
			}
		}
		
		int max = Integer.parseInt(maxa) + Integer.parseInt(maxb);
		int min = Integer.parseInt(mina) + Integer.parseInt(minb);
		

		
		
		
		// TODO Auto-generated method stub

	}

}
