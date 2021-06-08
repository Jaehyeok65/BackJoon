package bronze2;

import java.util.*;



public class a1348 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int n = sc.nextInt(); //시험장의 개수
		long a1[] = new long[n];
		for(int i = 0; i < n; i++) {
			a1[i] = sc.nextLong();
		}
		int b = sc.nextInt(); //총감독관이 감시할 수 있는 응시자 수
		int c = sc.nextInt(); //부감독관이 감시할 수 있는 응시자 수
		
		for(int i = 0; i < a1.length; i++) {
			a1[i] = a1[i] - b;
			count++;
			if(a1[i] > 0) {
				while(true) {
					a1[i] = a1[i] - c;
					count++;
					if(a1[i] <= 0) {
						break;
					}
					else {
						continue;
					}
				}
			}
			}
		System.out.print(count);
		}
	
	
		
		// TODO Auto-generated method stub

	}


