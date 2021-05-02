package egyetem.run;

import egyetem.*;
import egyetem.Kar.karok;


public class EgyetemRunning {

	public static void main(String[] args) {
		SzervezetiEgyseg[] sze = new SzervezetiEgyseg[5];
		
		sze[0] = new Konyvtar(30,100000);
		sze[1] = new Kar(karok.MFK);
		sze[2] = new Kar(karok.GEIK,150,1800);
		sze[3] = new Kar(karok.GTK,130,1200);
		sze[4] = new Kar(karok.AJK,100,1000);


	}
	
	
	/*private void rendez(SzervezetiEgyseg[] sze) {
		Comparator c = new Comparator();
	}*/

}
