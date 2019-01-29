package Pack1;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ResultatBlokk {
	
	int[][] blokk;
	public PoengTeller pt;
	
	public ResultatBlokk(int antallSpillere) {
		blokk = new int[12][antallSpillere];
		pt = new PoengTeller();
	}
	
	public void lagre(int rundeNr, int spillerNr, Terning[] tab) {
		int poeng = pt.regnUtPoeng(rundeNr+1, tab);
		blokk[rundeNr][spillerNr]=poeng;
	}
	
	public void skrivUt() { 
		String poeng = "";
		for(int i = 0; i<blokk.length;i++) {
			for(int j = 0; j<blokk[i].length;j++) {
				poeng = poeng+ " " + blokk[i][j];
			}
				poeng = poeng + " \n ";
		}
		System.out.println(poeng);
		
	}

}
