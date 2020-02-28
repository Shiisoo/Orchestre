package orchestra;

public class Partition {
	private String p_name;
	private String p_tone;
	
	public Partition(String name, String tone) {
		this.p_name = name;
		this.p_tone = tone;
	}
	
	//GETTERS
	public String getName() {
		return p_name;
	}

	public String getTone() {
		return p_tone;
	}

	//SETTERS
	public void setName(String name) {
		this.p_name = name;
	}
	
	public void setTone(String tone) {
		this.p_tone = tone;
	}
}
