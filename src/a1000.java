import java.util.*;


public class a1000 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0; //배열의 크기
		int n = sc.nextInt();
		int m = sc.nextInt(); 
		size = n*m; //배열의 크기
		int sum = 0; //구하고자 하는 합
		int array[][] = new int[n][m];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; i++)
			{
				array[i][j] = sc.nextInt();
			}
		}
		int k = sc.nextInt(); //합을 구할 부분의 개수
		
		for(int a = 0; a < k; a++)
		{
			int i = sc.nextInt();
			int j = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int b = 0; b < size; b++)
			{
			}
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
