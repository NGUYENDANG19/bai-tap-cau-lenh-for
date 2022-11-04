package basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    
	    int n,n1, reversed = 0;
	    System.out.println("\n\nNhap vao so can dao nguoc: ");
	    n = sc.nextInt();
	  
	    n1 = n;
	    for(;n != 0; n /= 10) {
	    	int digit = n % 10;
	    	reversed = reversed * 10 + digit;
	    }
	    if(n1==reversed)	{
			  System.out.println("la so Polinom");
		  }else	{
			  System.out.println("ko phai so Polinom");
		  }
	}
	
	

}
