package class3;
import java.util.*;

public class a4796 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			int L = sc.nextInt();
			int P = sc.nextInt();
			int V = sc.nextInt();
			if(L == 0) //종료 조건 0 0 0이 입력되면 반복 종료
				break;
			int result = 0;
			for(int i = 0; i < V;) {
				result += L;
				i += L;
				if(i >= V) {
					result = result - (i - V);
				}
				i = i + (P - L);
			}
			 System.out.println("Case "+count+": "+result);
			 count++;
		}
	
		
		
		// TODO Auto-generated method stub

	}

}
