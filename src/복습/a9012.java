package 복습;


import java.util.*;


public class a9012 {
	
	static Stack<Character> stack = new Stack<>();
	static int N;
	
	static boolean result(String s) {
		boolean flag = false; //한번이라도 입력이 되었는지를 확인
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				stack.push(s.charAt(i)); // 왼쪽괄호 ( 이면 스택에 넣음
				flag = true;
			}
			else if(s.charAt(i) == ')') {
				if(!stack.empty()) { //스택이 비어있지 않으면 괄호를 팝
					stack.pop();
				}
				else { //오른쪽 괄호를 만났는데 스택이 비어있으면 vps가 아님
					return false;
				}
			}
		}
		if(!stack.empty()) { //반복이 다 끝났는데 스택이 비어있지 않으면 vps가 아님
			return false;
		}
		else if(!flag && stack.empty()){ 
			return false;
		}
		else { //괄호가 한번이라도 입력이 되었고 스택이 비어있으면 완벽한 vps
			return true;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		N = sc.nextInt();
		
		while(N --> 0) {
			String s = sc.next();
			boolean ans = result(s);
			stack.clear(); //다음에 미칠 영향을 생각해서 스택을 비움
			if(ans) {
				sb.append("YES"+"\n");
			}
			else {
				sb.append("NO"+"\n");
			}
		}
		System.out.println(sb.toString());
		
		
		// TODO Auto-generated method stub

	}

}
