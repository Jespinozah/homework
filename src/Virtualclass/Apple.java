package Virtualclass;



public class Apple implements Comparable<Apple>{
 

	private int weight=12;
	
	@Override
	public int compareTo(Apple other) {
		if(this.weight<other.weight) {
		return -1;
	    }
		if(this.weight==other.weight) {
		return 0;	
		}	
		return 1;
	}

		public static void main(String[] args){
			
			Apple newApple= new Apple();
			System.out.print("Weight comparison is:"+ newApple.compareTo(new Apple().weight=5));
		}

		private String compareTo(int i) {
			// TODO Auto-generated method stub
			return null;
		}}
		

