import java.util.*;


public class a1065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		int result = 0; //한수의 개수 (정답을 출력할 변수)
		int arr[] = new int[4];
		if(n < 100) { //n이 두자리까지는 무조건 등차수열이므로 한수
			result = n;
		}
		else { //n이 3자리 이상인 경우 자리수를 확인하여 등차수열을 이루는지 확인

			for(int i = 100; i <= n; i++) {
				int j = i;
				while(j > 0) {
					stack.push(j % 10);
					j = j / 10;
				}
				for(int k = 0; k < stack.size(); k++) {
					arr[k] = stack.pop();
				}
				if(arr[2] - arr[1] == arr[1] - arr[0]) {
					result++;
				}
				
			}
			result += 99;
		}
		System.out.print(result);
		//

	}

}
