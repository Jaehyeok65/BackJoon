import java.util.*;



public class a3058 {
	
	public static int min(int a, int b) {
		if(a > b) { //둘 중 작은 값 리턴
			return b;
		}
		else
			return a;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int num[] = new int[7];
		int count = 0;
		int sum;
		int min;
		for(int i = 0; i < t; i++) {
			sum = 0;
			min = 100;
			for(int j = 0; j < num.length; j++) {
			num[j] = sc.nextInt();
			
			if(num[j] % 2 == 0) { //짝수이면
				sum += num[j];
				min = min(min,num[j]);
			}
			}
			System.out.print(sum+" "+min);
			System.out.println("");
			
		}
		// TODO Auto-generated method stub

	}

}
