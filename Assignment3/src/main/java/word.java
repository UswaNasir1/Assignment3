
public class word extends Thread {
	public String word;
	public int frequency;
	
	public word(String input, int i) {
		word = input;
		frequency = i;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
}