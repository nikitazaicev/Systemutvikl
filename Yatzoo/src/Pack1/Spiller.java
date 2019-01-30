package Pack1;

public class Spiller {
	String navn;
	int spillerNr;
	int currentScore;
	

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getSpillerNr() {
		return spillerNr;
	}

	public void setSpillerNr(int spillerNr) {
		this.spillerNr = spillerNr;
	}

	public int getCurrentScore() {
		return currentScore;
	}

	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}

	@Override
	public String toString() {
		return "Spiller [navn=" + navn + ", spillerNr=" + spillerNr + ", currentScore=" + currentScore + "]";
	}

}
