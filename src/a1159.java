import java.util.*;


public class a1159 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int num = sc.nextInt();
		int cnt = 0; //선발할 수 있는 경우를 확인하기 위한 정수
		int resist;
		char firstname[] = new char[num]; //첫글자들을 저장해놓은 배열
		char printname[] = new char[num]; //글자를 출력하기 위한 배열
		for(int i = 0; i < num; i++)
		{
			name = sc.nextLine();
			firstname[i] = name.charAt(0);
		}
		for(int i = 0; i < firstname.length; i++)
		{
			for(int j = 0; j < firstname.length; j++)
			{
				if(firstname[i] == firstname[j])
				{
					cnt++;
					if(cnt >= 5) 
					{
						printname[i] = firstname[i]; //첫글자를 출력하기 위한 배열에 저장 
					}
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
