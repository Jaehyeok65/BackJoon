package class2;


import java.util.*;


public class a1789 {
	
	public static void main(String[] args) { //수를 가장 많이 써서 만들 수 있는 최대값.
		
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long sum = 0;
		long count = 0;
		for(int i = 1; ; i++) {
			if(sum > n) {
				break;
			}
			sum += i;
			count = i;
		}
		System.out.print(count-1);
		// TODO Auto-generated method stub

	}

}
