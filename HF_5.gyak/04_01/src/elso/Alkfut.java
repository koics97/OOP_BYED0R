package elso;

public class Alkfut {

	public static void main(String[] args) {
		Alkalmazott alk = new Alkalmazott("Tamas",210000);
		Alkalmazott alk2 = new Alkalmazott("Zsolt");
		
		
		System.out.println(alk2);
		
		
		System.out.println(alk);
		alk.FizetesNoveles(10000);
		System.out.println(alk);
		
		if (alk.FizetesHatar(200000, 290000)) System.out.println(alk.getNev()+" fizetese a hatarok koze esik");
		else System.out.println(alk.getNev()+"fizetese nem esik hatarok koze");
		if(alk2.FizetesHatar(200000, 260000)) System.out.println(alk2.getNev()+" fizetese a hatarok koze esik");
		else System.out.println(alk2.getNev()+"fizetese nem esik a hatarok koze");
	}

}

