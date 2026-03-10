package Tcs_imp;

public class Reverse {
	
	public static void main(String[] args) {
		
		int num =143;
	    int rev =0;
		
		while(num!=0)
		{
			
			int ld = num%10;
			 rev = rev*10+ld;
			 num=num/10;
		
		}
		
		System.out.println(rev);
	}

}
