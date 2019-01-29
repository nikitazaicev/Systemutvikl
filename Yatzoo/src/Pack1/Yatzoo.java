package Pack1;

import java.util.Scanner;

public class Yatzoo {
	
	public int antallSpillere;
	public int currentRound;
	
	public ResultatBlokk resultBlokk;

	
	Scanner skanner = new Scanner(System.in);

	public Yatzoo(int antallSpillere) {
		this.antallSpillere = antallSpillere;
		this.currentRound = 0;
		
		this.resultBlokk = new ResultatBlokk(antallSpillere);
	}

	public Terning[] trillTerning() {
		Terning[] resultTabT = new Terning[5];
		for (int i = 0; i < resultTabT.length; i++) {
			resultTabT[i] = new Terning().trill();
		}

		return resultTabT;
	}

	public void start() {
		spillSpill();		
	}

	private void spillSpill() {
		for(currentRound = 0; currentRound < 12; currentRound++) {
			System.out.println("Round "+(currentRound+1)+" fight");
			spillRunde(currentRound);
		}
	}

	private void spillRunde(int currentRound) {
		for(int i = 0; i<antallSpillere;i++) {
			System.out.println("Spiller nr "+(i+1)+" klar?");
			
			String svar = skanner.nextLine();
			if(!svar.equals("ja")||!svar.equals("Ja")||!svar.equals("Ja")) {
				System.out.println("We dont care");
			}
			
			Terning[] tab = trillTerning();
			
			resultBlokk.lagre(currentRound, i, tab);//i er spillerNR			
			skrivUtKast(tab);
			System.out.println("Oversikt? (ja/nei)");
			svar = skanner.nextLine();
			if(svar.equals("ja")) {
				resultBlokk.skrivUt();
			}
		}
	}
	
	public void skrivUtKast(Terning[] terningTab) {
		Terning[] tab = terningTab;
		System.out.println("Dyr:       Verdi");
		System.out.println(tab[0].dyr+"\t"+tab[0].verdi);
		System.out.println(tab[1].dyr+"\t"+tab[1].verdi);
		System.out.println(tab[2].dyr+"\t"+tab[2].verdi);
		System.out.println(tab[3].dyr+"\t"+tab[3].verdi);
		System.out.println(tab[4].dyr+"\t"+tab[4].verdi);
	}
	

	public int getAntallSpillere() {
		return antallSpillere;
	}

	public void setAntallSpillere(int antallSpillere) {
		this.antallSpillere = antallSpillere;
	}

	public int getCurrentRound() {
		return currentRound;
	}

	public void setCurrentRound(int currentRound) {
		this.currentRound = currentRound;
	}

}
