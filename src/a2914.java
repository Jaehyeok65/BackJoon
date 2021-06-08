import java.util.*;


public class a2914 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      int N = sc.nextInt();
	      int K = sc.nextInt();
	      
	      int M = (int)(Math.log10(N)+1); // 자릿수
	      int a = (int)Math.pow(10, M); //10^M승
	      
	      int arr[] = new int[M+1];
	      int arrcnt = 0;
	      
	      while(a>=1) {
	      int mok = N/a;
	      N = N%a;
	      a = a/10;
	      arr[arrcnt] = mok;
	      arrcnt++;
	      
	      }
	      for(int i =0; i <arr.length; i++)
	      {
	    	  System.out.print(arr[i] +" ");
	      }

	}

}
