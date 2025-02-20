package tp1;
	public class Ex4 {
		public static int[] Somme(int tab[][]) {
			int []somme = new int[tab.length];
			for (int i = 0; i < tab.length; i++) {
				somme[i] = 0;
				for (int j = 0; j < tab[i].length; j++) {
					somme[i] += tab[i][j];
				}
			}
			return somme;
		}
		public static void main(String args []) {
			int tab[][]= {{-2,1,-3,4},{-1,2,1,-5},{4,-1,2,1}};
			System.out.println("Tableau des tableaux :");
			for(int i=0;i<tab.length;i++) {
				for(int j=0;j<tab[i].length;j++) {
					System.out.print(tab[i][j]);
					if(i < tab.length)
						System.out.print("     ");
				}
				System.out.println();
			}
			int sommes[] = Somme(tab);
			int max=0,maxIndex=0;
			for (int i = 0; i < sommes.length; i++) {
				if(sommes[i]>max) {
					max=sommes[i];
					maxIndex=i;
				}
			}
			System.out.print("Sous-tableau maximal : [");
			for (int i = 0; i < tab[maxIndex].length; i++) {
				System.out.print(tab[maxIndex][i]);
				if(i < tab.length)
					System.out.print(" ");
			}
			System.out.print("], Somme : "+max);
		}
	}
