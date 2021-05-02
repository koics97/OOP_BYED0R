package egyetem.run;

import java.util.Arrays;
import java.util.Comparator;

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
		
		for (SzervezetiEgyseg szervezetiEgyseg : sze) {
			System.out.println(szervezetiEgyseg);
		}
		
		Arrays.sort(sze,(a,b) -> a.getDolgozoiLetszam()-b.getDolgozoiLetszam());
		for (SzervezetiEgyseg szervezetiEgyseg : sze) {
			System.out.println(szervezetiEgyseg);
		}
		
		max(sze);
		System.out.println("Ossz hallgatoi letszam: " + osszletszam(sze));
		
		Arrays.sort(sze,Comparator.comparing(SzervezetiEgyseg::getNev));
		Comparator<SzervezetiEgyseg> c = new Comparator<SzervezetiEgyseg>() {

			@Override
			public int compare(SzervezetiEgyseg o1, SzervezetiEgyseg o2) {
				return o1.getNev().compareTo(o2.getNev());
			}
			
		};
		int index = Arrays.binarySearch(sze, new Kar(Kar.karok.MFK,0,0),c);
		System.out.println(index);
	}
	
	private static void max(SzervezetiEgyseg[] sze) {
		int index = 1;
		for (int i = 2; i < sze.length; i++) {
			if(sze[i].getEgyAlkalmazottraEsoMunkamennyiseg() > sze[index].getEgyAlkalmazottraEsoMunkamennyiseg()) {
				index = i;
			}
		}
		System.out.println(sze[index].getNev() + "-n a legmagasabb az egy oktatora juto hallgatoi letszam");
	}
	
	private static int osszletszam(SzervezetiEgyseg[] sze) {
		int ossz = 0;
		for (int i = 0; i < sze.length; i++) {
			if(sze[i] instanceof Kar) {
				ossz += ((Kar)(sze[i])).getHallgatoiLetszam();
			}
		}
		return ossz;
	}

}
