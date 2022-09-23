package a20220923;

import java.util.*;
import java.io.*;


public class a1918 {
	
	public static int precedence(char c){
        if (c=='(') return 0;
        if (c=='+' || c=='-') return 1;
        else return 2;
    }
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>(); // 연산자를 저장할 스택
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
		      char c = s.charAt(i);
	            if (c>='A' && c<='Z'){
	                //연산자가 아닌 경우엔 출력
	                sb.append(c);
	            } else if (c==')'){
	                //(가 나올때까지 출력
	                while (!stack.isEmpty()){
	                    char tmp = stack.pop();
	                    if (tmp=='(') break;
	                    sb.append(tmp);
	                }
	            } else if (c=='('){//피연산자가 아닐때
	                //(는 무조건 스텍에 집어넣음
	                stack.push(c);
	            } else {
	                //연산자 우선순위가 더 큰경우에만 스텍에 집어넣기
	                //우선순위가 같거나 낮은경우 우선 스텍에 있는 연산자 전부 출력 후 집어넣기
	                while (!stack.isEmpty() && precedence(stack.peek())>=precedence(c)){
	                    sb.append(stack.pop());
	                }
	                stack.push(c);
	            }
			
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
