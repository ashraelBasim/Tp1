package tp1;
public class Ex7 {
		public static void main(String[] args) {
	        int[][] tableau = {{2, 5},{1, 2, 3, 4},{1, 1, 3}};
	        trouverLigneSommeMax(tableau);
	    }
	    public static void trouverLigneSommeMax(int[][] tableau) {
	        int sommeMax = Integer.MIN_VALUE;
	        int ligneMax = -1;
	        for (int i = 0; i < tableau.length; i++) {
	            int somme = 0;
	            for (int valeur : tableau[i]) {
	                somme += valeur;
	            }
	            if (somme > sommeMax) {
	                sommeMax = somme;
	                ligneMax = i + 1;
	            }
	        }
	        System.out.println("La ligne avec la plus grande somme est la ligne " + ligneMax + " avec une somme de " + sommeMax + ".");
	    }
	}