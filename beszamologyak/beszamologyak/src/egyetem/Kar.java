package egyetem;

public class Kar extends SzervezetiEgyseg {
	private String dekan;
	private int hallgatoiLetszam;
	public enum karok{
		GEIK,MAK,MFK,GTK,AJK;
	}
	
	public Kar(karok karnev, int dolgozoiLetszam, int hallgatoiLetszam) {
		super(karnev.toString(), dolgozoiLetszam);
		this.hallgatoiLetszam = hallgatoiLetszam;
		
		switch(karnev) {
			case GEIK:
				this.dekan = "Simenfalvi Zoltan";
				break;
			case MAK:
				this.dekan = "Palotas A.";
				break;
			case MFK:
				this.dekan = "Szucs P.";
				break;
			case GTK:
				this.dekan = "Somosi Mariann";
				break;
			case AJK:
				this.dekan = "Csak CS.";
				break;
		}
	}
	
	

	public Kar(karok karnev) {
		this(karnev,70,500);
	}




	public String getDekan() {
		return dekan;
	}



	public void setDekan(String dekan) {
		this.dekan = dekan;
	}



	public int getHallgatoiLetszam() {
		return hallgatoiLetszam;
	}



	public void setHallgatoiLetszam(int hallgatoiLetszam) {
		this.hallgatoiLetszam = hallgatoiLetszam;
	}
	
	
	
	@Override
	public String toString() {
		return "Kar [dekan=" + dekan + ", hallgatoi letszam=" + hallgatoiLetszam + "]";
	}



	@Override
	public double getEgyAlkalmazottraEsoMunkamennyiseg() {
		return (double)this.hallgatoiLetszam/getDolgozoiLetszam();
	}
	
}
