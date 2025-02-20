package tp1;
public class Ex1 {
		public static void main(String[] args) {
			int[] numbers = {1,2,3,1,2};
	        int unique = 0;
	        for (int e : numbers) {
	            unique ^= e;  
	        }
	        if (unique != 0) {
	            System.out.println("Le nombre unique est: " + unique);
	        } 
	    }
	}
