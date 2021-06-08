package class2;


import java.util.*;


public class a1475 {
	static int count = 0;
	
	static void addset(int[] set) {
		for(int i = 0; i < set.length; i++) {
			set[i]++;
		}
		count++;
	}


	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int set[] = new int[10];
		Stack<Integer> stack = new Stack<>();
		int n = sc.nextInt();
		while(n > 0) { //n의 각 자리의 수를 추출하여 스택에 추가
			stack.push(n%10);
			n /= 10;
		}
		addset(set);
		while(!stack.isEmpty()) { //추가해야할 조건 == 6과 9를 서로 대체재로 사용가능
			int ans = stack.pop();
					if(set[ans] == 0) {
						if(ans == 6 || ans == 9) { //ans가 6이나 9라면 (서로 대체재로 사용 가능한 수라면)
		
						if(ans == 6 && set[ans] == 0 && set[9] != 0) { //ans가 6이며 6이 없고 대체재로 사용가능한 9가 있다면
								set[9]--; //9를 사용
								continue;
							}
							else if(ans == 9 && set[ans] == 0 && set[6] != 0) { //ans가 9이며 9가 없고 대체재로 사용가능한 6이 있다면
								set[6]--; //6을 사용
								continue;
						}
		
						}
						addset(set);
						set[ans]--;
					}
					else {
						set[ans]--;
					}
		}
		System.out.print(count);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
