package egyetem;

public abstract class SzervezetiEgyseg {
	private String nev;
	private int dolgozoiLetszam;
	
	public SzervezetiEgyseg(String nev, int dolgozoiLetszam) {
		this.nev = nev;
		this.dolgozoiLetszam = dolgozoiLetszam;
	}

	@Override
	public String toString() {
		return "SzervezetiEgyseg [nev=" + nev + ", dolgozoiLetszam=" + dolgozoiLetszam + "]";
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getDolgozoiLetszam() {
		return dolgozoiLetszam;
	}

	public void setDolgozoiLetszam(int dolgozoiLetszam) {
		this.dolgozoiLetszam = dolgozoiLetszam;
	}
	
	
	public abstract double getEgyAlkalmazottraEsoMunkamennyiseg();

}
