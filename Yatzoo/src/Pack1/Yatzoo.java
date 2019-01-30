package Pack1;

import java.util.Scanner;

import PackMedInfo.Dyr;

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

	/**
	 * @param antall terninger
	 * @return tebell med terning objekter
	 */
	public Terning[] trillTerninger(int antall) {
		Terning[] resultTabT = new Terning[antall];
		for (int i = 0; i < resultTabT.length; i++) {
			resultTabT[i] = new Terning().trill();
		}

		return resultTabT;
	}

	/**
	 * default triller 5 terninger
	 * 
	 * @return tebell med terning objekter
	 */
	public Terning[] trillTerninger() {
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
		for (currentRound = 0; currentRound < 12; currentRound++) {
			System.out.println("Round " + (currentRound + 1) + " fight");
			spillRunde(currentRound);
		}
	}

	private void spillRunde(int currentRound) {
		for (int i = 0; i < antallSpillere; i++) {
			System.out.println("Spiller nr " + (i + 1) + " klar?");

			String svar = skanner.nextLine();
			if (!svar.equals("ja") && !svar.equals("Ja") && !svar.equals("JA")) {
				System.out.println("We dont care");
			}

			Terning[] tab = trillTerninger();

			skrivUtKast(tab);

			tab=reRoll(tab);

			resultBlokk.lagre(currentRound, i, tab);// i er spillerNR

			visResultat();

		}
	}

	private Terning[] reRoll(Terning[] tab) {
		Terning[] ferdigTab = new Terning[5];
		
		for (int i = 2; i > 0; i--) {

			System.out.println("Reroll? " + i + " igjen (ja/nei)");
			String svar = skanner.nextLine();
			if (svar.equals("ja")) {

				System.out.println("Hva vil du beholde? (snek/pig etc.) " + i + "rerolls igjen.");
				svar = skanner.nextLine().toUpperCase();
				int antall = 0;
				for (int j = 0; j < tab.length; j++) {
					if (svar.contains(tab[j].getDyr().name())&&ferdigTab[j]==null) {
						ferdigTab[j] = new Terning(svar);
						antall++;
					}
				}
				System.out.println(antall);
				tab = trillTerninger(5-antall);
				skrivUtKast(tab);
			} else {
				int ledig = 0;
				for(Terning t : tab){
					ledig = 0;
					while(ferdigTab[ledig]!=null) {
						ledig++;
					}
					ferdigTab[ledig]=t;
					ledig++;
				}
				i = 0;
			}
		}
		skrivUtKast(ferdigTab);
		return ferdigTab;
	}

	private void visResultat() {
		System.out.println("Oversikt? (ja/nei)");
		String svar = skanner.nextLine();
		if (svar.equals("ja")) {
			resultBlokk.skrivUt();
		}
	}

	public void skrivUtKast(Terning[] terningTab) {
		System.out.println("Dyr:   Verdi");
		for(Terning t : terningTab) {
		System.out.println(t.dyr + "\t" + t.verdi);
		}
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
