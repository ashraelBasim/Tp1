package tp1;
import java.util.*;
public class Ex8 {
	    static int N = 4;
	    static int M = 4;
	    static int[] dx = {-1, 1, 0, 0};
	    static int[] dy = {0, 0, -1, 1};
	    public static boolean dfs(int[][] labyrinthe, int x, int y, List<String> chemin) {
	        if (x < 0 || x >= N || y < 0 || y >= M || labyrinthe[x][y] == 0) {
	            return false;
	        }
	        if (labyrinthe[x][y] == 2) {
	            chemin.add("(" + x + "," + y + ")");
	            return true;
	        }
	        labyrinthe[x][y] = 0;
	        for (int i = 0; i < 4; i++) {
	            int newX = x + dx[i];
	            int newY = y + dy[i];
	            if (dfs(labyrinthe, newX, newY, chemin)) {
	                chemin.add("(" + x + "," + y + ")");
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        int[][] labyrinthe = {
	            {1, 1, 0, 1},
	            {0, 1, 1, 0},
	            {1, 0, 1, 1},
	            {1, 1, 1, 2}
	        };
	        List<String> chemin = new ArrayList<>();
	        if (dfs(labyrinthe, 0, 0, chemin)) {
	            Collections.reverse(chemin);
	            System.out.println("Chemin trouvé: " + String.join(" → ", chemin));
	        } else {
	            System.out.println("Aucune solution trouvée.");
	        }
	    }
	}

