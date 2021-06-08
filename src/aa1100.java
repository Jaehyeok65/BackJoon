import java.util.*;


public class aa1100 {

	public static void main(String[] args) {
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		char array [][] = new char[8][8];
		String str;
		
		for(int i = 0; i < 8; i++)
		{
			str = sc.nextLine();
			for(int j = 0; j < 8; j++)
			{
				array[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j <8; j++)
			{
				if(i % 2 == 0 && j % 2 == 0) //첫번째 칸이 하얀색일 경우 하얀색 칸
				{
					if(array[i][j] == 'F')
					{
						cnt++;
					}
				}
				if(i % 2 == 1 && j % 2 == 1)
				{
					if(array[i][j] == 'F')
					{
						cnt++;
					}
				}
			}
		}
		System.out.print(cnt);
		
		
		// TODO Auto-generated method stub

	}

}
