package egyetem;

public class Konyvtar extends SzervezetiEgyseg {
	private int konyvekSzama;
	
	
	public Konyvtar(int alkalmazottakSzama, int konyvekSzama) {
		super("Konyvtar",alkalmazottakSzama);
		this.konyvekSzama = konyvekSzama;
	}


	public int getKonyvekSzama() {
		return konyvekSzama;
	}


	public void setKonyvekSzama(int konyvekSzama) {
		this.konyvekSzama = konyvekSzama;
	}


	@Override
	public String toString() {
		return "Konyvtar [konyvek szama=" + konyvekSzama + "]";
	}


	@Override
	public double getEgyAlkalmazottraEsoMunkamennyiseg() {
		return (double)this.konyvekSzama/getDolgozoiLetszam();
	}
	
	
	
	
}
