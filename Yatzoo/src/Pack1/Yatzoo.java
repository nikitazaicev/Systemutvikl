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
		finale();
		skanner.close();
	}

	private void finale() {
		resultBlokk.skrivUtVinnere();
	}

	/**
	 * spiller 12 runder
	 */
	private void spillSpill() {
		for (currentRound = 0; currentRound < 12; currentRound++) {
			System.out.println("Round " + (currentRound + 1) + " fight");
			spillRunde(currentRound);
		}
	}

	/**
	 * spiller er runde for alle spillere iterativt
	 * 
	 * @param currentRound
	 */
	private void spillRunde(int currentRound) {
		for (int i = 0; i < antallSpillere; i++) {
			System.out.println("Spiller nr " + (i + 1) + " klar? (Round:" + (currentRound + 1) + ")");

			String svar = skanner.nextLine();
			if (!svar.equals("ja") && !svar.equals("Ja") && !svar.equals("JA")) {
				System.out.println("We dont care");
			}

			Terning[] tab = trillTerninger();

			skrivUtKast(tab);

			tab = reRoll(tab);

			resultBlokk.lagre(currentRound, i, tab);// i er spillerNR

			visResultat();

		}
	}

	/**
	 * @param tab tabell med 5 trillet terninger
	 * @return tabell med 5 terninger etter at spiller har valg alt han ville ha
	 */
	private Terning[] reRoll(Terning[] tab) {
		Terning[] ferdigTab = new Terning[5];
		int antall = 0;
		for (int i = 2; i > 0; i--) {// 2 forsøk

			System.out.println("Reroll? " + i + " igjen (ja/nei)");
			String svar = skanner.nextLine();
			if (svar.equals("ja")) {

				System.out.println("Hva vil du beholde? (snek/pig etc.) " + i + "rerolls igjen.");
				svar = skanner.nextLine().toUpperCase();

				for (int j = 0; j < tab.length; j++) { // legger inn i ferdigTab oppgitte terninger
					if (svar.contains(tab[j].getDyr().name())) {
						ferdigTab[antall] = new Terning(tab[j].getDyr().name());
						antall++;
					}
				}
				System.out.println(antall + " terninger lagret. Neste kast: ");
				if (antall == 5) { // hvis man sier han vil beholde alt etter reroll (dumt men kan skje)
					return ferdigTab;
				}
				tab = trillTerninger(5 - antall);// triller resten (de som var ikke valgt )
				skrivUtKast(tab);
			} else {// svarer nei avslutter loopen
				i = 0;
			}
		}
		for (Terning t : tab) { // fyller opp resten av ferdigTab med de siste kastene
			ferdigTab[antall] = t;
			antall++;
		}
		skrivUtKast(ferdigTab);
		return ferdigTab;
	}

	/**
	 * viser resultat blokk hvis man svarer "ja"
	 */
	private void visResultat() {
		System.out.println("Oversikt? (ja/nei)");
		String svar = skanner.nextLine();
		if (svar.equals("ja")) {
			resultBlokk.skrivUt();
		}
	}

	/**
	 * skriver ut resultat av alle terningkast dyr og verdi
	 * 
	 * @param terningTab
	 */
	public void skrivUtKast(Terning[] terningTab) {
		System.out.println("Dyr:   Verdi");
		for (Terning t : terningTab) {
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
