package a202220908;


import java.util.*;
import java.io.*;



public class a1052 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //물병의 수
		int k = Integer.parseInt(st.nextToken()); //k개를 넘지 않는 비어있지 않은 물병
		
		int ans = 0;
        if (n <= k)
            ans = 0;

        else {
            int r = 0;
            while (true) {
                int cnt = 0;
                int num = n;
                while (num != 0) {
                    if (num % 2 == 1)
                        cnt++;
                    num = num / 2;
                }

                if(cnt <= k) {
                    break;
                }
                r++;
                n++;
            }
            ans = r;
        }
        System.out.print(ans);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
