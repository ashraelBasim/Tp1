package tp1;

public class Ex5 {
		public static void main(String[] args) {
	        int[][] tableau = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        if (estPermutation(tableau)) {
	            System.out.println("C'est une permutation.");
	        } else {
	            System.out.println("Ce n'est pas une permutation.");
	        }
	    }
	    public static boolean estPermutation(int[][] tableau) {
	        int n = tableau.length;
	        boolean[] presente = new boolean[n * n + 1];
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                int valeur = tableau[i][j];
	                if (valeur < 1 || valeur > n * n || presente[valeur]) {
	                    return false;
	                }
	                presente[valeur] = true;
	            }
	        }
	        return true;
	    }
	}
