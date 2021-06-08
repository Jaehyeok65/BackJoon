import java.util.*;

public class a3003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int white[] = new int[6]; 
		for(int i = 0; i < white.length; i++)
		{
			white[i] = sc.nextInt(); //흰색체스개수를 입력받음
		}
		int white1[] = {1,1,2,2,2,8};
		int white2[] = new int[6];
		for(int i = 0; i < white.length; i++)
		{
			white2[i] = white1[i] - white[i];
		}
		for(int i = 0; i < white.length; i++)
		{
			System.out.print(white2[i] + " ");
		}
		// TODO Auto-generated method stub

	}

}
