package masodik;

public class Konyv {
	private String cim;
	private String szerzo;
	private int megjelenes;
	private int ar;

	public Konyv(String cim, String szerzo, int megjelenes, int ar) {
		this.szerzo = szerzo;
		this.cim = cim;
		this.megjelenes = megjelenes;
		this.ar = ar;
	}

	public Konyv(String cim, String szerzo) {
		this(cim, szerzo, java.time.LocalDate.now().getYear(), 2500);
		
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	public String getCim() {
		return this.cim;
	}

	public void setSzerzo(String szerzo) {
		this.szerzo = szerzo;
	}

	public String getSzerzo() {
		return this.szerzo;
	}

	public void setMegjelenes(int megjelenes) {
		this.megjelenes = megjelenes;
	}

	public int getMegjelenes() {
		return this.megjelenes;
	}

	public void setAr(int ar) {
		this.ar = ar;
	}

	public int getAr() {
		return this.ar;
	}

	public void ArNoveles(int szazalek) { // százalékban kell megadni
		this.ar = this.ar + (this.ar / 100) * szazalek;
	}
	
	@Override
	public String toString() {
		return "Cim: " + this.cim + ", Szerzo: " + this.szerzo + ", Megjelenes: " + this.megjelenes + ", Ara: "
				+ this.ar + " Ft";
	}
}
