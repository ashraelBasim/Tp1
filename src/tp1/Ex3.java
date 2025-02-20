package tp1;
	public class Ex3 {
		public static void main(String[] args) {

			int numbers[] = { 3, 8, 5, 2, 4, 7 };
			System.out.print("Entrée : ");
			Afficher(numbers);

			int index = 0;
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] % 2 == 0) {
					int temp = numbers[i];
					numbers[i] = numbers[index];
					numbers[index] = temp;
					index++; 
				}
			}
			System.out.println();
			System.out.print("Sortie : ");
			Afficher(numbers);
		}

		public static void Afficher(int tab[]) {
			System.out.print("[");
			for (int i = 0; i < tab.length; i++) {
				System.out.print(tab[i]);
				if (i < tab.length - 1) {
					System.out.print(",");
				}
			}
			System.out.print("]");
		}
	}
