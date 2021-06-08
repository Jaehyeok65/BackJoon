
import java.util.*;


public class a1712 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //고정 비용
		int b = sc.nextInt(); //가변 비용
		int c = sc.nextInt(); //판매 비용 고정 + 가변 < 판매
		long count = 0; //판매 개수
		boolean sales = false;
		while(true) {
			if(b >= c) {
				count = -1;
				break;
			}
			if((c-b)*++count > a) {
				break;
			}
		}
			System.out.println(count);
	
		// TODO Auto-generated method stub

	}

}
