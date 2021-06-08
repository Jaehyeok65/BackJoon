import java.util.*;


public class a1284 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int length;
		int num;
		while(true) {
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}
			length = 1;
			while(n > 0) {
				num = n % 10;
				if(num == 0) {
					length = length + 4;
				}
				else if (num == 1) {
					length = length + 2;
				}
				else {
					length = length + 3;
				}
				n /= 10;
				length++;
			}
			System.out.println(length);
		}
		// TODO Auto-generated method stub

	}

}
