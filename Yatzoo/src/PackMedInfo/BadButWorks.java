package PackMedInfo;

public class BadButWorks {
	/*
	private Terning[] reRoll(Terning[] tab) {
		Terning[] ferdigTab = new Terning[5];
		int antall = 0;
		for (int i = 2; i > 0; i--) {// 2 forsøk

			System.out.println("Reroll? " + i + " igjen (ja/nei)");
			String svar = skanner.nextLine();
			if (svar.equals("ja")) {

				System.out.println("Hva vil du beholde? (snek/pig etc.) " + i + "rerolls igjen.");
				svar = skanner.nextLine().toUpperCase();

				for (int j = 0; j < tab.length; j++) {
					if (svar.contains(tab[j].getDyr().name()) && ferdigTab[j] == null) {
						ferdigTab[j] = new Terning(tab[j].getDyr().name());
						antall++;
					}
				}
				System.out.println(antall + " terninger lagret. Neste kast: ");
				if (antall == 5) { // hvis man sier han vil beholde alt etter reroll altså hvis man gjør det man ikke skal
					return ferdigTab;
				}
				tab = trillTerninger(5 - antall);
				skrivUtKast(tab);
			}
			if (svari == 1 || i == 0) {// etter 1. reroll og 2. reroll skal bare ferdigtab fylles opp med rerollene man vil beholde 
				int ledig = 0;
				for (Terning t : tab) {
					ledig = 0;
					while (ferdigTab[ledig] != null) {
						ledig++;
					}
					ferdigTab[ledig] = t;
					ledig++;
				}
				if (!svar.equals("ja")) {// hvis man ikke vil rerolle etter første reroll
					i = 0;
				}
			}
		}

		skrivUtKast(ferdigTab);
		return ferdigTab;
	}
	*/
}
