package elso;

public class Alkalmazott {
	private String nev;
	private int fizetes;
	
	
	
	public Alkalmazott (String nev, int fizetes) {
		this.nev = nev;
		this.fizetes = fizetes;
	}
	
	public Alkalmazott (String nev) {
		this(nev, 250000);
		
		
	}
	
	
	public void FizetesNoveles(int ertek) {
		this.fizetes += ertek;
	}
	
	@Override
	public String toString()
	{
		return "Alkalmazott{Nev: "+this.nev+", Fizetes: "+this.fizetes+"}";
	}
	
	public void setNev(String nev) {
		this.nev = nev;
	}
	
	public void setFizetes(int fizetes)
	{
		this.fizetes = fizetes;
	}
	
	public String getNev()
	{
		return this.nev;
	}
	
	public int getFizetes() {
		return this.fizetes;
	}
	
	public boolean FizetesHatar(int also, int felso) {
		if (this.fizetes >= also && this.fizetes <= felso) {
			return true;
		}
		else return false;
	}
}
