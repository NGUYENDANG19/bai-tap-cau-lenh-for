package bacsic.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("cac so co tong chia het cho 3 la : ");
		
		for (int i = 100; i <= 999; i++) {
			
			if (i % 3 != 0) {
				continue;
			}
				
			System.out.println(i);
	}

}
}
