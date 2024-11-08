package vectorWithCmdLines;

public class CharFreq { 
	
	private char letter;
	private int frequency;
	
	public CharFreq(char c) {
		this.letter = c;
		this.frequency = 0; 
		
	}
	
	public char getCharacter() {
		return letter;
	}
	
	public void setCharacter(char c) {
		this.letter = c;
	}
	
	public int getFrequency() {
		return frequency;
	}
	
	public void setFrequency(int f) {
		this.frequency = f;
	}
	
	public void increment() {
		frequency++;
	}
	
	public boolean Equals(Object obj) {

        if (obj == this) {
            return true;
        }
        
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        
        CharFreq other = (CharFreq) obj;
        
        if (this.letter == other.letter) {
            return true;
        } else {
            return false;
        }
    }

    public String ToString() {
        String output =  this.letter + "(" + (int)this.letter + ") " + this.frequency;
        return output;
    }
}
