import java.util.*;


public class a2501 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 1 < n < 10000
		int k = sc.nextInt(); // 1 < k < n
		int count = 0; //n의 약수의 개수
		int y[] = new int[n]; //n의 약수를 참조하는 배열
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				y[count++] = i;
			}
		}
		if(count < k) {
			System.out.println(0);
		}
		else {
			System.out.print(y[k-1]);
		}
		// TODO Auto-generated method stub

	}

}
