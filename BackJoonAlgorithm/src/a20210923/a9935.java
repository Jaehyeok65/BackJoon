package a20210923;


import java.util.*;


public class a9935 {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();   //맨처음에 입력받은 문자열
		String boom = sc.next();  //폭발문자열
		int len = boom.length();
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			stack.push(c);
			
			if(stack.size() >= len) {   // 스택에 넣어져 있는 글자가 폭발글자수와 크거나 같다면 비교가 가능
				boolean flag = true;
				
				for(int j = 0; j < len; j++) {
					if(stack.get(stack.size() - len + j) != boom.charAt(j)) {  //폭발문자와 같지 않다면
						flag = false;   //멈춤
						break;
					}
				}
				
				if(flag) {
					for(int j = 0; j < len; j++) {
						stack.pop();
					}
				}
				
			}
		}
		
		if(stack.isEmpty()) {
			sb.append("FRULA");
		}
		else {
			for(Character c : stack) {
				sb.append(c);
			}
		}
		System.out.print(sb.toString());
		
		
		
		
		// TODO Auto-generated method stub

	}

}
