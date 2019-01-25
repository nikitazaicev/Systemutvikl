package PackMedInfo;

public enum Dyr {
LION(1),
SNEK(2),
PANDA(3),
PIG(4),
ELEPHANT(5),
WHALE(6);
	
private int verdi;		

 Dyr(int verdi) {
	 this.verdi = verdi;
}

public int getVerdi() {
	return verdi;
}

public void setVerdi(int verdi) {
	this.verdi = verdi;
} 
 
}
