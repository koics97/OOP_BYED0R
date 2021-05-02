package homework;

import java.time.LocalDate;

public class Book {
	private String title;
	private String author;
	private final int yearofPub;
	private int price;
	private int pages;

	public Book(String title, String author,int price, int pages) {
		this.author = author;
		this.title = title;
		if (price < 0) this.price = 0;
		else this.price = price;
		if (pages < 0) this.pages = 0;
		else this.pages = pages;
		this.yearofPub = LocalDate.now().getYear();
	}

	public Book(String title, String author) {
		this(title, author, 2500,100);

	}	

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return this.author;
	}

	public int getYearOfPublication() {
		return this.yearofPub;
	}

	public void setPrice(int price) {
		if (price < 1000) this.price = 1000;
		else this.price = price;
	}

	public int getPrice() {
		return this.price;
	}
	
	public void setPages(int pages) {
		if (pages < 0) return;
		else this.pages = pages;
	}
	
	public int getPages() {
		return this.pages;
	}
	

	public void increasePrice(int percentage) { // százalékban kell megadni
		if (percentage < 0) return;
		this.price = this.price + Math.round(((float)this.price / 100) * percentage);
	}

	@Override
	public String toString() {
		return "Cim: " + this.title + ", Szerzo: " + this.author + ", Megjelenes: " + this.yearofPub + ", Ara: "
				+ this.price + " Ft" + ", Oldalak szama: " + this.pages;
	}

	public static int comparePublicationDate(Book bookA,Book bookB) {
		if (bookA.yearofPub > bookB.yearofPub) {
			return 1;
		} else if (bookA.yearofPub < bookB.yearofPub) {
			return 2;
		}
		return 0;
	}
	
	public static Book getLonger(Book bookA, Book bookB) {
		if (bookA.getPages() > bookB.getPages()) return bookA;
		else if (bookA.getPages() < bookB.getPages()) return bookB;
		
		return bookA;
	}
	
	public boolean hasEvenPages() {
		if (this.getPages() % 2 == 0) return true;
		
		return false;
	}

}
