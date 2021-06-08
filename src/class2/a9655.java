package class2;


import java.util.*;


public class a9655 {
	static int count = 0;
	
	public static int three(int n) {
		n -= 3;
		count++;
		return n;
	}
	
	public static int one(int n) {
		n -= 1;
		count++;
		return n;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n > 0) {
			if(n-3 == 4) {
				n = three(n);
			}
			else if(n-1 == 4) {
				n = one(n);
			}
			else {
				n = three(n);
			}
		}
		if(count % 2 == 1) {
			System.out.print("SK");
		}
		else {
			System.out.print("CY");
		}
		
		// TODO Auto-generated method stub

	}

}
