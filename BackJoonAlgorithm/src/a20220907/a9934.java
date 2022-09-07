package a20220907;



import java.util.*;


import java.io.*;


public class a9934 {
	
	static List<String>[] nodeList;
	
	
	public static void divide(String result, int height) { //높이에 따라서 출력을 할 수 있다면?
		if(height == 0) {
			return;
		}
		int num = result.length() / 2;
		
		//list.add(new Node(result.substring(num,num+1),height));
		nodeList[height].add(result.substring(num,num+1));
		
		divide(result.substring(0, num), height - 1); //왼쪽 서브트리
		divide(result.substring(num+1), height - 1); //오른쪽 서브트리
	}
	
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		int size = (int)Math.pow(2, k)-1;
		String result = "";
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			result += st.nextToken();
		}
		
		int h = (int)Math.ceil(Math.log(size)/Math.log(2))+1;
		nodeList = new ArrayList[h];
		for(int i=0; i< h; i++) {
			nodeList[i] = new ArrayList<>();
		}
		
		divide(result,k);
		
		for(int i=h-1; i>0; i--) {
			for(String nd : nodeList[i]) {
				System.out.print(nd+" ");
			}
			System.out.println();
		}
		
	
		
		
		
		// TODO Auto-generated method stub

	}

}






