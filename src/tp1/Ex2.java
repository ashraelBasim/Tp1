package tp1;
import java.util.Scanner;
public class Ex2 {
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				int[] numbers = { 1, 4, 6, 2, 3, 5 };
				System.out.print("Somme Cible : ");
				int sommeCible = sc.nextInt();
				System.out.println("Couples des entiers tels que la somme est : "+sommeCible);
				for (int i = 0; i < numbers.length; i++) {
					for (int j = i+1; j < numbers.length; j++) {
						if(numbers[i] + numbers[j] == sommeCible)
							System.out.println("("+numbers[i]+","+numbers[j]+")");
					}
				}
			}
		}
	}
