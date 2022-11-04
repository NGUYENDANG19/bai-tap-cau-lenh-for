package basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n : ");
		
		int n = sc.nextInt();
		int tong = 0;
		
		for (int i = 0; i<n; i++)	{
			
			
			if(i%3==0)	{
				tong += i;
			}
		}
		System.out.println("tong = "+ tong);
		
	}

}
