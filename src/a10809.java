import java.util.*;


public class a10809 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int arr[] = new int[26];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		} //모조리 -1로 초기화
		
		for(int i = 0; i < s.length(); i++) {
			int a = s.charAt(i); // a = b이고 b = 2
			for(int j = 'a'; j <= 'z'; j++) {
				if(a == j && arr[j-97] == -1) {
					arr[j-97] = i;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		// TODO Auto-generated method stub

	}

}
