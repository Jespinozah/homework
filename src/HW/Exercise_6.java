package HW;

public class Exercise_6 {
	public static void main(String[] args) {
		
		Exercise_6 A = new Exercise_6();
		A.Numbers();
	}
	 
	public void Numbers() {
		final int Numbers_perline = 10;	
		int count = 0;	

		for (int i = 100; i <= 1000; i++) {
			
			if (i % 5 == 0 && i % 6 == 0) {
				count++;	
				if (count % Numbers_perline == 0) 
					System.out.println(i);
				else
					System.out.print(i + " ");		
			}
		}
	}
}
