package HW;

public class class2 {

	public static void main(String[] args) {
		int[] a = {1, 7, 5, 6, 4, 14, 11};
		int maxValue = a[0];
		for (int i = 0; i < a.length; i++) {
		   
			//if (a[i] > a[i + 1]) {
		      //  a[i + 1] = a[i + 1] * 2; {
		       
		    if(a[i] > maxValue){
		    maxValue = a[i];   
		      //return maxValue;
		        
		    }
		    
		    System.out.println("the elemente "+a[i]);
		}
		
	System.out.println("the elemente max "+ maxValue);
	}
}

