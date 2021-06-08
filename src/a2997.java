import java.util.*;


public class a2997 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int arr[] = new int[3];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); //오름차순으로 정렬
		 //양의 정수인 경우
		if(arr[2] - arr[1] == arr[1] - arr[0]) {
			System.out.print(arr[2]+(arr[2]-arr[1]));
		}
		else {
			System.out.print(arr[2] + arr[0] - arr[1]);
		}
		
		
		// TODO Auto-generated method stub

	}

}
