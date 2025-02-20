package tp1;
import java.util.*;
public class Ex9 {
	    static int N = 4;
	    static int M = 4;
	    static int[] dx = {-1, 1, 0, 0};
	    static int[] dy = {0, 0, -1, 1};
	    public static boolean estValide(int[][] labyrinthe, boolean[][] visite, int x, int y) {
	        return (x >= 0 && x < N && y >= 0 && y < M && labyrinthe[x][y] != 0 && !visite[x][y]);
	    }

	    public static int bfs(int[][] labyrinthe, int[] start, int[] exit) {
	        boolean[][] visite = new boolean[N][M];
	        Queue<int[]> queue = new LinkedList<>();
	        queue.add(new int[]{start[0], start[1], 0}); 
	        visite[start[0]][start[1]] = true;
	        while (!queue.isEmpty()) {
	            int[] point = queue.poll();
	            int x = point[0];
	            int y = point[1];
	            int distance = point[2];
	            if (x == exit[0] && y == exit[1]) {
	                return distance;
	            }
	            for (int i = 0; i < 4; i++) {
	                int newX = x + dx[i];
	                int newY = y + dy[i];
	                if (estValide(labyrinthe, visite, newX, newY)) {
	                    visite[newX][newY] = true;
	                    queue.add(new int[]{newX, newY, distance + 1});
	                }
	            }
	        }
	        return -1; 
	    }

	    public static void main(String[] args) {
	        int[][] labyrinthe = {
	            {1, 1, 0, 1},
	            {0, 1, 1, 0},
	            {1, 0, 1, 1},
	            {1, 1, 1, 2}
	        };
	        int[] start = {0, 0}; 
	        int[] exit = {3, 3}; 
	        int distance = bfs(labyrinthe, start, exit);
	        if (distance != -1) {
	            System.out.println("Le chemin le plus court a une longueur de " + distance);
	        } else {
	            System.out.println("Aucune solution trouvée.");
	        }
	    }
	}
