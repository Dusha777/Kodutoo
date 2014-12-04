package pack1;

public class Lugu {

	public static void main(String[] args) throws Exception{
		KolmkolaC chordC=new KolmkolaC(0);
		chordC.printKolmkola();
		chordC.printKolmkolaT();
		Thread.sleep(1000);
		KolmkolaF chordF=new KolmkolaF(0);
		chordF.printKolmkola();
		chordF.printKolmkolaT();
		Thread.sleep(1000);
		KolmkolaG chordG=new KolmkolaG(0);
		chordG.printKolmkola();
		chordG.printKolmkolaT();
		Thread.sleep(1000);

	}

	

}
