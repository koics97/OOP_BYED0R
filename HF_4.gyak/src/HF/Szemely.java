package HF;

public class Szemely {
	
	private String nev;
	private int suly;   //kilogramm
	private double magassag;   //meter
	
	public void setNev(String nev) {
		this.nev = nev;
	}
	
	public void setSuly(int suly) {
		this.suly = suly;
	}
	
	public String getNev() {
		return this.nev;
	}
	
	public int getSuly() {
		return this.suly;
	}
	
	public double getMagassag() {
		return this.magassag;
	}
	
	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}
	
	public double tti() {
		return this.suly/Math.pow(this.magassag,2);	
	}
	
	public String alkat() {
		if (this.tti() < 18.5) {
			return "sovany";
		}
		else if (this.tti() > 25) {
			return "kover";
		}
		else return "normal";
	}
	
	public String getAdatok() {
		return "Nev: "+this.nev+" suly: "+this.suly+" magassag: "+this.magassag+" tti: "+this.alkat();
	}

}
