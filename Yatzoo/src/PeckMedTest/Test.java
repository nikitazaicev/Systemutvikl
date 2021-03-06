package PeckMedTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;

import Pack1.PoengTeller;
import Pack1.Terning;

class Test {
	
	PoengTeller pt = new PoengTeller();
	Terning[] tab = new Terning[5];
	
	@Before
	void before() {
		
	}
	
	@org.junit.jupiter.api.Test
	void testFerfigSum() {
		
	}
	@org.junit.jupiter.api.Test
	void testRunde12() {
		tab[0] = new Terning("lion");
		tab[1] = new Terning("lion");
		tab[2] = new Terning("lion");
		tab[3] = new Terning("lion");
		tab[4] = new Terning("lion");
		assertEquals(10, pt.regnUtPoeng(11, tab));
	}
	@org.junit.jupiter.api.Test
	void testRunde11() {
		tab[0] = new Terning("snek");
		tab[1] = new Terning("lion");
		tab[2] = new Terning("elefant");
		tab[3] = new Terning("panda");
		tab[4] = new Terning("whale");
		
		assertEquals(5, pt.regnUtPoeng(10, tab));
	}
	@org.junit.jupiter.api.Test
	void testRunde10() {
		tab[0] = new Terning("snek");
		tab[1] = new Terning("snek");
		tab[2] = new Terning("whale");
		tab[3] = new Terning("snek");
		tab[4] = new Terning("whale");
		assertEquals(5, pt.regnUtPoeng(9, tab));
	}
	@org.junit.jupiter.api.Test
	void testRunde9() {
		tab[0] = new Terning("snek");
		tab[1] = new Terning("snek");
		tab[2] = new Terning("whale");
		tab[3] = new Terning("snek");
		tab[4] = new Terning("whale");
		
		assertEquals(4, pt.regnUtPoeng(8, tab));
	}
	@org.junit.jupiter.api.Test
	void testRunde8() {
		tab[0] = new Terning("snek");
		tab[1] = new Terning("snek");
		tab[2] = new Terning("snek");
		tab[3] = new Terning("snek");
		tab[4] = new Terning("whale");
		
		assertEquals(4, pt.regnUtPoeng(7, tab));
		
	}
	@org.junit.jupiter.api.Test
	void testRunde7() {
		
		tab[0] = new Terning("snek");
		tab[1] = new Terning("snek");
		tab[2] = new Terning("whale");
		tab[3] = new Terning("snek");
		tab[4] = new Terning("whale");
		
		assertEquals(3, pt.regnUtPoeng(6, tab));
		
	}
	@org.junit.jupiter.api.Test
	void testRunde1til6() {
		tab[0] = new Terning("snek");
		tab[1] = new Terning("panda");
		tab[2] = new Terning("whale");
		tab[3] = new Terning("snek");
		tab[4] = new Terning("lion");
		
		assertEquals(1, pt.regnUtPoeng(0, tab));
		assertEquals(2, pt.regnUtPoeng(1, tab));
		assertEquals(1, pt.regnUtPoeng(2, tab));
		assertEquals(0, pt.regnUtPoeng(3, tab));
		assertEquals(0, pt.regnUtPoeng(4, tab));
		assertEquals(1, pt.regnUtPoeng(5, tab));
	}
	@org.junit.jupiter.api.Test
    void testSpillerPoeng() {
        int[][] blokk = new int[12][5];
        blokk[0][0] = 1;
        blokk[0][1] = 2;
        blokk[0][2] = 69;
        blokk[0][3] = 4;
        blokk[0][4] = 0;
        blokk[1][0] = 5;
        int[] riktig = new int[5];
        riktig[0] = 6;
        riktig[1] = 2;
        riktig[2] = 69;
        riktig[3] = 4;
        riktig[4] = 0;
        int[] innsett = pt.resultater(blokk, 5);

        assertNotEquals(1, pt.spillerPoeng(blokk, 0));
        assertEquals(6, pt.spillerPoeng(blokk, 0));
        assertEquals(2, pt.spillerPoeng(blokk, 1));

        for(int i = 0; i < riktig.length; i++) {
            assertEquals(riktig[i], innsett[i]);
        }

    }
	

}