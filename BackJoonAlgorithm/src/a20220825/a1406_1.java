package a20220825;

import java.util.*;
import java.io.*;



public class a1406_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<String> left = new Stack<>();
		Stack<String> right = new Stack<>();
		
		String first = br.readLine();
		
		for(int i = 0; i < first.length(); i++){
            left.push(first.substring(i,i+1));
        }


		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			  switch (s){
              case "L":
                  if(left.empty()) break;
                  right.push(left.pop());
                  break;
              case "D":
                  if(right.empty()) break;
                  left.push(right.pop());
                  break;
              case "B":
                  if(left.empty()) break;
                  left.pop();
                  break;
              case "P":
                  left.push(st.nextToken());
                  break;
			  }
		
		}
		
		while(!left.isEmpty()) {
			right.push(left.pop());
		}
		
		while(!right.isEmpty()) {
			sb.append(right.pop());
		}
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
