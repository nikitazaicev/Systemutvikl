package Pack1;

import PackMedInfo.Dyr;

public class PoengTeller {
	public int regnUtPoeng(int rundeNr, Terning[] tab) {
		int runde = rundeNr+1;
		switch(runde) {
			case 1:
				return Runde1(tab,runde);
			case 2:
				return Runde1(tab,runde);
			case 3:
				return Runde1(tab,runde);
			case 4:
				return Runde1(tab,runde);
			case 5:
				return Runde1(tab,runde);
			case 6:
				return Runde1(tab,runde);
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
		int[] count = new int[6];
		Dyr[] dyr = Dyr.values();
		for(Terning t : tab) {
			count[t.getVerdi()]++;
		}
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
			int poeng=0;
			for(int i = 0; i < tab.length; i++) {
				if(tab[i].verdi==(rundeNr)) {
					poeng++;
				}
		}
		return poeng;
	}
}
