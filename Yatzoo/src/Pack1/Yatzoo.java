package Pack1;

public class Yatzoo {
	
	public int antallSpillere;
	public int currentRound;

	public Terning[] trillTerning() {
		Terning[] resultTabT = new Terning[5];
		Integer[] resultTab = new Integer[5];
		for (int i = 0; i < resultTab.length; i++) {
			resultTabT[i] = new Terning().trill();
		}

		return resultTabT;
	}

	public void start(int antallSpillere) {
		for(currentRound = 0; currentRound < 12; currentRound++) {
			
			for(int spillerNr=0; spillerNr < antallSpillere; spillerNr++ ) {
				
			} 
		}//#beta
		
		setAntallSpillere(antallSpillere);
		Terning[] tab = trillTerning();
		System.out.println("Dyr:       Verdi");
		System.out.println(tab[0].dyr+"      "+tab[0].verdi);
		System.out.println(tab[1].dyr+"      "+tab[1].verdi);
		System.out.println(tab[2].dyr+"      "+tab[2].verdi);
		System.out.println(tab[3].dyr+"      "+tab[3].verdi);
		System.out.println(tab[4].dyr+"      "+tab[4].verdi);
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
