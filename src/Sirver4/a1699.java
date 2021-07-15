package Sirver4;


import java.util.*;




public class a1699 {
	
	public static boolean getsqrt(int n) {
		Double dn = Math.sqrt(n);
		
		if(dn == dn.intValue()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i = N;
		int result = N;
		int ans = 0;
		while(true) {
			if(result == 0) {
				break;
			}
			if(getsqrt(i) == true) {
				result = result - i;
				ans++;
				i = result;
				continue;
			}
			i--;
		}
		System.out.print(ans);
		// TODO Auto-generated method stub

	}

}
