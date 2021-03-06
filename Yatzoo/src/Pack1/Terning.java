package Pack1;

import java.util.Random;

import PackMedInfo.Dyr;

public class Terning {

	public int verdi;
	public Dyr dyr;

	public Terning() {
		super();
		this.verdi = 0;
		this.dyr = Dyr.values()[verdi];

	}
/**
 * lager ny terning
 * @param animal konverterer string til enum
 * 
 */
	public Terning(String animal) {
		this.dyr = Dyr.valueOf(animal.toUpperCase());
		this.verdi = dyr.getVerdi();
	}
/**
 * Triller en terning
 * @return int in range from 1 to 6
 */
	public Terning trill() {
		Random rng = new Random();
		verdi = rng.nextInt(6) + 1;
		setDyr(verdi);
		return this;
	}

	@Override
	public String toString() {
		return "Terning [verdi=" + verdi + ", dyr=" + dyr + "]";
	}

	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}

	public Dyr getDyr() {
		return dyr;
	}

	public void setDyr(int verdi) {
		this.dyr = Dyr.values()[verdi - 1];
	}

}
