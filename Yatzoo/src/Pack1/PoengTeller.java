package Pack1;

public class PoengTeller {
	/**
	 * Kontrollerer hvilke regler skal bruker i denne runden
	 * 
	 * @param tab     tabell med terninger
	 * @param rundeNr
	 * @return poeng
	 */
	public int regnUtPoeng(int rundeNr, Terning[] tab) {
		int tall = rundeNr + 1;
		switch (tall) {
		case 1:
			return Runde1(tab, tall);
		case 2:
			return Runde1(tab, tall);
		case 3:
			return Runde1(tab, tall);
		case 4:
			return Runde1(tab, tall);
		case 5:
			return Runde1(tab, tall);
		case 6:
			return Runde1(tab, tall);
		case 7:
			return Runde7(tab);
		case 8:
			return Runde8(tab);
		case 9:
			return Runde9(tab);
		case 10:
			return Runde10(tab);
		case 11:
			return Runde11(tab);
		case 12:
			return Runde12(tab);
		default:
			return 0;
		}
	}

	/**
	 * YATZOO
	 * 
	 * @param tab
	 * @return poeng
	 */

	private int Runde12(Terning[] tab) {
		int poeng = 0;
		int[] count = new int[6];

		for (Terning t : tab) {
			count[t.getVerdi() - 1]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] == 5) {
				poeng = 10;
			}
		}

		return poeng;
	}

	/**
	 * 4 ULIKE
	 * 
	 * @param tab
	 * @return poeng
	 */

	private int Runde11(Terning[] tab) {
		int[] count = new int[6];
		int poeng = 5;

		for (Terning t : tab) {
			count[t.getVerdi() - 1]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] > 1) {
				poeng = 0;
			}
		}

		return poeng;
	}

	/**
	 * HUS ELLER 2 + 3 LIKE
	 * 
	 * @param tab
	 * @return poeng
	 */
	private int Runde10(Terning[] tab) {
		int poeng = 0;
		int par = 0;
		int treLike = 0;
		int[] count = new int[6];

		for (Terning t : tab) {
			count[t.getVerdi() - 1]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] == 2) {
				par++;
			} else if (count[i] == 3) {
				treLike++;
			}
		}

		if (par == 1 && treLike == 1) {
			poeng = 5;
		}

		return poeng;
	}

	/**
	 * 2 PAR
	 * 
	 * @param tab
	 * @return poeng
	 */

	private int Runde9(Terning[] tab) {
		int[] count = new int[6];
		int par = 0;
		int poeng = 0;

		for (Terning t : tab) {
			count[t.getVerdi() - 1]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] >= 2) {
				par++;
			}
			if (count[i] >= 4) {
				par = 2;
			}
		}
		if (par >= 2) {
			poeng = 4;
		}
		return poeng;
	}

	/**
	 * 4 LIKE
	 * 
	 * @param tab
	 * @return poeng
	 */

	private int Runde8(Terning[] tab) {
		int poeng = 0;
		int test = 0;
		for (int j = 0; j < tab.length; j++) {
			for (int i = 0; i < tab.length; i++) {
				if (tab[i].verdi == j + 1) {
					test++;
				}
				if (test >= 4) {
					poeng = 4;
					i = tab.length;
					j = tab.length;
				}
			}
			test = 0;
		}
		return poeng;
	}

	/**
	 * 3 LIKE
	 * 
	 * @param tab
	 * @return poeng
	 */

	private int Runde7(Terning[] tab) {
		int poeng = 0;
		int test = 0;
		for (int j = 0; j < tab.length; j++) {
			for (int i = 0; i < tab.length; i++) {
				if (tab[i].verdi == j + 1) {
					test++;
				}
				if (test >= 3) {
					poeng = 3;
					i = tab.length;
					j = tab.length;
				}
			}
			test = 0;
		}
		return poeng;
	}

	/**
	 * Poeng for dyr runde 1 til 6
	 * 
	 * @param tab, rundeNr
	 * @return poeng
	 */

	private int Runde1(Terning[] tab, int rundeNr) {
		int poeng = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].verdi == (rundeNr)) {
				poeng++;
			}
		}
		return poeng;
	}
/**
 * 
 * @param blokk
 * @param spillerNr
 * @return poeng summen til en spiller
 */
	public int spillerPoeng(int[][] blokk, int spillerNr) {
		int poengsum = 0;

		for (int i = 0; i < 12; i++) {

			poengsum = poengsum + blokk[i][spillerNr];

		}

		return poengsum;
	}
/**
 * 
 * @param blokk
 * @param antSpillere
 * @return tabell med poengsummene av alle spillere
 */
	public int[] resultater(int[][] blokk, int antSpillere) {
		int[] resultat = new int[antSpillere];
		for (int i = 0; i < antSpillere; i++) {
			resultat[i] = spillerPoeng(blokk, i);
		}
		return resultat;
	}
}