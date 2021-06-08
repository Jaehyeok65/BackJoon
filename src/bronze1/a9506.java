package bronze1;

import java.util.*;


public class a9506 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(true) {
			arr.clear();
			int n = sc.nextInt();
			int sum = 0; //약수들의 합을 저장할 변수
			if(n == -1) break;
			for(int i = 1; i < n; i++) {
				if(n % i == 0) {
					sum += i;
					arr.add(i);
				}
			}
			if(n == sum) {
				System.out.print(n+" = ");
				for(int i = 0; i < arr.size(); i++) {
					if(i != arr.size() -1) {
					System.out.print(arr.get(i)+" + ");
					}
					else if(i == arr.size()-1) {
						System.out.print(arr.get(i));
					}
				}
				System.out.println("");
			}
			else {
				System.out.println(n+" is NOT perfect.");
			}
			
		}
		// TODO Auto-generated method stub

	}

}
