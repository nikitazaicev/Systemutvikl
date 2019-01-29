package Pack1;

public class PoengTeller {
	public int regnUtPoeng(int rundeNr, Terning[] tab) {
		switch(rundeNr) {
			case 1:
				return Runde1(tab,rundeNr);
			case 2:
				return Runde1(tab,rundeNr);
			case 3:
				return Runde1(tab,rundeNr);
			case 4:
				return Runde1(tab,rundeNr);
			case 5:
				return Runde1(tab,rundeNr);
			case 6:
				return Runde1(tab,rundeNr);
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
			default: return 0;
		}
	}

	private int Runde12(Terning[] tab) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int Runde11(Terning[] tab) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int Runde10(Terning[] tab) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int Runde9(Terning[] tab) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int Runde8(Terning[] tab) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int Runde7(Terning[] tab) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int Runde1(Terning[] tab, int rundeNr) {
		
			for(int j = 0; j < tab.length; j++) {
				if(tab[j].verdi == rundeNr) {
					
				}
		}
		return 0;
	}
}
