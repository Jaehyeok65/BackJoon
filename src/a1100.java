import java.util.*;


public class a1100 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		int m = sc.nextInt(); 
		
		int size = n*m; //초콜릿의 크기
		// 정답  더이상 쪼개 질 수 없을 때 까지 쪼갠다
		int count = 0;
		for(int i = 0; i < size-1; i++)
		{
			count++;
		}
		System.out.print(count);
			

		
		
		// TODO Auto-generated method stub

	}

}
