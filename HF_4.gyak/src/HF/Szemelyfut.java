package HF;

import java.util.Scanner;

public class Szemelyfut {

	public static void main(String[] args) {
		Szemely person = new Szemely();
		beolvas(person);
		System.out.println(person.getAdatok());

	}

	public static void beolvas(Szemely person) {

		Scanner input = new Scanner(System.in);
		System.out.println("Kerek egy nevet, suly es magassagot! ");
		person.setNev(input.nextLine());
		person.setSuly(input.nextInt());
		person.setMagassag(input.nextDouble());
		input.close();

	}

}
