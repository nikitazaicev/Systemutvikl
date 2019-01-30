package Pack1;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * 
 * @author 
 *
 */
public class ResultatBlokk {
	
	private int[][] blokk;
	private PoengTeller pt;
	
	public ResultatBlokk(int antallSpillere) {
		blokk = new int[12][antallSpillere];
		pt = new PoengTeller();
	}
	/**
	 * regner ut poeng med regnUtPoeng metoden
	 * @param rundeNr
	 * @param spillerNr
	 * @param tab tabell med 5 terninger 
	 */
	public void lagre(int rundeNr, int spillerNr, Terning[] tab) {
		int poeng = pt.regnUtPoeng(rundeNr, tab);
		blokk[rundeNr][spillerNr]=poeng;
	}
	
	public void skrivUtVinnere() {
		int[] tab = pt.resultater(blokk, blokk[0].length);
		for(int i=0;i<tab.length;i++) {
			System.out.println("Spiller nummer "+ (i+1) + 
								" fikk totalt: "+tab[i]+" poeng");
		}
	}
	/**
	 * skriver ut hele resultatblokken	
	 */
	public void skrivUt() { 
		String poeng = " ";
		for(int i = 0; i<blokk.length;i++) {
			for(int j = 0; j<blokk[i].length;j++) {
				poeng = poeng+ " " + blokk[i][j];
			}
				poeng = poeng + " \n ";
		}
		
		System.out.println(poeng);
		
	}
}
