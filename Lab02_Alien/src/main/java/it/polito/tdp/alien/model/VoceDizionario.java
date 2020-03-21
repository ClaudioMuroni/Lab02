package it.polito.tdp.alien.model;

public class VoceDizionario {
	
	String alienWord, italianWord;

	public VoceDizionario(String alienWord, String italianWord) {
		super();
		this.alienWord = alienWord;
		this.italianWord = italianWord;
	}

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public String getItalianWord() {
		return italianWord;
	}

	public void setItalianWord(String italianWord) {
		this.italianWord = italianWord;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VoceDizionario other = (VoceDizionario) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return alienWord+" = "+italianWord+"\n";
	}
	
	

}
