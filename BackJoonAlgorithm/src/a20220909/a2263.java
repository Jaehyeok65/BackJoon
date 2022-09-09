package a20220909;


import java.util.*;
import java.io.*;



public class a2263 {
	
	static int[] postorder;
	static int[] inorder;
	static StringBuilder sb = new StringBuilder();
	static int n;
	
	
	
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		inorder = new int[n+1];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			inorder[i] = Integer.parseInt(st1.nextToken());
		}
		
		postorder = new int[n+1];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			postorder[i] = Integer.parseInt(st2.nextToken());
		}
		
		divide(1,n,1,n);
		System.out.print(sb.toString());
		
		
		
	
		
		
		// TODO Auto-generated method stub

	}
	
	static void divide(int is, int ie, int ps, int pe) {
		if(ie < is || pe < ps) {
			return;
		}
		int index = 0;
		int root = postorder[pe]; //루트노드는 후위순회의 마지막 노드이므로
		sb.append(root + " ");
		
		for(int i = 1; i <= n; i++) { //루트노드의 인덱스를 찾음 
			if(inorder[i] == root) { //루트노드 기준으로 중위순회의 왼쪽은 왼쪽 서브트리, 중위순회의 오른쪽은 오른쪽 서브트리이므로
				index = i;
				break;
			}
		}
		//index = inIdx[root];
		
		int left = index - is;
		
		divide(is,index-1,ps,ps+left-1); //왼쪽 서브트리 분할
		divide(index+1,ie,ps+left,pe-1); //오른쪽 서브트리 분할
	}
	

}


