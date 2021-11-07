package a20211107;

public class program1 {
	
	

	public static void main(String[] args) {
		
		
		String s = "one4seveneightnine";
		String s2[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		for(int i = 0; i < s2.length; i++) {
			s = s.replaceAll(s2[i], String.valueOf(i));
		}
		System.out.print(s);
		// TODO Auto-generated method stub

	}

}
