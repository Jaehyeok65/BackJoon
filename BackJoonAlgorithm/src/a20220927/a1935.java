package a20220927;

import java.util.*;
import java.io.*;



public class a1935 {
	
	static int N;
	static String s;
	static Stack<Double> stack = new Stack<>();
	static double number[];
	
	public static double result() {
		      for (int i = 0; i != s.length(); ++i) {
		    	  int code = (int)s.charAt(i);
		         // Determine if current element is digit or not
		         if (code >= 65 && code <= 90) { 
		        	
		            stack.push(number[code-65]); //대상이 숫자라면 스택에 집어넣음
		         } else { //숫자가 아니라면
		            double tempResult = 0;
		            double temp;

		            switch (s.charAt(i)) {
		            case '+':
		               temp = stack.pop();
		               tempResult = stack.pop() + temp;
		               break;

		            case '-':
		               temp = stack.pop();
		               tempResult = stack.pop() - temp;
		               break;

		            case '*':
		               temp = stack.pop();
		               tempResult = stack.pop() * temp;
		               break;

		            case '/':
		               temp = stack.pop();
		               tempResult = stack.pop() / temp;
		               break;
		            
		            case '^' :
		            	temp = stack.pop();
		            	tempResult = Math.pow(stack.pop(), temp);
		            	break;
		            }
		            stack.push(tempResult);
		         }
		      }
		      return stack.pop();
		   }
	
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		number = new double[N];
		s = br.readLine();
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			number[i] = num;
		}
		System.out.printf("%.2f",result());
		
		// TODO Auto-generated method stub

	}

}


