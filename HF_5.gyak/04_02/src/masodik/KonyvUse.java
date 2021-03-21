package masodik;

public class KonyvUse {

	public static void main(String[] args) {
		Konyv book = new Konyv("Harry Potter and the Deathly Hallows","J.K Rowling");
		Konyv book2 = new Konyv("Legy jo mindhalalig","Moricz Zsigmond",1920,1500);
		
	/*	book.setCim("Legy jo mindhalalig");
		book.setSzerzo("Moricz Zsigmond");
		book.setMegjelenes(1920);
		book.setAr(1200); */
		
		System.out.println(book);
		
		book.ArNoveles(50); //százalékban kell megadni
		System.out.println(book);
		
		
		System.out.println(book2);
		book2.ArNoveles(30);
		System.out.println(book2);

	}

}
