import java.util.*;


public class a2965 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt(); //b는 무조건 가운데 값 회전 후 가운데값을 b로 초기화시켜줘야함
		int c = sc.nextInt();
		
		if(b-a >= c-b) {
			System.out.print(b-a-1);
		}
		else {
			System.out.print(c-b-1);
		}
		
		
		// TODO Auto-generated method stub

	}

}
