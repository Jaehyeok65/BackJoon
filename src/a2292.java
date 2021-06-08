import java.util.*;


public class a2292 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int room = 1; //두번째룸 마지막이 7 세번재룸 마지막이 19 네번재룸 마지막이 37 다섯번째룸 마지막이 61
		int i = 1;
		int j = 1;
		
		while (i < n) {
			i = i + (j++) * 6;
			room++;
		}
		System.out.println(room);
		
		
		// TODO Auto-generated method stub

	}

}
