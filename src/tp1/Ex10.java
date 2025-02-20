package tp1;
import java.util.*;
public class Ex10 {
	    static int[] dx = {-2, 2, 0, 0};
	    static int[] dy = {0, 0, -2, 2};
	    static int N = 5; 
	    static int M = 5; 
	    public static int[][] genererLabyrinthe(int n, int m) {
	        int[][] labyrinthe = new int[n][m];
	      
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                labyrinthe[i][j] = 0;
	            }
	        }

	        List<int[]> murs = new ArrayList<>();

	        int x = 1, y = 1; 
	        labyrinthe[x][y] = 1; 
	        murs.add(new int[]{x, y});	    
	        Random rand = new Random();

	        while (!murs.isEmpty()) {
	            int index = rand.nextInt(murs.size());
	            int[] mur = murs.remove(index);
	            x = mur[0];
	            y = mur[1];
	            for (int i = 0; i < 4; i++) {
	                int nx = x + dx[i];
	                int ny = y + dy[i];
	                if (nx > 0 && nx < n - 1 && ny > 0 && ny < m - 1 && labyrinthe[nx][ny] == 0) {
	                    labyrinthe[nx][ny] = 1;  
	                    labyrinthe[(x + nx) / 2][(y + ny) / 2] = 1;  
	                    murs.add(new int[]{nx, ny});  
	                    break;
	                }
	            }
	        }

	        
	        labyrinthe[n - 2][m - 2] = 2; 
	        
	        return labyrinthe;
	    }

	    public static void afficherLabyrinthe(int[][] labyrinthe) {
	        for (int i = 0; i < labyrinthe.length; i++) {
	            for (int j = 0; j < labyrinthe[i].length; j++) {
	                if (labyrinthe[i][j] == 0) {
	                    System.out.print("0 ");
	                } else if (labyrinthe[i][j] == 1) {
	                    System.out.print("1 "); 
	                } else if (labyrinthe[i][j] == 2) {
	                    System.out.print("2 "); 
	                }
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        int[][] labyrinthe = genererLabyrinthe(N, M);

	        afficherLabyrinthe(labyrinthe);
	    }
	}
