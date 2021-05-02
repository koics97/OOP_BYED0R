package homework;

import java.util.Scanner;


public class Homework {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Kerek egy szamot 1 es 10 kozott!");
			
			n = sc.nextInt();
			if (n < 1 || n > 10) System.out.println("Nem jo!");
			
		}while (n < 1 || n > 10);
		
		Book[] book = new Book[n];
		
		for (int i = 0; i < n; i++) {
			String title = sc.nextLine();
			String author = sc.nextLine();
			int price = sc.nextInt();
			int pages = sc.nextInt();
			
			book[i] = new Book(title,author,price,pages);
		}
		sc.close();

	}


}
