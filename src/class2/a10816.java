package class2;


import java.io.*;
import java.util.*;


public class a10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		while(n --> 0) {
			
			list.add(Integer.parseInt(st.nextToken()));
			
		}
		Collections.sort(list);
		int start = list.size()/2;
		int m = Integer.parseInt(br.readLine());
		int result[] = new int[m];
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
		for(int j = 0; j < m; j++) {
			
			int ans = Integer.parseInt(st1.nextToken());
			if(ans >= list.get(start)) { //구하고자 하는 값이 중간값보다 크거나 같다면
				for(int i = start; i < list.size(); i++) {
					if(ans == list.get(i)) {
						result[j]++;
					}
				}
			}
			else {
				for(int i = 0; i < start; i++ ) {
					if(ans == list.get(i)) {
						result[j]++;
					}
				}
			}
			sb.append(result[j]+" ");
		}
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
