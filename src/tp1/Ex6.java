package tp1;
public class Ex6 {
		public static void main(String[] args) {
	        int[][] tableau = {{1, 2, 3},{4, 5},{6, 7, 8, 9}};
	        calculerSommeLignes(tableau);
	    }
	    public static void calculerSommeLignes(int[][] tableau) {
	        for (int i = 0; i < tableau.length; i++) {
	            int somme = 0;
	            for (int valeur : tableau[i]) {
	                somme += valeur;
	            }
	            System.out.println("La somme de la ligne " + (i + 1) + " : " + somme);
	        }
	    }
	}
